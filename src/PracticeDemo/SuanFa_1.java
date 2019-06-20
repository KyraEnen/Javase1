package PracticeDemo;
import java.util.Scanner;

public class SuanFa_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if(num<0|| num>999999999)
            System.out.println("输入错误！");
            else{
                while(num>0){
                    num=num/10;
                    count++;
                }
                System.out.println("输入的数字是"+count+"位数");
            }

        }

}
