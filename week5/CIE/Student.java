package CIE;
import java.util.Scanner;
public class Student{
protected String usn=new String();
protected String name=new String();
protected int sem;
public void inputStudentDetails(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter usn:");
usn=sc.next();
System.out.print("Enter name:");
name=sc.next();
System.out.print("Enter semester:");
sem=sc.nextInt();
}
public void displayStudentDetails(){
System.out.println("Student details:");
System.out.println("USN: "+usn);
System.out.println("Name: "+name);
System.out.println("Sem: "+sem);

}

}