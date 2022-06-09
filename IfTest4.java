public class IfTest4{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (++a == 6 || --b ==10){  //前置と後置で比較する→単略評価は？
            System.out.println("条件成立！");
            System.out.println("a" + a);
            System.out.println("b" + b);
        } else{
            System.out.println("条件不成立！");
        }
    }
}
