package CeYan_3;
//倒序99乘法表
public class FuChengFa {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=9;i>=1;i--) {
            for(j=1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
