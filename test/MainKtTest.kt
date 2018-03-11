import org.jboss.arquillian.junit.Arquillian
import org.junit.Assert
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

@RunWith(Arquillian::class)
class MainKtTest {

    private val test = IntArray(500000) { Random().nextInt(500) }.toList().toMutableList()

    @Test
    fun sortOneElement() {
        val test = listOf(5)
        val result = sort(test)

        assertTrue(result == listOf(5))
    }

    @Test
    fun sortOdd() {
        val expected = listOf(-4, 0, 1, 4, 8, 9, 10, 11, 25)
        val test = expected.shuffled().toMutableList()
        println("test list: $test")

        val result = sort(test)

        println("result list $result")
        Assert.assertTrue(result == expected)
    }

    @Test
    fun sortEven() {
        val expected = listOf(-4, 0, 1, 2, 4, 8, 9, 10, 11, 25)
        val test = expected.shuffled()
        println("test list: $test")
        val result = sort(test)

        println("result list $result")
        Assert.assertTrue(result == expected)
    }

    @Test
    fun bigList() {
        sort(test)
    }

}
