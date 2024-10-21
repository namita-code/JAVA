
abstract class Shape{
      int x;
      int y;
      Shape(int a,int b){
            x=a;
            y=b;
}
abstract void printarea();
} 

class Rectangle extends Shape{
     Rectangle(int a,int b){
     super(a,b);
}
void printarea(){
    System.out.println("Area of rectangle is"+" "+x*y);
}
}

class Triangle extends Shape{
     Triangle(int b,int h){
     super(b,h);
}
void printarea(){
    System.out.println("Area of triangle is"+" "+0.5*x*y);}}

class Circle extends Shape{
     int r;
     Circle(int r){
     super(r,0);
}
void printarea(){
    System.out.println("Area of circle is"+" "+3.14*x*x);}}
     

class Shapemain{
    public static void main(String[] args){
       Shape ref;
       Rectangle r= new Rectangle(5,10);
       Triangle t=new Triangle(4,3);
       Circle c=  new Circle(10);
       r.printarea();
       ref=t;
       ref.printarea();
       c.printarea(); 
}}
          

