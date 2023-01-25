package questions.questions01;


public class Q07 {
    int x,y;
    public Q07(int x, int y){
        initialize(x,y);
    }

    /*
    The initialize() method is used to separate the initialization logic of the class from the constructor.
    This can make the code more readable and maintainable,
    as it allows the developer to encapsulate the logic of initializing the object's state in a separate method.
    It also provides flexibility, as the same initialization logic can be reused in different constructors or methods,
    without having to duplicate the code. Additionally, by making the method private,
    it prevents the object's state from being modified by any code outside of the class,
    which can help to maintain the integrity of the object's state.
     */
    private void initialize(int x, int y) {
        this.x = x*x;
        this.y = y*y;
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        Q07 obj = new Q07(x,y);
        System.out.println(x + " " + y);//3 5 prints the local variables
        //If you want to print the instance variables, you need to call them by obj.x and obj.y
    }
/*
         In the code you've provided, you have defined a class called Q07 that has two private instance variables,
         x and y, as well as a constructor that takes in two integer arguments, x and y, and calls the initialize method.
         The initialize method takes in two integer arguments, x and y,
         and sets the instance variables x and y equal to the squares of the input arguments.
         In the main method,
         you are creating a new instance of Q07 called obj and passing in the local variables x and y,
         which are set to 3 and 5 respectively.
         The constructor is called and the initialize method is called with the arguments x and y as input,
         so the instance variables x and y of the obj are set to 9 and 25.
         Then you are printing out the value of local variables x and y which are 3 and 5.
         The instance variables of the obj are not being printed.
         If you want to print the instance variables, you need to call them by obj.x and obj.y.
 */



}
