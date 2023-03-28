package March27Thread;
public class  Question implements Runnable  {    
public void run()  {    
System.out.println("Now I'm working ...");    
}      
// main method  
public static void main(String arg[])  {   
// creating an object of the class MyThread2  
Runnable r1 = new  Question();   
// creating an object of the class Thread using Thread(Runnable r, String name)  
Thread t = new Thread(r1, "I'm thread");    
t.start();   
String s = t.getName();  
System.out.println(s);  
}    
}    