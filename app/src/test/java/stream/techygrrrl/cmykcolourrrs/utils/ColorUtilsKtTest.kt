package stream.techygrrrl.cmykcolourrrs.utils

import androidx.compose.ui.graphics.Color
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ColorUtilsKtTest {

    @Test
    fun hexString() {
        val subject = Color(0xFFEF15BF)

        val result = subject.hexString

        assertEquals("EF15BF", result)
    }
}