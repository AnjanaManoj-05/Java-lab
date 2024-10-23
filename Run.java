import java.util.Scanner;
class Book{
String name,author;
int price,numPages;
Book(String name,String author,int price,int numPages){
this.name=name;
this.author=author;
this.price=price;
this.numPages=numPages;
}
public String toString(){
String name,author,price,numPages;
name = "Book name: " + this.name + "\n";
author = "Author name: " + this.author + "\n";
price = "Price: " + this.price + "\n";
numPages = "Number of pages: " + this.numPages + "\n";
return name+author+price+numPages;
}
}

class Run{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,price,numPages;
String name,author;
System.out.println("Anjana Manoj");
System.out.println("1BM23CS038");
System.out.print("Enter number of details:");
n=s.nextInt();
Book b[]=new Book[n];
for(int i=0;i<n;i++){
System.out.println("Enter details of " +(i+1)+":");
System.out.print("Enter name:");
name=s.next();
System.out.print("Enter author:");
author=s.next();
System.out.print("Enter price:");
price=s.nextInt();
System.out.print("Enter number of pages:");
numPages=s.nextInt();
b[i]=new Book(name,author,price,numPages);
}
System.out.println();
for(int i=0;i<n;i++){
System.out.println("Record "+(i+1)+" :\n"+b[i].toString());
}

}
}
