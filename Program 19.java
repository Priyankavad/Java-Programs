//Understanding the problem without this keyword
	public class Student10{  
	    int id;  
	    String name;  
	      
	    Student10(int id,String name){  
	    id = id;  
	    name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	  
	    public static void main(String args[]){  
	    Student10 s1 = new Student10(11,"Kannan");  
	    Student10 s2 = new Student10(31,"Aisha");  
	    s1.display();  
	    s2.display();  
	    }  
	} 
