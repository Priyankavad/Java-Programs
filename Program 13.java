//Java parameterized constructor
	public class Student4{  
	    int id;  
	    String name;  
	      
	    Student4(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Student4 s1 = new Student4(876,"Kani");  
	    Student4 s2 = new Student4(262,"Ashwin");  
	    s1.display();  
	    s2.display();  
	   }  
	}  
