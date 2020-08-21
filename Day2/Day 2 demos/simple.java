//private modifier demo

class A
{
private int data=40;
private void msg()
{
System.out.println("Welcome");
}
}

class simple
{
public static void main(String[] args)
{
A obj=new A();
System.out.println(obj.data);//compile time error
obj.msg();//compile time error
}
}