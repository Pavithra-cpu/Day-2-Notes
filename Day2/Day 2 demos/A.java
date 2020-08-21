//private modifier demo

class A
{
int data=40;
void msg()
{
System.out.println("Welcome");
}
}

class simple
{
public staic void main(String[] args)
{
A obj=new A();
System.out.println(obj.data);//compile time error
obj.msg();//compile time error
}
}