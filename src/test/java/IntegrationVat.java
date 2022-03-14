import org.junit.Assert;
import org.junit.Test;

public class IntegrationVat {
    public static  VatCalculator cc;
    @Test

    public void addtestPassInt()
    {
        Assert.assertEquals(120, cc.VAT_UK(100));
        Assert.assertEquals(121, cc.VAT_SPN(100));
        Assert.assertEquals(118, cc.VAT_IND(100));
        Assert.assertEquals(125, cc.VAT_SWE(100));
        Assert.assertEquals(120, cc.VAT_RUS(100));
        Assert.assertEquals(120, cc.VAT_UK(100));


    }

}