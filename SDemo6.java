class Student
{
private String name;
private String status;
public Student(String name,String status)
{
this.name=name;
this.status=status;
}
void display()
{
System.out.println("Name:"+name);
System.out.println("status:"+status);
}
}
class ScienceStudent extends Student
{
private int practical;
public ScienceStudent(String name, String status,int practical)
{
super(name,status);
this.practical=practical;
}
public void display();
{
super.display();
System.out.println("score in practical:"+practical);
}
}
class ArtsStudent extends Student
{
private int project;
public static void main(String name,String status,int project)
{
super(name,status);
this.project=project;
}
public void display();
{
super.display();
System.out.println("score in project:"+project);
}
}
class PDemo6
{
public static void main(String a[])
{
Student S1=new ScienceStudent("Anil","pass",52);
Student S2=new ArtsStudent("vinil","fail",43);
S1.display();
S2.display();
}
}
