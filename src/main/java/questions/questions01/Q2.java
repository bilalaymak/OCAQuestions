package questions.questions01;

public class Q2 {

    //Q1:
    static int i; // static fields gets changed for every object
    int j;

    public static void main(String[] args) {

        Q2 q1 = new Q2();
        Q2 q2 = new Q2();
        q1.i  = 3;
        q1.j = 4;
        q2.i = 5;
        q2.j = 6;
        System.out.println(
                q1.i  + " " +   //5
                q1.j  + " " +   //4
                q2.i  + " " +   //5
                q2.j);          //6

        System.out.println("**************************************");

        //Q2 unnecessary usage of continue, there is no need to use continue here

        String[][] arr = { {"A","B","C"}, {"D","E"} };
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");//A B C D E
                if (arr[i][j].equals("B")){
                    continue;
                }
            }
            continue;
        }

        System.out.println("***************************");




    }
}
