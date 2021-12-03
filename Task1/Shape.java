package com.company.TeamProject2.Task1;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
    int r=5;
    int a=10;
}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println(3.14*r*r);}
    @Override
    public void calculatePerimeter() {
        System.out.println(2*3.14*r);}
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println(a*a);}
    @Override
    public void calculatePerimeter() {
        System.out.println(4*a);
    }}
class Tester {
    public static void main(String[]args){
        Shape shape1=new Circle();
        shape1.calculateArea();
        shape1.calculatePerimeter();

        Shape shape2=new Square();
        shape2.calculateArea();
        shape2.calculatePerimeter();
    }
}