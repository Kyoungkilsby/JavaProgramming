package day25_Constructions;

public class Rectangle {

    public double length, width;//i want

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }//constructor
     /* public void setInfo(double length, double width){
    this.length=length;
    this.width=width;

     */


    public double area() {

        return length * width;
    }

    public String toString() {
        return "day25_Constructions.Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }

}