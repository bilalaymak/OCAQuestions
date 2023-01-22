package questions.inheritance.q1;

public class DVD extends CD{
    int c;
    DVD(int r, int c) {
        //line n1
        super(r);
        this.c = c;

    }

    @Override
    public String toString() {
        return "r: " + r + " c: " + c;
    }

    public static void main(String[] args) {
        DVD dvd = new DVD(10,20);
        System.out.println(dvd);
    }

    /*
    It defines the "CD" class with a single int field "r" and a constructor that initializes it,
    and the "DVD" class that extends "CD" and have an additional int field "c" and
    a constructor that also calls the superclass constructor and initializes the "c" field.
    It also overrides the toString() method in the DVD class to print out the value of the "r" and "c" fields,
    so that the System.out.println(dvd) will print the values of the fields.
     */

}



