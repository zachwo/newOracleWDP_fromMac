package ultraman;

public class Fight {
    public static void main(String[] args) {
        Ultraman dijia = new Ultraman();
        Monster m = new Monster();
        System.out.println(m.power);
        dijia.beatMonster(m);
        System.out.println(m.power);
    }
}
