//Is final method inherited?
	class Bike{  
	  final void running(){System.out.println("running......");}  
	}  
	public class Royal extends Bike{  
	   public static void main(String args[]){ 
	       new Royal().running();  
	   }  
	}  
