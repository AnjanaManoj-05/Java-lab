class Multithreading1 extends Thread{
public void run(){
for(int i=0;i<5;i++){
  System.out.println("BMS College of Engineering");
  try{
  Thread.sleep(10000);
}
catch(InterruptedException e){
}
}}
}

class Multithreading2 extends Thread{
public void run(){
for(int i=0;i<5;i++){
  System.out.println("CSE");
  try{
Thread.sleep(2000);
}
catch(InterruptedException e){
}
}}
}
class main{
public static void main(String args[]){
Multithreading1 m1=new Multithreading1();
m1.start();
Multithreading2 m2=new Multithreading2();
m2.start();

}
}