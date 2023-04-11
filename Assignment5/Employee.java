package Assignment5;

import java.util.Scanner;

abstract class Employee
{
    abstract void acc();
    abstract void dis();
    Scanner s=new Scanner(System.in);
}
class Manager extends Employee
{
    int id;
    String name;
    double ph;
    void acc()
    {

        System.out.println("Enter id , name and Phone number of manager");
        id=s.nextInt();
        name=s.next();
        ph=s.nextDouble();
    }
    void dis()
    {
        System.out.println("mid="+id+"mname="+name+"mph="+ph);
    }
}
class Worker extends Employee
{
    int wid;
    String wname;
    void acc()
    {
        System.out.println("Enter Worker id and name");
        wid=s.nextInt();
        wname=s.next();
    }
    void dis()
    {
        System.out.println("Wid="+wid+"wname"+wname);
    }
}
class Say
{
    public static void main(String ar[])
    {
        Manager m=new Manager();
        m.acc();
        Worker w=new Worker();
        w.acc();
        m.dis();
        w.dis();
    }
}
