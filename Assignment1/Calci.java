package Assignment1;

import java.util.Scanner;

class firstClass{
    Scanner scn=new Scanner(System.in);
    void addition(){
        System.out.println("Enter any two No.:");
        int a,b;
        a=scn.nextInt();
        b=scn.nextInt();
        System.out.println(a+b);
    }
    void subtraction(){
        System.out.println("Enter any two No.:");
        int a,b;
        a=scn.nextInt();
        b=scn.nextInt();
        System.out.println(a-b);
    }
    void multiplication(){
        System.out.println("Enter any two No.:");
        int a,b;
        a=scn.nextInt();
        b=scn.nextInt();
        System.out.println(a*b);
    }
    void division(){
        System.out.println("Enter any two No.:");
        int a,b;
        a=scn.nextInt();
        b=scn.nextInt();
        System.out.println(a/b);
    }
    void underoot(){
        System.out.println("Enter any No.:");
        int n,i;
        n=scn.nextInt();
        for(i=1;i<n;i++){
            if(i*i==n){
                System.out.println(i);
                break;
            }
        }
        if(i==n){
            System.out.println("No. dosen't have a perfect root");
        }
    }
    void underroot2(){
        double a,b;
        System.out.println("Enter any No.");
        a= scn.nextDouble();
        b=Math.sqrt(a);
        System.out.println(b);
    }
    void power(){
        System.out.println("Enter no. then its power:");
        int a,b,i,c=1;
        a=scn.nextInt();
        b=scn.nextInt();

        for(i=1;i<=b;i++){
            c=a*c;
        }
        System.out.println(c);
    }

    int mean(){
        int sum=0,count=0,mean,another;

        do{
            System.out.println("Enter the No.:");
            int a=scn.nextInt();
            sum=sum+a;
            count++;
            mean=sum/count;
            System.out.println("Do u want to continue?(1/0)");
            another=scn.nextInt();
        }while(another==1);
        System.out.println("mean:"+mean);
        return 0;
    }
    void standardeviation(double a,double b,double c){
        double sum,mean,x,y,z,n=3-1,v,sd;
        mean=a+b+c/2;
        x=a-mean;
        y=b-mean;
        z=c-mean;
        sum=x+y+z;
        v=sum/n;
        sd=Math.sqrt(v);
        System.out.println(sd);
    }

}

public class Calci{
    public static void main(String[] args){
        firstClass fc=new firstClass();
        Scanner scn=new Scanner(System.in);
        int i;
        System.out.println("Enter the case no.:");
        i=scn.nextInt();

        switch(i) {

            case 1:
                fc.power();
                break;
            case 2:
                fc.addition();
                break;
            case 3:
                fc.subtraction();
                break;
            case 4:
                fc.multiplication();
                break;
            case 5:
                fc.division();
                break;
            case 6:
                fc.underoot();
                break;
            case 7:
                fc.standardeviation(3, 7,8);
                break;
            case 8:
                fc.mean();
            case 9:
                fc.underroot2();
                break;
        }
    }
}
