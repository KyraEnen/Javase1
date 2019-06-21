package CeYan_3;

public class SaiChengDemo {
    public static void main(String[] args) {
        int score = 94;
        String sex = "女";
        if(score>80){
            switch (sex) {
                case"女":
                System.out.println("进入女子组决赛");
                break;
                case"男":
                System.out.println("进入男子组决赛");
                break;
            }
        }
    }
}

//死循环
// if(score>80){
//         while(sex=="女")
//         System.out.println("进入女子组决赛");
//         }else if(score>80){
//         while(sex=="男")
//         System.out.println("进入男子组决赛");
//         }