package duotai;

public class Zoo {
    public void listenAndmal(Animal animal){
        //想听什么动物叫只需要让动物继承Animal类无需对Zoo类进行方法修改，这也是多态的优点
        animal.jiao();
        if (animal instanceof Cat){
            ((Cat)animal).play();
        }
        if (animal instanceof Dog){
            ((Dog)animal).yaoyiba();
        }
    }
}
