//Nested If
import java.io.*;

public class Nestedif
{
public static void main(String o[])throws Exception
{
int m1,m2,m3,m4,m5,tot;
float avg;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 5 marks");

m1=Integer.parseInt(br.readLine());
m2=Integer.parseInt(br.readLine());
m3=Integer.parseInt(br.readLine());
m4=Integer.parseInt(br.readLine());
m5=Integer.parseInt(br.readLine());

tot=m1+m2+m3+m4+m5;

avg=tot/5;

System.out.println("STUDENT DETAILS");
System.out.println("MARK1    :  "+m1);
System.out.println("MARK2    :  "+m2);
System.out.println("MARK3    :  "+m3);
System.out.println("MARK4    :  "+m4);
System.out.println("MARK5    :  "+m5);
System.out.println("TOTAL    :  "+tot);
System.out.println("AVERAGE  :  "+avg);

if(m1>=35&&m2>=35&&m3>=35&&m4>=35&&m5>=35)
{
if(avg>90&&avg<=100)
System.out.println("A+ GRADE");
else if(avg>80&&avg<=90)
System.out.println("A GRADE");
else if(avg>70&&avg<=80)
System.out.println("B GRADE");
else
System.out.println("C GRADE");
}
else
{
System.out.println("FAIL");
}
}
}

