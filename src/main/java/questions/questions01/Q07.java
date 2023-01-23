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

    }
/*
            The class has two instance variables, x and y,
            and a constructor that takes two int arguments, x and y.
            The constructor calls a private method called initialize,
            which assigns the square of the x argument to the x instance variable,
            and the square of the y argument to the y instance variable.
            The main method creates an instance of the Q07 class and
            assigns the value 3 to the x variable and 5 to the y variable.
            Then it calls the println method on the System.out object to print the value of x and y.
            The output of the program will be "3 5"
 */



}
