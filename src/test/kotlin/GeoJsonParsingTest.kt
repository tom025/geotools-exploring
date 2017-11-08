import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class GeoJsonParsingTest {
    @Test
    fun `true is true`() {
        assertThat(true, `is`(true))
    }
}