import SY.SYMarks;
import TY.TYMarks;
import java.io.*;
class Slip20_1
{
                int rollno;
                int ComputerTotal, MathsTotal, ElecTotal, Theory, Practicals,total;
                String name;
                static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


                public Slip20_1()
                {}

                public Slip20_1(int rollno,String name) throws Exception
                {
                                this.rollno = rollno;
                                this.name = name;
                               
                                System.out.println("Enter SY Marks : ");
                               
                                System.out.println("\n Enter Computer Marks :");
                                ComputerTotal = Integer.parseInt(br.readLine());
                               
                                while((ComputerTotal<0 || ComputerTotal>100))
                                {
                                                System.out.println("Invalid Marks.....");
                                               
                                                System.out.println("Please ReEnter The Marks : ");
                                                ComputerTotal = Integer.parseInt(br.readLine());
                                }
                               
                                System.out.println("Enter Maths Marks : ");
                                MathsTotal=Integer.parseInt(br.readLine());
                               
                                while((MathsTotal<0 || MathsTotal>100))
                {
                System.out.println("Invalid Marks.....");
                                               
                                                System.out.println("Please Reenter The Marks : ");
                       MathsTotal=Integer.parseInt(br.readLine());
                                }

                                System.out.println("Enter Electronics Marks : ");
                                ElecTotal = Integer.parseInt(br.readLine());
                               
                                while((ElecTotal<0 || ElecTotal>100))
                {
                                System.out.println("Invalid Marks.....");
                                               
                                                System.out.println("Please Reenter The Marks: ");
                                ElecTotal = Integer.parseInt(br.readLine());
                }

                                SYMarks sy = new SYMarks(ComputerTotal, MathsTotal, ElecTotal);

                                System.out.print("Enter TY marks : ");
                               
                                System.out.print("\n Enter Theory Marks : ");
                                Theory = Integer.parseInt(br.readLine());
                               
                                while((Theory<0 || Theory>100))
                 {
               System.out.println("Invalid Marks.....");
                                                System.out.println("Please Reenter The Marks : ");
               Theory = Integer.parseInt(br.readLine());
                }

                                System.out.print("Enter Practicals Marks : ");
                                Practicals = Integer.parseInt(br.readLine());
                               
                                while((Practicals<0 || Practicals>100))
                {
                                System.out.println("Invalid marks.....");
                               
                                                System.out.println("Please Reenter The Marks : ");
                                                Practicals = Integer.parseInt(br.readLine());
                }

                                TYMarks ty = new TYMarks(Theory, Practicals);
               
                }
                public void CalculateGrade()
                {             
                                double percentage;
                               
                                total = (ComputerTotal+ MathsTotal + ElecTotal + Theory + Practicals);
                                percentage=total/5;
                                System.out.println("Total Marks : \t"+total);
                                if(percentage >= 70)
                                System.out.println("Grade : A ");
                               
                                else if(percentage >= 60)
                System.out.println("Grade : B ");
                               
                                else if(percentage >= 50)
                System.out.println("Grade : C ");
                               
                                else if(percentage >= 40)
                System.out.println("Grade : PASS ");
                                else
                                System.out.println(" Grade : FAIL ");
                                System.out.println("=============================");
                }
               
                public void display()
                {
                                System.out.println("Name of Student : "+name);
                                System.out.println("Computer Total : "+ ComputerTotal+"\n Maths Total : "+MathsTotal+"\n Electronic Total : \t"+ElecTotal);
                                System.out.println("Theory Mark : "+Theory+"\n Practical Mark : "+Practicals);
                               
                               
                }
                               
                public static void main(String args[]) throws Exception
                {
               
                                System.out.println("Enter number of students : ");
                                int no=Integer.parseInt(br.readLine());
                               
                                Slip20_1 ob[]=new Slip20_1[no];
                               
                                for(int i=0; i<no; i++)
                                {
                                                System.out.println("Enter Roll No : ");
                                                int r = Integer.parseInt(br.readLine());
               
                                                System.out.println("Enter Name : ");
                                                String nm = br.readLine();
                                               
                                                ob[i] = new Slip20_1(r,nm);
                                }
                                for(int i=0; i<no; i++)
                                {             
                                                ob[i].display();
                                                ob[i].CalculateGrade();
                                }
                }
}
