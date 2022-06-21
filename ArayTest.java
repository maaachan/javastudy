public class ArayTest {
  public static void main(String[] args){
      String name = "鈴木太郎";   //会員名称
      String email = "suzuki_tarou@xxxx.com";  //Emailアドレス
      String phone = "090-0000-9999";     //電話番号
       System.out.println(name);
       System.out.println(phone);

       String[]  customer;  //String型の配列を宣言
  //     customer = "鈴木太郎"; // String[]とstring=ではない
  //     customer[0] = "鈴木太郎"; // 配列を宣言した後、配列の初期化せずにいきなり値を代入できない
       customer = new String[3];
       customer[0] = "鈴木太郎";    // [0]で一番目。０から開始する。これを「添字」または「index」という。その値が入る箱を「要素」という。
       customer[1] = "suzuki_taro@xxxx.com";   //[1]で２番目
       customer[2] = "090-0000-9999";    //[2]で3番目

    System.out.println(customer[0]);
    System.out.println(customer[1]);
    System.out.println(customer[2]);

  //  String[] customer2;
  //  customer2 = {"鈴木太郎,”suzuki_taro@xxxx.com","090-0000-9999"};    //new 型名[]{}で初期化する場合、宣言と初期化を分けられない！
  //  String[] customer2;
  //  customer2 =new String[]{}{"鈴木太郎","suzuki_taro@xxxx.com","090-0000-9999"};    //new 型名型名[]で初期化する場合、宣言と初期化を同時に行う
    String[] customer2 = {"鈴木太郎","suzuki.taro@xxx.com","090-0000-9999"};   //new　型名[]で初期化する場合、宣言と初期化を同時に行う
    System.out.println(customer[0]);
    System.out.println(customer[1]);
    System.out.println(customer[2]);
  } 
}
