interface Shape
{
public abstract void display();
}
class Circle implements Shape
{
public void display()
{
System.out.println("The given shape is Circle");
}
}
class Rectangle implements Shape
{
public void display()
{
System.out.println("The given shape is Rectangle");
}
}
class Square implements Shape
{
public void display()
{
System.out.println("The given shape is Square");
}
}
class IDemo
{
public static void main(String a[])
{
Shape S1=new Circle();
Shape S2=new Rectangle();
Shape S3=new Square();
S1.display();
S2.display();
S3.display();
}
}