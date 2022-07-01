public class MethodDiffinitionTest {
    public static void main(String[] args){   //エントリーポイント（プログラミングの入口）
       System .out .println ("mainメソッド開始");
       int number1 = 5;
       int number2 = 10;
       int sum = 0;
       // 足し算する処理
       add(number1,number2);
       // 足し算した結果を画面に表示する処理
       printSum(sum);
       System.out.println("mainメソッド終了");
    }

    public static void add(int number1, int number2){
        System.out.println("add1メソッド開始");
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        int sum = 0;
        sum = number1 + number2;
        System.out.println("add1メソッド終了");
    }
    public static void add2(){
        System.out.println("add2メソッド開始");
        int number1 = 30;
        int number2 = 70;
        int sum = 0;
        sum =number1+ number2;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("sum:" + sum);
        System.out.println("add2メソッド終了");
    }   // メソッドのとじカッコ：呼び出したところに戻る
    public static void printSum(int sum){
        System.out.println("printsumメソッド開始");
        System.out.println("sum:" + sum);
        System.out.println("printsumメソッド終了");


    }
    
}
