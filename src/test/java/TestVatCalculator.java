
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
    public void test_Vat_UK(){
        assertEquals(120, cc.VAT_UK(100));
    }

    @Test
    public void test_Vat_SWE() { assertEquals( 125, cc.VAT_SWE(100)); }

    @Test
    public void test_Vat_SPN() { assertEquals( 121, cc.VAT_SPN(100)); }

    @Test
    public void test_Vat_IND() { assertEquals( 0, cc.VAT_IND(100)); }

    @Test
    public void test_Vat_RUS() { assertEquals( 120, cc.VAT_RUS(100)); }


}

//adding incorrect value to test the test case is pass/fail

//changes India russia commit
//added two new test cases

// this recording is about Test driven development in ST_final Project.
// first i am going to write the test case and then commit, push build in jenkins.
// committing and pushing the code with correct code....

// performing similar tasks for test cases 2 and test case 3.....!!