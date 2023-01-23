package questions.questions01;

public class Q03 {
    public static void main(String[] args) {

        int var1 = 200;
        System.out.print(doCalc(var1));//400 ==> prints the returned variable from doCalc() method
        System.out.print(" " + var1);//200   ==> prints the local variable

    }
    static int doCalc(int var1){
        var1 =  var1 * 2;
        return var1;
    }




}
