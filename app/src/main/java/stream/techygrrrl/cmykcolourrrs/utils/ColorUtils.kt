package stream.techygrrrl.cmykcolourrrs.utils

import androidx.compose.ui.graphics.Color

val Color.hexString: String
    get() = value
        .toString(16)
        .substring(2..7)
        .uppercase()