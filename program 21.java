	//Program of this() constructor call (constructor chaining)  
	  
	public class Student10{  
	    int id;  
	    String name;  
	    Student10(){System.out.println("default constructor is invoked");}  
	      
	    Student10(int id,String name){  
	    this ();//it is used to invoked current class constructor.  
	    this.id = id;  
	    this.name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	      
	    public static void main(String args[]){  
	    Student10 e1 = new Student10(11,"kani");  
	    Student10 e2 = new Student10(22,"Arna");  
	    e1.display();  
	    e2.display();  
	   }  
	} 
