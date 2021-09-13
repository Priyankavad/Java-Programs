//Java Program to demonstrate the use of static variable
class Student{
   int rollno;//instance variable
   String name;
   static String college ="RIT";//static variable
   //constructor
   Student(int r,String n){
   rollno = r;
   name = n;
   }
   //method to display the values
   void display (){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to show the values of static variable
public class TestStaticVariable1{
 public static void main(String args[]){
 Student s1 = new Student(110,"Kavitha");
 Student s2 = new Student(232,"Raj");
 s1.display();
 s2.display();
 }
}
