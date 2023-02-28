import java.io.*;
import java.util.Scanner;

import java.io.Console;
class fact{
    static void scanner(){
        int a=1,i,n;

        Scanner scn=new Scanner(System.in);
        n=scn.nextInt();

        for(i=2;i<=n;i++){
            a=a*i;
        }
        System.out.println(a);
    }
    static void buffer()throws IOException{
        int a=1,i,n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(br.readLine());

        for(i=2;i<=n;i++){
            a=a*i;
        }
        System.out.println(a);
    }

    public void cmdline(int args){
        int a=1,i;


        for(i=2;i<= args;i++){
            a=a*i;
        }
        System.out.println(a);
    }
    static void DataInputSteam() throws IOException  {

        DataInputStream inst = new DataInputStream(System.in);
        int a=1,i;
        System.out.println("Enter the no.:");
        int n=Integer.parseInt(inst.readLine());

        for(i=2;i<=n;i++){
            a=a*i;
        }
        System.out.println(a);
    }
    static void console(){
        Console c=System.console();
        int a=1,i,n;
        System.out.println("Enter any no.:");
        n= Integer.parseInt(c.readLine());

        for(i=2;i<=n;i++){
            a=a*i;
        }
        System.out.println(a);
    }
}
class fib{
    static void scanner(){
        int i,n,sum;
        int k=0,l=1;

        Scanner scn=new Scanner(System.in);
        n=scn.nextInt();
        System.out.println("0\n"+"1");
        for(i=1;i<=n;i++){

            sum=k+l;
            k=l;
            l=sum;
            System.out.println(sum);
        }
    }
    static void buffer()throws IOException{
        int i,n,sum;
        int k=0,l=1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(br.readLine());
        System.out.println("0\n"+"1");
        for(i=1;i<=n;i++){

            sum=k+l;
            k=l;
            l=sum;
            System.out.println(sum);
        }
    }

    /*static void cmdline(String[] args){
        int a=1,i,n;
        n=Integer.parseInt(args[0]);

        for(i=1;i<= args.length;i++){
            a=a*args[i];
        }
        System.out.println(a);
    }*/
    static void DataInputSteam() throws IOException  {

        DataInputStream inst = new DataInputStream(System.in);
        int a=1,i,sum;
        int k=0,l=1;
        System.out.println("Enter the no.:");
        int n=Integer.parseInt(inst.readLine());

        System.out.println("0\n"+"1");
        for(i=1;i<=n;i++){

            sum=k+l;
            k=l;
            l=sum;
            System.out.println(sum);
        }

    }
}

public class Main{
    public static void main(String[] args)throws IOException{
        int i;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the case No.:");
        i=scn.nextInt();
        fact f=new fact();
        fib fi=new fib();

        switch(i){
            case 1:
                f.scanner();
                break;
            case 2:
                f.buffer();
                break;
            case 3:
                f.DataInputSteam();
                break;
            case 4:
                f.cmdline(9);
                break;
            case 5:
                f.console();
                break;
            case 6:
                fi.scanner();
                break;
            case 7:
                fi.buffer();
                break;
            case 8:
                fi.DataInputSteam();
                break;
        }

    }
}
