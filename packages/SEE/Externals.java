package SEE;
import CIE.*;
public class Externals extends CIE.Student{
     public int[] externals=new int[5];
     public Externals(String usn,String name,int sem,int marks1,int marks2,int marks3,int marks4,int marks5){
               super(usn,name,sem);
               externals[0]=marks1;
               externals[1]=marks2;
               externals[2]=marks3;
               externals[3]=marks4;
               externals[4]=marks5;
               }
     public void getexternals(){
            System.out.println("Marks of sub1:"+externals[0]);
            System.out.println("Marks of sub2:"+externals[1]);
            System.out.println("Marks of sub3:"+externals[2]);
            System.out.println("Marks of sub4:"+externals[3]);
            System.out.println("Marks of sub5:"+externals[4]);}
}