import java.awt.*;

class frameDemo
{
frameDemo()
{
Frame f=new Frame("this is my frame");
Panel p=new Panel();
f.setSize(400,500);
f.setVisible(true);
f.setBackground(Color.pink);
p.setBackground(Color.blue);
f.setLayout(new FlowLayout());
f.add(p);
}
public static void main(String[] args)
{
frameDemo obj=new frameDemo();
}
}