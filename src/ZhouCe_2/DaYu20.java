package ZhouCe_2;

public class DaYu20 {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1;i<=10;i++){
            sum=sum+i;
            if(sum>20){
                System.out.println("当前的累加值为："+sum);
                break;
            }
        }
    }
}
