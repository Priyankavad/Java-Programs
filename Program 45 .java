//Abstract class having constructor, data member, methods etc.
	abstract class Bike{  
	   Bike(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	  
	 class Royal extends Bike{  
	 void run(){System.out.println("running safely");}  
	 }  
	 public class Abstraction2{  
	 public static void main(String args[]){  
	  Bike obj = new Royal();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	} 
