import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.junit.Arquillian
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.Assert
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Test
import java.util.*

@RunWith(Arquillian::class)
class MainKt2Test {

    private val test = IntArray(500000) { Random().nextInt(500) }.toList().toMutableList();

    @Test
    fun sortOneElement(){
        val test = listOf(5).toMutableList()
        val result = sort2(test)

        assertTrue(result == listOf(5))
    }

    @Test
    fun sortOdd() {
        val expected = listOf(-4,0,1,4,8,9,10,11,25)
        val test = expected.shuffled().toMutableList()
        println("test list: ${test}")

        val result = sort2(test)

        println("result list ${result}")
        Assert.assertTrue(result == expected)
    }

    @Test
    fun sortEven() {
        val expected = listOf(-4,0,1,2,4,8,9,10,11,25)
        val test = expected.shuffled().toMutableList()
        println("test list: ${test}")
        val result = sort2(test)

        println("result list ${result}")
        Assert.assertTrue(result == expected)
    }

    @Test
    fun bigList(){
        val result = sort2(test);
    }


}
