// Create a package CIE which has two classes- Student and
//Internals. The class Personal has members like usn, name,
//sem. The class internals has an array that stores the
//internal marks scored in five courses of the current
//semester of the student. Create another package SEE
//which has the class External which is a derived class of
//Student. This class has an array that stores the SEE marks
//scored in five courses of the current semester of the
//student. Import the two packages in a file that declares
//the final marks of n students in all five courses.

package CIE;
public class Student{
String usn;
String name;
int sem;
public Student(String usn,String name,int sem){
       this.sem=sem;
       this.usn=usn;
      this.name=name;}
public void getdetails(){
       System.out.println("Name:"+this.name);
       System.out.println("USN:"+usn);
       System.out.println("Sem:"+sem);}
}
