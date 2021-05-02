import java.io.*;
  
class cons
{
    
    String name;
    int id;
  
    
    cons(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
  
public class constructor
{
    public static void main (String[] args)
    {
        // this would invoke the parameterized constructor.
        cons c = new cons("Sid", 1);
        System.out.println("NAME :" + c.name +
                           " and ID :" + c.id);
    }
}