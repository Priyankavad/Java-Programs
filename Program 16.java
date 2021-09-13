//Program of counter without static variable
	public class Counter{  
	int count=1;//will get memory when instance is created  
	  
	Counter(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
	Counter c1=new Counter();  
	Counter c2=new Counter();  
	Counter c3=new Counter();  
	  
	 }  
	}  
