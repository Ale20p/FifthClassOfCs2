package org.example;

interface Printable {
    void print();
    static int cube(int x) {
        return x * x * x;
    }
}

interface Showable extends Printable{
    void show();

}

public class Interfacedemo1 implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void show() {
        System.out.println("Showing");
    }

    public static void main(String[] args) {
        Printable p = new Interfacedemo1();
        p.print();
        System.out.println(Printable.cube(10));
        Showable s = new Interfacedemo1();
        s.show();
    }
}