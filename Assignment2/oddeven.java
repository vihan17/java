package Assignment2;

import java.util.Scanner;
class oddeven {
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        int[] even=new int[5];  // declaring two arrays of size 5
        int[] odd=new int[5];
        int i=0,j=0,k,a,another;

        do{   //using do while loop to add elements in array
            System.out.println("Enter the element:");
            a=scn.nextInt();

            if(a%2==0){  //if element is divisible by 2 then it goes in even array
                if(i<=4){
                    even[i]=a;
                    i++; //increasing the index
                }
                else{
                    System.out.println("Array is full");
                }
            }
            if(a%2!=0){  //if element is not divisible by 2 then it goes in odd array
                if(j<=4){
                    odd[j]=a;
                    j++;
                }
                else{
                    System.out.println("Array is full");
                }
            }

            System.out.println("Do u want to continue?(1/0)");
            another=scn.nextInt();
        }while(another==1);

        for(i=0;i<=4;i++){
            System.out.println("Even no.:"+even[i]);
        }  // displaying both arrays
        System.out.println("----------");
        for(j=0;j<=4;j++){
            System.out.println("Odd no.:"+odd[j]);
        }
    }
}

