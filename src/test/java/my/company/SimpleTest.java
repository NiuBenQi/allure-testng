package my.company;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

/**
 * @author baev (Dmitry Baev)
 */
public class SimpleTest {

    @Test
    public void simpleTest() {
        step("step 1");
        step("step 2");
        Assert.assertEquals(1,1);
    }
}

