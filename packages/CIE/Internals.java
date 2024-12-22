package CIE;
public class Internals{
     public int[] internals=new int[5];
     public Internals(int marks1,int marks2,int marks3,int marks4,int marks5){
               internals[0]=marks1;
               internals[1]=marks2;
               internals[2]=marks3;
               internals[3]=marks4;
               internals[4]=marks5;
               }
     public void getinternals(){
            System.out.println("Marks of sub1:"+internals[0]);
            System.out.println("Marks of sub2:"+internals[1]);
            System.out.println("Marks of sub3:"+internals[2]);
            System.out.println("Marks of sub4:"+internals[3]);
            System.out.println("Marks of sub5:"+internals[4]);}
}