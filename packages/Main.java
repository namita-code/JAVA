import CIE.*;
import SEE.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the number of students: ");
    n=sc.nextInt();

    Internals[] internalmarks=new Internals[n];
    Externals[] externalmarks=new Externals[n];

    for(int i=0;i<n;i++){
           System.out.println("Enter usn: ");
           String usn=sc.next();
           System.out.println("Enter name: ");

           String name=sc.next();
           System.out.println("Enter sem ");
           int sem=sc.nextInt();

           //enter cie marks for 50
           System.out.println("Enter marks1: ");
           int marks1=sc.nextInt();
           System.out.println("Enter marks2: ");
           int marks2=sc.nextInt();
           System.out.println("Enter marks3: ");
           int marks3=sc.nextInt();
           System.out.println("Enter marks4: ");
           int marks4=sc.nextInt();
           System.out.println("Enter marks5: ");
           int marks5=sc.nextInt();
          
           //see marks for 100
           System.out.println("Enter seemarks1: ");
           int seemarks1=sc.nextInt();
           System.out.println("Enter seemarks2: ");
           int seemarks2=sc.nextInt();
           System.out.println("Enter seemarks3: ");
           int seemarks3=sc.nextInt();
           System.out.println("Enter seemarks4: ");
           int seemarks4=sc.nextInt();
           System.out.println("Enter seemarks5: ");
           int seemarks5=sc.nextInt();

           
            internalmarks[i] = new Internals(marks1,marks2,marks3,marks4,marks5);
            externalmarks[i] = new Externals(usn, name, sem, seemarks1,seemarks2,seemarks3,seemarks4,seemarks5);}


// Display final marks for all students
        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            externalmarks[i].getdetails();
            internalmarks[i].getinternals();
            externalmarks[i].getexternals();

            // Calculate and display final marks
            System.out.print("Final Marks (5 courses): ");
            for (int j = 0; j < 5; j++) {
                int finalMark = (internalmarks[i].internals[j] / 2) + (externalmarks[i].externals[j] / 2);
                System.out.print(finalMark + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    }