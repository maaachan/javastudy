public class ArayTest2 {
  public static void main(String[] args){
      String[]  customer;  //String型の配列を宣言
      customer = new String[3];
      customer[0] = "鈴木太郎";    // [0]で一番目。０から開始する。これを「添字」または「index」という。その値が入る箱を「要素」という。
      customer[1] = "suzuki_taro@xxxx.com";   //[1]で２番目
      customer[2] = "090-0000-9999";    //[2]で3番目
    // 通常のforループパターン
    for (int i = 0; i < 3; i ++){
        System.out.println(customer[i]);
    }
  System.out.println();   //括弧の中を省略すると、空行を入れる

  String[] customer2 = {"鈴木太郎","suzuki.taro@xxx.com","090-0000-9999"};   //new　型名[]で初期化する場合、宣言と初期化を同時に行う
  // 拡張for分のパターン
  for (String customer2value : customer2){
      System.out.println(customer2value);
  }
  } 
}
