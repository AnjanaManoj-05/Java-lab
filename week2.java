import java.util.Scanner;
class Student{
String usn,name;
int m[]=new int[8];
int c[]=new int[8];
int g,eS,tC;
double sgpa;
Scanner s=new Scanner(System.in);
void details(){
System.out.print("Enter usn:");
usn=s.next();
System.out.print("Enter name:");
name=s.next();
System.out.println("Enter marks:");
for(int i=0;i<8;i++){
m[i]=s.nextInt();
}
System.out.println("Enter credits for 8 subjects:");
for(int i=0;i<8;i++){
c[i]=s.nextInt();
}
}
void display(){
System.out.println("usn:" +" "+usn);
System.out.println("Name:" +" "+name);
System.out.println("Marks:");
for(int i=0;i<8;i++){
System.out.println("Mark " + (i+1) +":" +m[i]);

}

}
void sgpaCalc(){
System.out.println("usn:" +" "+usn);
for(int i=0;i<8;i++){
if(m[i]==100){
g=10;
}
else{
g=(m[i]/10)+1;
}
eS+=g*c[i];
tC+=c[i];
}
sgpa=(double)eS/(double)tC;
System.out.println(sgpa);
if(sgpa<=4.0)
{
System.out.println("Student has failed");
}
}
}
class hello{
public static void main(String [] args){
System.out.println("Anjana Manoj");
System.out.println("1BM23CS038");
Student s[]=new Student[3];
for(int i=0;i<3;i++){
s[i]=new Student();
} 
for(int j=0;j<3;j++){
System.out.println("Enter details of "+""+(j+1)+" student:");
s[j].details();
}
for(int k=0;k<3;k++){
System.out.println("Details of "+""+(k+1)+" student:");
s[k].display();
}
for(int i=0;i<3;i++){
System.out.println("SGPA of "+" "+(i+1)+" student:");
s[i].sgpaCalc();
}

}
}


