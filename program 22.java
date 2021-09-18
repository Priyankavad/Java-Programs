//Where to use this() constructor call?
	public class Student1{  
	    int id;  
	    String name;  
	    String city;  
	    Student1(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    Student1(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	    public static void main(String args[]){  
	    Student1 e1 = new Student1(11,"kani");  
	    Student1 e2 = new Student1(22,"Arya","chennai");  
	    e1.display();  
	    e2.display();  
	   }  
	}  
 
