public class ForTest {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            int n = i + 1;
            if (i == 5){
                continue; //次のループにすすす。
            }
            System.out.println("繰り返し：" + i + "週目");
        }
    }
}