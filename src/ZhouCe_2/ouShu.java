package ZhouCe_2;

public class ouShu {
    public static void main(String[] args) {
        int sum = 0;
        int num = 2;
        do{
            num = num +2;
            sum = sum+num;
        }while (num<=50);

        System.out.println("50以内的偶数之和为："+sum);
    }
}
