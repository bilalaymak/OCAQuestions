package questions.inheritance.q2;

public class Car extends Vehicle{

    int y;
    Car(){
        super(10); // the second constructor calls the parent class constructor
        // using super and passing in the value of the parameter y
    }
    Car(int y){
        super(y);// this is second constructor ,
        // the second constructor calls the parent class constructor using super
        // and passing in the value of the parameter y
        this.y = y;
    }


    public String toString() {
        return super.x + " : " + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car(20);
        System.out.println(y);//20 : 20


    }
}
