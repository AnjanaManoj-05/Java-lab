import java.util.Scanner;
abstract class Shape{
double dim1,dim2;
Shape(double x,double y){
dim1=x;
dim2=y;
}
abstract double printArea();
}
class Rectangle extends Shape{
Rectangle(double a,double b){
super(a,b);
}
double printArea(){
System.out.print("Area of rectangle:");
return dim1*dim2;
}
}
class Triangle extends Shape{
Triangle(double a,double b){
super(a,b);
}
double printArea(){
System.out.print("Area of triangle:");
return 0.5*dim1*dim2;
}
}
class Circle extends Shape{
Circle(double a){
super(a,1);
}
double printArea(){
System.out.print("Area of Circle:");
return 3.14*dim1*dim1;
}
}

class week{
public static void main(String args[]){
double dim1,dim2;
System.out.println("Anjana Manoj");
System.out.println("1BM23CS038");
Scanner s=new Scanner(System.in);
System.out.println("Enter dimensions of rectangle(length and breadth):");
dim1=s.nextInt();
dim2=s.nextInt();
Rectangle r=new Rectangle(dim1,dim2);
System.out.println("Enter dimensions of triangle(base and height):");
dim1=s.nextInt();
dim2=s.nextInt();
Triangle t=new Triangle(dim1,dim2);
System.out.println("Enter dimensions of circle(radius):");
dim1=s.nextInt();
Circle c=new Circle(dim1);
System.out.println(r.printArea());
System.out.println(t.printArea());
System.out.println(c.printArea());


}
}
