public class exofthis {
    public int speed=2;
public void set_speed(int speed)
{
    System.out.println(speed);
    System.out.println(this.speed);
}
public static void main(String args[])
{
    exofthis obj1=new exofthis();
    obj1.set_speed(5);
}
    
}