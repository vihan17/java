package Assignment5;
interface hw
{
    void input();
    void area();
}
class Circle implements hw
{
    int r = 0;
    double pi = 3.14, ar = 0;
    @Override
    public void input()
    {
        r = 5;
    }
    @Override
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
}
class Rectangle extends Circle
{
    int l = 0, b = 0;
    double ar;
    public void input()
    {
        super.input();
        l = 6;
        b = 4;
    }
    public void area()
    {
        super.area();
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
}
public class Shape
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.area();
    }
}
