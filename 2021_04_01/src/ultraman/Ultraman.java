package ultraman;

public class Ultraman {
    int power;

    public Ultraman(){
        power = 100;
    }

    //打怪兽
    public void beatMonster(Monster m){
        m.power -= 10;
        if (m.power <= 0){
            System.out.println("怪兽死了");
        }
    }
}
