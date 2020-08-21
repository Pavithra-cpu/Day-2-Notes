//Constructor overloading

class Student2
{
int id;
String name;
int age;
//two args constructor
Student2(int i,String n)
{
id=i;
name=n;
}
//three agrs constructor
Student2(int i,String n,int a)
{
id=i;
name=n;
age=a;
}

void display()
{
System.out.println(id+""+name+""+age);
}

public static void main(String[] args)
{
Student2 s1=new Student2(101,"Ram");
Student2 s2=new Student2(102,"Raj",25);

s1.display();
s2.display();
}
}