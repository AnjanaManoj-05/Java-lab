import java.util.Scanner;
import java.lang.Math;
class quadratic{
int a,b,c;
double d,r1,r2;
void getInput(){
Scanner s =new Scanner(System.in);
System.out.println("Enter values of a,b and c:");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
while(a==0){
System.out.println("Not a quadratic equation.\nEnter new value for a:");
a=s.nextInt();

}
d=b*b-4*a*c;
if(d==0){
  r1=(double)((-b)/(2*a));
  System.out.println("Roots are real and equal\n" + "Roots are: " + r1 +","+r1); 
}
else if(d>0){
r1= ((-b) + (Math.sqrt(d)))/(double)(2*a);
r2= ((-b) - (Math.sqrt(d)))/(double)(2*a);
System.out.println("Roots are real\n" + "Roots are: " + r1 +","+r2 ); 
}
else{
r1= (-b)/(2*a);
r2 = Math.sqrt(-d)/(2*a);
System.out.println("Roots are imaginary\nRoots: " + r1 + "+ i" +r2 );
System.out.println(r1 +"- i"+r2); 
}


}}

class hello{
public static void main(String [] args){
System.out.println("Anjana Manoj");
System.out.println("1BM23CS038");
quadratic q=new quadratic();
q.getInput();




}}
