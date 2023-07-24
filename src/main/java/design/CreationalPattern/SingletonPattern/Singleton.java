package design.CreationalPattern.SingletonPattern;

/**
 * 单例模式：单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。
 * 经典单例模式
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){
    }

    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
