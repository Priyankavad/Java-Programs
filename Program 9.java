//Example of Method Overloading by changing data type of argument
	public class Calculation2{  
	  void sum(int a,int b){System.out.println(a+b);}  
	  void sum(double a,double b){System.out.println(a+b);}  
	  
	  public static void main(String args[]){  
	  Calculation2 obj=new Calculation2();  
	  obj.sum(11.5,19.5);  
	  obj.sum(25,30);  
	  
	  }  
      }  
