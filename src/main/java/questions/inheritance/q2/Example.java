package questions.inheritance.q2;

public class Example {
    int x;

    Example(int x) {
        this.x = x; // this assigns the value of the parameter x to the instance variable x
    }

    Example() {
        this(10); // this calls the constructor with the parameter x, and assigns the value 10 to x

    }
}
