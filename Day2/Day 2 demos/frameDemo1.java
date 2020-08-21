import java.awt.*;

class frameDemo1
{
frameDemo1()
{
Frame f=new Frame("this is my frame");
Button b1=new Button("Button1");
Button b2=new Button("Button2");
Button b3=new Button("Button3");
Button b4=new Button("Button4");
Button b5=new Button("Button5");
f.setSize(400,500);
f.setVisible(true);
//f.setLayout(new FlowLayout());
//f.setLayout(new GridLayout(3,2));
f.add(b1,BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(b5,BorderLayout.CENTER);
}
public static void main(String[] args)
{
frameDemo1 obj=new frameDemo1();
}
}