class Multithreading1 implements Runnable{
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
class implementsthreads{
public static void main(String args[]){
Multithreading1 m1=new Multithreading1();
Thread mt1=new Thread(m1);
mt1.start();
Multithreading2 m2=new Multithreading2();
Thread mt2=new Thread(m2);
mt2.start();
}
}