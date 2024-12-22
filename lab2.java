/*Create a class Book which contains four members: name,author, price, num_pages. Include a constructor to set the
values for the members. Include methods to set and get the details of the objects. Include a toString( ) method that
could display the complete details of the book. Develop a Java program to create n book objects.*/

import java.util.Scanner;

class Book{
String name;
String author;
float price;
int num_pages;

Book(){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;}

void getdetails(){
Scanner sc=new Scanner(System.in);
System.out.println("enter name of the book");
name=sc.nextLine();
System.out.println("enter author of the book");
author=sc.nextLine();
System.out.println("enter the price of the book");
price=sc.nextFloat();
System.out.println("enter number of pages");
num_pages=sc.nextInt();
}
@Override
public String toString() {
    return "Details of the book:\n" +
           "Name of the book: " + name + "\n" +
           "Author of the book: " + author + "\n" +
           "Price of the book: " + price + "\n" +
           "Number of pages: " + num_pages;
}

}
class Bookdisp{
public static void main(String[] args){
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of books:");
n=s.nextInt();
Book b[]=new Book[n];
for(int i=0;i<n;i++){
b[i]=new Book();
}
for(int j=0;j<n;j++){
b[j].getdetails();
System.out.println(b[j].toString());
}
}
}




