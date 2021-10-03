//dynamic binding
	class Animal{  
	 void eat(){System.out.println("animal is eating...");}  
	}  
	  
	public class Dog extends Animal{  
	 void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
	  Animal h=new Dog();  
	  h.eat();  
	 }  
	}  
