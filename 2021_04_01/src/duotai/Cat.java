package duotai;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    @Override
    public void jiao() {
        System.out.println("小猫咪咪叫");
    }
    public void play(){
        System.out.println("玩个毛线球");
    }
}
