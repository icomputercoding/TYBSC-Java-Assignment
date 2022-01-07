import series.*;
import java.io.*;
public class SeriesMain {
  public static void main(String [] args)throws IOException{
 Prime p=new Prime();
 int i;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 do
 {
 System.out.println("Enter a number / 0 to exit");
 i=Integer.parseInt(br.readLine());
 p.prime(i);
 p.fibonacci(i);
 p.square(i);
 }
 while(i>0);
 }
}
