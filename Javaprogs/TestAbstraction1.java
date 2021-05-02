abstract class Shape{
abstract void draw();
}
class Rectangle extends Shape{
void draw(){System.out.println("drawing rectangle");}
}
class Circle1 extends Shape{
void draw(){System.out.println("drawing circle");}
}
public class TestAbstraction1{
public static void main(String[]args){
Shape s=new Circle1();
Shape r=new Rectangle();
Circle1 c=new Circle1();
Rectangle d=new Rectangle();
//Shape a=new Shape(); this give error bcz shape is abstracted,cannot be intantiated
//a.draw();
s.draw();
r.draw();
c.draw();
d.draw();
}
}