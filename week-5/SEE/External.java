package SEE;
import CIE.Internals;

import java.util.Scanner;
public class External extends Internals{
protected int marks[];
protected int finalmarks[];
public External(){
marks=new int[5];
finalmarks=new int[5];
}
public void inputSEEmarks() {

Scanner sc = new Scanner(System.in);
System.out.println("Enter SEE marks:");
for(int i=0;i<5;i++){
marks[i]=sc.nextInt();
}

}
public void calculateFinalMarks() {
for(int i=0;i<5;i++){
finalmarks[i]=marks[i]+super.marks[i];
}

}
public void displayFinalMarks() {

displayStudentDetails();
System.out.println("Final marks for 5 subjects:");
for(int i=0;i<5;i++){
System.out.println("Subject "+(i+1)+":"+finalmarks[i]);
}

}}