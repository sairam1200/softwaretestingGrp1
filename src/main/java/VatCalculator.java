public class VatCalculator {
    public VatCalculator(){

    }
    public int VAT_UK(int uk){
        double rs1 = uk * 1.20;
        return (int) rs1;
    }
    public int VAT_SWE(int swe){
        double rs2 = swe *1.25;
        return( int) rs2;
    }
    public int VAT_SPN(int euro){
        double rs3 = euro * 1.21 ;
        return (int) rs3;
    }
    public int VAT_IND(int inr){
        double rs4 = inr * 1.18 ;
        return (int) rs4;
    }
    public int VAT_RUS(int rub){
        double rs5 = rub * 1.20 ;
        return (int) rs5;
    }
}




//added ind rus vat tax
//test cases updated









// no code is written for the test case 1.
//due to no code for test case 1 the build is failed.
// writing correct code for test case 1
// test case 2 with code and test case.
