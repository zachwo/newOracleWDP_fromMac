package ultraman;

public class Monster {
    int power;

     public Monster(){
         power = 50;
     }

     public void beatUltraman(Ultraman u){
         u.power -= 5;
         if (u.power<= 0){
             System.out.println("奥特曼输了");
         }
     }
}
