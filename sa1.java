import java.io.*;
class Emp{
 private int id;
 private double salary;
 private String name,dept;
 double total;
 double sal=salary;
 public Emp(){
  id=0;
  salary=0.0;
  name="";
  dept="";
 }
 public Emp(int id,double salary, String name, String dept){
  this.id=id;
  this.salary=salary;
  this.name=name;
  this.dept=dept;
 }
 public void accept() throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter id of employee: ");
  id=Integer.parseInt(br.readLine());
  System.out.println("Enter name of employee: ");
  name=br.readLine();
  System.out.println("Enter salary of employee: ");
  salary=Double.parseDouble(br.readLine());
  System.out.println("Enter department of employee: ");
  dept=br.readLine();
 }
 public double total(){
  total=total+salary;
  return total;
 }
 public void display(){
  System.out.println("Emp Id: "+id);
  System.out.println("Name: "+name);
  System.out.println("Salary: "+salary);
  System.out.println("Department: "+dept);   
 }
}

class Manager extends Emp{
 private double bonus;
 public void accept() throws IOException{
  super.accept();
  System.out.println("Enter Bonus of employee: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  bonus=Double.parseDouble(br.readLine());
  super.total=bonus;
 }
 public void display(){
  super.display();
  System.out.println("Bonus: "+bonus);
  System.out.println("Total Salary: "+total);
 } 
}

public class sa1 { 
 public static void main(String[] args) throws IOException{
  Manager[] m=new Manager[10];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number of employees: ");
  int n=Integer.parseInt(br.readLine());
  for(int i=0;i<n;i++){
   m[i]=new Manager();
   m[i].accept();
   m[i].total();
  }
  for(int i=0;i<n;i++){
  m[i].display();
  System.out.println("---------------------------------");
  }
  double src=m[0].total;
  int temp=0;
  for(int i=1;i<n;i++){
   if(src<m[i].total) 
   {
    src=m[i].total;
    temp=i;
   }
  }
  System.out.println("The Employee having the maximum Total salary is :");
  m[temp].display();
 }

}
