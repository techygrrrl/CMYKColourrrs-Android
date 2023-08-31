package stream.techygrrrl.cmykcolourrrs.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKBlack
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKBrrrightWhite
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKCerrrulean
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKColourrrsTheme
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKCrrrimson
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKDark100
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKDark200
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKDark300
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKDark400
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKDark500
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKGrrreen
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKGrrreenDarkrrr
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKHighliterrrYellow
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKHotPink
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKLavendrrr
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKLight100
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKLight200
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKLight300
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKLight400
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKLight500
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKPurrrple
import stream.techygrrrl.cmykcolourrrs.ui.theme.CMYKTangerrrine
import stream.techygrrrl.cmykcolourrrs.utils.copyToClipboard
import stream.techygrrrl.cmykcolourrrs.utils.hexString
import stream.techygrrrl.cmykcolourrrs.utils.showToast

@Composable
fun ColourrrPalette() {
    val context = LocalContext.current

    val colours = mapOf<String, Pair<Color, Color>>(
        "Hot Pink" to Pair(CMYKHotPink, CMYKBrrrightWhite),
        "Cerrrulean" to Pair(CMYKCerrrulean, CMYKBrrrightWhite),
        "Purrrple" to Pair(CMYKPurrrple, CMYKBrrrightWhite),
        "Grrreen" to Pair(CMYKGrrreen, CMYKBlack),
        "Grrreen Darkrrr" to Pair(CMYKGrrreenDarkrrr, CMYKBrrrightWhite),
        "Highliterrr Yellow" to Pair(CMYKHighliterrrYellow, CMYKBlack),
        "Tangerrrine" to Pair(CMYKTangerrrine, CMYKBrrrightWhite),
        "Crrrimson" to Pair(CMYKCrrrimson, CMYKBrrrightWhite),
        "Lavendrrr" to Pair(CMYKLavendrrr, CMYKBlack),

        "CMYK Black" to Pair(CMYKBlack, CMYKBrrrightWhite),
        "Brrright White" to Pair(CMYKBrrrightWhite, CMYKBlack),

        "Dark 100" to Pair(CMYKDark100, CMYKBrrrightWhite),
        "Dark 200" to Pair(CMYKDark200, CMYKBrrrightWhite),
        "Dark 300" to Pair(CMYKDark300, CMYKBrrrightWhite),
        "Dark 400" to Pair(CMYKDark400, CMYKBrrrightWhite),
        "Dark 500" to Pair(CMYKDark500, CMYKBrrrightWhite),

        "Light 100" to Pair(CMYKLight100, CMYKBlack),
        "Light 200" to Pair(CMYKLight200, CMYKBlack),
        "Light 300" to Pair(CMYKLight300, CMYKBlack),
        "Light 400" to Pair(CMYKLight400, CMYKBlack),
        "Light 500" to Pair(CMYKLight500, CMYKBlack),
    )

    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        colours.entries.map { (k, v) ->
            val (bg, fg) = v

            Button(
                shape = RectangleShape,
                contentPadding = PaddingValues(0.dp),
                onClick = {
                    context.copyToClipboard(bg.hexString)
                    context.showToast("Colour '$k' copied to clipboard")
                }
            ) {
                ColourrrChip(
                    name = k,
                    colour = bg,
                    foregroundColour = fg
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColourrrPalettePreview() {
    CMYKColourrrsTheme {
        ColourrrPalette()
    }
}