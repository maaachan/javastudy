public class IfTest3{
public static void main(String[] args){
    int myAge =35;
    String myBloodType = "A";
    if(myAge == 35 || myBloodType.equals("B")){
        System.out.println("私の年齢は35歳で血液型はです！");
    } else if(myAge == 35 || myBloodType.equals("A")){
        System.out.println("私の年齢は35歳で血液型はA型です！");
    } else if(myAge == 40 || myBloodType.equals("O")){
        System.out.println("私の年齢は40歳で血液型はA型です！");
    }else{
        System.out.println("私の年齢と血液型は、あなたの考えていることとは違います");
    }
    System.out.println("私の出身地は・・・");
}
}
