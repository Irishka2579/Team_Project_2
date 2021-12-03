package com.company.TeamProject2.Task3;

public class Car {

    void calculateSalePrice(double carPrice,String color) {
        System.out.println("The price of the car after sale is " + 0.97 * carPrice + " and the color is " + color);
    }}

class Sedan extends Car{
int length;
void  calculateSalePrice(int length,double carPrice,String color){
    if(length>20){
        System.out.println("Return price with 5% discount and its will be "+0.95*carPrice +". The color is "+color);
    }else {
        System.out.println("Return price with 10% discount and its will be "+0.9*carPrice+". The color is "+color);
    }}}

class Truck extends Car{
     void calculateSalePrice(int weight,double carPrice,String color){
    if (weight>2000){
    System.out.println("Return price include 10% discount and its will be "+0.9*carPrice+". The color is "+color);
} else {
        System.out.println("Return price include 20% discount and its will be  "+0.8*carPrice+". The color is "+color);
    }}}

class Tester{
    public static void main(String[]args){
 Sedan sedan=new Sedan();
 sedan.calculateSalePrice(30,15000,"Silver");
 Truck truck=new Truck();
 truck.calculateSalePrice(3000,17000,"Golden");
    }
}