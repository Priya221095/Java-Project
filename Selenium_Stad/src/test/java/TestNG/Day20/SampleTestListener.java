package TestNG.Day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestListener {
    @Test
    public void testPass(){
        Assert.assertTrue(true);
    }
    @Test
    public void testFail(){
        Assert.assertTrue(false);
    }
}
