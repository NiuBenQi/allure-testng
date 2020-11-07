package my.company;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

/**
 * @Author BenQi
 * @Date 2020/10/26 17:36
 * @Version 1.0
 */
public class simple2Test {

    @Test
    public void simpleTest() {
        step("step 1");
        step("step 2");
        Assert.assertEquals(1,1);
    }
}
