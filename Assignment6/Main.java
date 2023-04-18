package Assignment6;

public class Main {
    public static void main(String[] args) {
        Fixed_stk fixed=new Fixed_stk();
        fixed.push(1);
        fixed.push(2);
        fixed.push(3);
       fixed.push(4);
        fixed.push(5);
      //  fixed.push(6);

        fixed.displayStkTop();
        if(fixed.top==-1)
            System.out.println("Stack Empty can't remove");
        else
            System.out.println("Pop operation"+fixed.pop());
        fixed.displayStk();
        //System.out.println("Hello world!");
    }
}