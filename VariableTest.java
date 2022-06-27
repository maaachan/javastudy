public class VariableTest{
    public static void main(String[] args){
        int myAge;  // 変数宣言：情報が入る箱の形を決めて、コンピューターに伝える
        myAge = 35; //初期化している
        // myAge = 40; //上書きしている
        //myAge = myAge + 5;
        System.out.println(myAge);

        int[] ourAges = new int[5];  // 数値（byte,int,long.float.double)のデータ型には０が初期値
        System.out.println(ourAges[1] + 5);  //2番目を表示：初期値として０が元々代入されている

        boolean[] isChild  = new boolean[5];   //booleanのデータ型にはfalseが初期値
        System.out.println(isChild[1]);    //2番目を表示：初期値としてfalseが元々代入されている 

        char[] letter = new char[5];  // char型のデータ型には’’が初期値
        System.out.println(letter[1]);  //2番目を表示：初期値として’’が元々代入されている

        String[] text = new String[5];  // Stringのデータ型にはnullが初期値
        System.out.println(text[1]);  //2番目を表示：初期値としてnullが元々代入されているs
   
    }
}
