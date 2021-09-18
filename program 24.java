//this keyword can be passed as an argument in the method.
  public class Hp{  
	  void m(Hp obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  
	  }  
	    
	  public static void main(String args[]){  
	  Hp s1 = new Hp();  
	  s1.p();  
	  }  
	}  
