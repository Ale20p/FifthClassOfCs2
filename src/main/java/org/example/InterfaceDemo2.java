package org.example;

interface Test {
    void a();
    void b();
    void c();
}

abstract class Sample implements Test {
    public void b() {
        System.out.println("I am only implementing one method from the interface");
    }
}

class Engine extends Sample {

    @Override
    public void a() {
        System.out.println("I am doing dynamics here");
    }

    @Override
    public void c() {
        System.out.println("I am doing Engine here");
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        Test Plane = new Engine();
        Plane.a();
        Plane.b();
        Plane.b();
    }
}
