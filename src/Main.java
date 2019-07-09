import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scannerクラスのインスタンスを作成
        Scanner scanner = new Scanner(System.in);

        //購入金額を入力する
        System.out.print("購入金額を入力=>");
        //入力金額を取得する
        String input_text = scanner.nextLine();

        // Scannerクラスのインスタンスをクローズ
        scanner.close();

        int input_price = 0;

        try {
            input_price = Integer.parseInt(input_text);
        } catch (NumberFormatException e) {
            System.out.println("整数に変換できませんでした!");
        }


        DiscountSample ds = new DiscountSample();
        boolean rtn = ds.priceCheck(input_price);

        if(rtn == true) {
            System.out.println("割引対象です!!");

            //性別によるさらなる割引確認
            double d_rate = ds.sexCheck("f");
            System.out.println("性別による割引額は" + (int)(input_price * d_rate) + "円");

            //年齢によるさらなる割引確認
            int d_amount = ds.ageCheck(19);
            System.out.println("年齢による割引額は" + d_amount + "円");

            //すべての割引が適用された後の購入金額を求める
            int total = (int)(input_price * (1 - d_rate)) - d_amount;
            System.out.println("割引後の金額は" + total + "円です!");

        }else{
            System.out.println("割引対象外です!!");
        }


    }

}
