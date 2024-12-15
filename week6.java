import java.util.Scanner;
class myException1 extends Exception{

public String toString(){
return "Father's age cannot be equal to or less than zero";
}
}
class myException2 extends Exception{
public String toString(){
return "Father's age should be greater than son's";
}
}
class Father{
int fage;
Father(int age){
fage=age;
}

void WrongAge() throws myException1 {
if(fage<=0){
throw new myException1();
}

}}
class Son extends Father{
int sage;
Son(int fage,int age){
super(fage); 
sage=age;

}
void checkAge() throws myException2{
if(fage<=sage){
throw new myException2();
}
else{
System.out.println("Ages given are valid.\nFather's age :" +fage+"\nson's age :" +sage);
}
}}
class main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Anjana Manoj\n1BM23CS038");
System.out.print("Enter father's age:");
int x=sc.nextInt();
System.out.print("Enter son's age:");
int y=sc.nextInt();
Father f1=new Father(x);
Son s1=new Son(x,y);
try{
 f1.WrongAge();

}
catch(myException1 e){
System.out.println("Exception: "+e) ;
}
try{
 s1.checkAge();
}
catch(myException2 e){
System.out.println("Exception: "+e);
}
}}
