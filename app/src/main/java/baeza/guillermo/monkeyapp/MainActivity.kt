package baeza.guillermo.monkeyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import baeza.guillermo.monkeyapp.ui.composable.MediaGridView
import baeza.guillermo.monkeyapp.ui.composable.MediaListView
import baeza.guillermo.monkeyapp.ui.composable.MediaListViewWithCustomControl
import baeza.guillermo.monkeyapp.ui.theme.MonkeyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MonkeyAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background)
                {
                    CustomNavigator()
                }
            }
        }
    }
}