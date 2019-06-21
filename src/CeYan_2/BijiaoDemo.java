package CeYan_2;
import java.util.Scanner;
public class BijiaoDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//接受一下第一个数
        System.out.println("第一个数：");
        int aa=sc.nextInt();
        System.out.println("第二个数：");
        int bb=sc.nextInt();
//调用函数
        int x=biJiao(aa,bb);
        System.out.println(x);
    }

    //比较两个数谁大
    public static int biJiao(int aa,int bb){
        if(aa>bb){
            return aa;
        }else{
            return bb;
        }

    }
}
