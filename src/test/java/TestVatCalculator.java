
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

//required packages imported
public class TestVatCalculator{
    private static VatCalculator cc;

    @BeforeClass
    public static void setup(){
        cc = new VatCalculator();
    }

    // test case 1
    @Test
    public void test_Vat_UK() { assertEquals(120, cc.VAT_UK(100)); }

    @Test
    public void test_Vat_SWE() { assertEquals( 125, cc.VAT_SWE(100)); }

    @Test
    public void test_Vat_SPN() { assertEquals( 121, cc.VAT_SPN(100)); }

    @Test
    public void test_Vat_IND() { assertEquals( 118, cc.VAT_IND(100)); }

    @Test
    public void test_Vat_RUS() { assertEquals( 12, cc.VAT_RUS(100)); }


}


//Doing some changes to get an error