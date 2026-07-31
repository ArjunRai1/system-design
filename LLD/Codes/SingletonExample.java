import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Singleton{
    //Using volatile keyword as without it, JVM allows reordering across different threads
    private static volatile Singleton instance = null;
    private static Lock mutex = new ReentrantLock();
    private Singleton(){
        System.out.println("Singleton constructor called");
    }
    public static Singleton getInstance(){
        if(instance==null) {
            mutex.lock();
            try {
                if(instance==null)
                    instance = new Singleton();
            }
            finally{
                mutex.unlock();
            }
        }
        return instance;
    }
}

public class SingletonExample{
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}