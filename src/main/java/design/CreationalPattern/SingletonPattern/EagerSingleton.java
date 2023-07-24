package design.CreationalPattern.SingletonPattern;

/**
 * 饿汉式单例模式
 */
public class EagerSingleton {
    public static final EagerSingleton ea = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getEa(){
        return ea;
    }
}
