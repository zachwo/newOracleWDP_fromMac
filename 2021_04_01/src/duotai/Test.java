package duotai;

public class Test {
    public static void main(String[] args) {
        // 多态：即父类类型指向子类对象
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Zoo zoo = new Zoo();
//        zoo.listenAndmal(dog);
//        zoo.listenAndmal(cat);

        //强制上下转型
        Dog dog = new Dog();
        dog.yaoyiba();

        //向下转型：父类对象向子类对象转
        Animal animal = new Dog();//向上转型
        Dog dog1 = (Dog) animal;//向下转型
        dog1.yaoyiba();

        //实例运算符：判断对象是否是某种类型的
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Cat);
        Dog doggg = new Dog();
        Cat cat = new Cat();
        Zoo zoo = new Zoo();
        zoo.listenAndmal(doggg);
        zoo.listenAndmal(cat);

    }
}
