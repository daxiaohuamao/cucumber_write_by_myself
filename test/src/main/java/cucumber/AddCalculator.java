package cucumber;

import java.util.Scanner;
public class AddCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入第1个数:");
        int num1 = s.nextInt();
        System.out.print("输入第2个数:");
        int num2 = s.nextInt();
        int result = add(num1,num2);
        System.out.println("结果:"+result);
    }

    public static int add(int num1 , int num2){
        return num1+num2;
    }
}
