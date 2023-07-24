package design.CreationalPattern.SingletonPattern;

public class Test {
    public static void main(String[] args) {
        //测试经典单例模式
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        //测试饿汉式单例模式
        EagerSingleton eagerSingleton1 = EagerSingleton.getEa();
        EagerSingleton eagerSingleton2 = EagerSingleton.getEa();

        System.out.println(eagerSingleton1);
        System.out.println(eagerSingleton2);

        //测试懒汉式单例模式
        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
    }
}
