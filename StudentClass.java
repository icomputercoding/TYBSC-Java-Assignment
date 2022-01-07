import java.io.*;
class Student {
 int rollNumber;
 String name;
 float per;
 static int count=0;
 public Student(){
  rollNumber=0;
  name=null;
  per=0.0f;
 }
 public Student(int rollNumber,String name,float per){
  this.rollNumber=rollNumber;
  this.name=name;
  this.per=per;
  count++;
 }
 public static void count(){
  System.out.println("Object "+(count)+" Created");
 }
 public void display(){
  System.out.println("Roll Number : "+rollNumber);
  System.out.println("Name : "+name);
  System.out.println("Percentage : "+per);
  System.out.println("------------------------------");
 } 
}
public class StudentClass {
 public static void main(String [] args)throws IOException{
  Student s1=new Student(1,"Sanket",94.76f);
  Student.count();
  Student s2=new Student(2,"Rohit",76.67f);
  Student.count();
  Student s3=new Student(3,"Shubham",61.0f);
  Student.count();
  s1.display();
  s2.display();
  s3.display();  
}

}
