package Assignment2;

import java.util.Scanner;

public class neighbor {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[5]; //declaring an array of size 5
        int i,j;

        System.out.println("Enter the elements:");
        for(i=0;i<=4;i++){   //adding elements to array through user input
            arr[i]=scn.nextInt();
        }
        int a,index=0;
        a=Math.abs(arr[1]-arr[0]); //declaring a variable a and equating it to diff of 1st 2 elements of array
        for(i=2;i<=4;i++){

            if(Math.abs(arr[i]-arr[i-1])<a){
                a=Math.abs(arr[i]-arr[i-1]); //using abs for mod values of differences
                index=arr[i-1];
            }
        }
        System.out.println("difference: "+a+" index:"+index);
    }
}
