package questions.inheritance.q2;

public class Example {
    int x;

    Example(int x) { //1. constructor
        this.x = x; // this assigns the value of the parameter x to the instance variable x
    }

    Example() { //2. constructor
        this(10); // this calls the constructor with the parameter x, and assigns the value 10 to x


        /*
        Here, in the first constructor,
        this.x = x; assigns the value of the parameter x to the instance variable x.
        And in the second constructor,
        this(10); calls the constructor with the parameter x and assigns the value 10 to x.

         this.x is used to access or assign a value to an instance variable,
         and this(x) is used to call another constructor of the same class with the passed argument x.
         */
    }
}
