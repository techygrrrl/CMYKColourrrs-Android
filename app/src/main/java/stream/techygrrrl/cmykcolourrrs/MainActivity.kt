package stream.techygrrrl.cmykcolourrrs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import stream.techygrrrl.cmykcolourrrs.components.ColourrrPalette
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKColourrrsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CMYKColourrrsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColourrrPalette()
                }
            }
        }
    }
}
