//IS-A relationship
    class Employee{  
	 float salary=90000;  
	}  
	public class Programmer extends Employee{  
	 int bonus=30000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  
