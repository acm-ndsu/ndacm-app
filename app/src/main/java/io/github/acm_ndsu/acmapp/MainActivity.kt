package io.github.acm_ndsu.acmapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import io.github.acm_ndsu.acmapp.ui.theme.ACMTheme
import kotlinx.coroutines.flow.*

/**
 * Used as a state holder for the MainActivity
 */
class PageView(page: Int): ViewModel() {

    //expose page variable
    private val _pageState = MutableStateFlow(page) //holds actual value
    val page: StateFlow<Int> = _pageState.asStateFlow() //exposes getter state object
    fun updatePage(page: Int) = _pageState.update { page } //used to set value
}

/**
 * Activity Declaration
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ACMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    /**
                     * calls to composable that handles all logic to avoid
                     * nesting more braces
                     */
                    Main()
                }
            }
        }
    }
}

/**
 * Page class to combine NavBarItems and Page content.
 */
data class Page(
    val content: @Composable () -> Unit,
    val icon:    @Composable () -> Unit,
    val label:   @Composable () -> Unit,
)

/**
 * Handles UI and logic for the whole app
 *
 * Does not need any parameters, but can be overridden
 * by providing starting page.
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main(modifier: Modifier = Modifier,
         pageView: PageView = PageView(0)
) {
    //gets current page as a state object
    val currentPage by pageView.page.collectAsState()

    /**
     * creates the list of all the pages
     * to render.
     */
    val pages: List<Page> = listOf(
        Page(
            content = {Page1()},
            icon = { Icon(Icons.Filled.List, contentDescription = "Bottom Icon $currentPage") },
            label = { Text("Page 1") }
        ),
    )

    /**
     * Formats the Screen
     */
    Scaffold(modifier,
        content = {
            pages[currentPage].content.invoke()
        },
        bottomBar = {
            NavBar(modifier = Modifier, items = pages, currentPage = currentPage, pageView)
        },
    )
}

// wrapper for the navbar composable
@Composable
fun NavBar(modifier: Modifier = Modifier, items: List<Page>, currentPage: Int, pageView: PageView) {
        NavigationBar(modifier) {
            items.forEachIndexed { i, item ->
                NavigationBarItem(
                    icon = item.icon,
                    label = item.label,
                    selected = i == currentPage,
                    onClick = { pageView.updatePage(i) }
                )
            }
        }
}