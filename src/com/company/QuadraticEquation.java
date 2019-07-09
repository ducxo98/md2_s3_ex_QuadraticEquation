package com.company;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta;
        delta = this.b* this.b -4*this.a * this.c;
        return delta;
    }
    public double getRoot1(){
        double r1;
        r1 = ((-b) + Math.sqrt(this.getDiscriminant()))/(2*a);
        return r1;
    }
    public double getRoot2(){
        double r2;
        r2 = ((-b) - Math.sqrt(this.getDiscriminant()))/(2*a);
        return r2;
    }
}
