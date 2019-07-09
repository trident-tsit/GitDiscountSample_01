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
            if (rtn) {
                System.out.println("割引対象です!!");


            } else {
                System.out.println("割引対象外です!!");
            }

        }
    }

}
