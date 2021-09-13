	public class Rectangle{  
	 int length;  
	 int width;  
	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	  
	 void calculateArea(){System.out.println(length*width);}  
	  
	 public static void main(String args[]){  
	  Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects  
	    
	  r1.insert(15,8);  
	  r2.insert(7,19);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
	}  
