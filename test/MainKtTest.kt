import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.junit.Arquillian
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.Assert
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Test

@RunWith(Arquillian::class)
class MainKtTest {

    @Test
    fun sortOneElement(){
        val test = listOf(5)
        val result = sort(test)

        assertTrue(result == listOf(5))
    }

    @Test
    fun sortOdd() {
        val expected = listOf(-4,0,1,4,8,9,10,11,25)
        val test = expected.shuffled()
        println("test list: ${test}")
        val result = sort(test)

        println("result list ${result}")
        Assert.assertTrue(result == expected)
    }

    @Test
    fun sortEven() {
        val expected = listOf(-4,0,1,2,4,8,9,10,11,25)
        val test = expected.shuffled()
        println("test list: ${test}")
        val result = sort(test)

        println("result list ${result}")
        Assert.assertTrue(result == expected)
    }



}
