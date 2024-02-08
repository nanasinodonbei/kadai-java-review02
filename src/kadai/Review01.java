package kadai;

import java.util.Scanner;

public class Review01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("金額を入力してください:");

        int price = sc.nextInt();
        int taxPrice = (int) tax(price);

        System.out.println(price + "円の商品の税込価格は" + (price + taxPrice) + "円（消費税は" + taxPrice + "円）です。");
    }

    public static float tax(int x) {

        return (float) (x * 0.1);

    }
}
