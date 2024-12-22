import java.util.Scanner;
class Matrixmul{
public static void main(String args[]){
int r1,c1,r2,c2;

Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows of matrix1:");
r1=sc.nextInt();
System.out.println("Enter number of columns of matrix1:");
c1=sc.nextInt();
System.out.println("Enter number of rows of matrix2:");
r2=sc.nextInt();
System.out.println("Enter number of rows of matrix2:");
c2=sc.nextInt();
int matrix1[][]=new int[r1][c1];
int matrix2[][]=new int[r2][c2];
int k;
int result[][]=new int[r1][c2];
System.out.println("enter elements of matrix1");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
matrix1[i][j]=sc.nextInt();
}}

System.out.println("enter elements of matrix2");
for(int i=0;i<r2;i++){
for(int j=0;j<c2;j++){
matrix2[i][j]=sc.nextInt();}}

if(r2==c1){
for(int i=0;i<r1;i++)
for(int j=0;j<c2;j++)
{result[i][j]=0;
for(k=0;k<c1;k++){
result[i][j]=result[i][j]+matrix1[i][k]*matrix2[k][j];}}
System.out.println("The resultant matrix is:");
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++){
System.out.print(result[i][j]);
System.out.print("\t");
}
System.out.println("\n");}}
else
{System.out.println("cant multiply");}



}
}
