package stream.techygrrrl.cmykcolourrrs.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKBlack
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKBrrrightWhite
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKColourrrsTheme
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKHotPink
import stream.techygrrrl.cmykcolourrrs.utils.hexString


@Composable
fun ColourrrChip(
    name: String,
    colour: Color,
    foregroundColour: Color,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .background(colour)
            .padding(vertical = 40.dp)
    ) {
        Text(
            text = name,
            color = foregroundColour,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "#${colour.hexString}",
            color = foregroundColour,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ColourrrChipPreview() {
    CMYKColourrrsTheme {
        Column {
            ColourrrChip(
                name = "Hot Pink",
                colour = CMYKHotPink,
                foregroundColour = CMYKBrrrightWhite
            )
            ColourrrChip(
                name = "CMYK Black",
                colour = CMYKBlack,
                foregroundColour = CMYKBrrrightWhite
            )
            ColourrrChip(
                name = "Brrright White",
                colour = CMYKBrrrightWhite,
                foregroundColour = CMYKBlack
            )
        }
    }
}
