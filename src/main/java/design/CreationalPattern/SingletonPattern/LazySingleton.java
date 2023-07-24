package design.CreationalPattern.SingletonPattern;

/**
 * 懒汉式单例模式
 */
public class LazySingleton extends Thread{
    //这里添加volatile 防止在获取实例的时候，多个线程同时读取该静态变量
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

//    //这里添加线程同步方法,相比较下面 此种较耗资源
//    public synchronized static LazySingleton getLazySingleton(){
//        if (lazySingleton == null){
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    //这里二次判断的原因防止多个线程等待，获取锁之后都认为变量为空，都创建之后导致线程不唯一。
    public synchronized static LazySingleton getLazySingleton(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    @Override
    public void run() {
        System.out.println(lazySingleton);
    }
}
