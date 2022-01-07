import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidDateException extends Exception{
 
}
public class DateMain {

 int dd,mm,yy;

 public DateMain(){
  
 }
 public DateMain(int dd,int mm,int yy) {

  this.dd=dd;
  this.mm=mm;
  this.yy=yy;
 }
 public boolean accept(){
  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  try {
   System.out.println("Enter Day:\t");
   dd=Integer.parseInt(br.readLine());
   System.out.println("Enter Month:\t");
   mm=Integer.parseInt(br.readLine());
   System.out.println("Enter Year:\t");
   yy=Integer.parseInt(br.readLine());
  } catch (Exception  e) {

   e.printStackTrace();
  }
  try{
   if(dd<=0 || dd>=32) throw new InvalidDateException();
   if(mm<=0 || mm>=13) throw new InvalidDateException();
   if(dd== 29 && mm==2 && (yy%4)!=0 ) throw new InvalidDateException();
  }
  catch(InvalidDateException e){
   System.out.println("Invalid Date: \t"+dd+"/"+mm+"/"+yy);
   return false;
  }
  return true;
 }

 public static void main(String[] args) {

   DateMain d=new DateMain(); 
   String str=null;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   do{
    if(d.accept())d.display();
    System.out.println("You want Enter new date(y/n)?");
    try {
     str=br.readLine();
    } catch (IOException e) {

     e.printStackTrace();
    }
   }while(str.equalsIgnoreCase("y"));
 }
 private void display() {

  System.out.println(dd+"/"+mm+"/"+yy);
 }

}
