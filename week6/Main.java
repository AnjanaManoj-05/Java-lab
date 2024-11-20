import SEE.External;
import CIE.*;
import java.util.Scanner;
class Main{
public static void main(String args[]){
System.out.println("Anjana Manoj\n1BM23CS038");
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of students:");
int n=sc.nextInt();
External student[]=new External[n];
for(int i=0;i<n;i++){
student[i]=new External();
student[i].inputStudentDetails();

student[i].inputCIEmarks();
student[i].inputSEEmarks();
student[i].calculateFinalMarks();
student[i].displayFinalMarks();
}

}}














