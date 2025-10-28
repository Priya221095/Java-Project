package TestNG.Day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestReport {
    @Test
    public void reporterPass(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void reporterFail(){
        Assert.assertEquals(1,2);
    }
}
