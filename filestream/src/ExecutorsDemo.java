import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {
    public static void main(String[] args) throws Exception{
        ExecutorService es=Executors.newFixedThreadPool(8);
        Future<Integer> f1=es.submit(new ThreadPoolDemo(500));
        Future<Integer> f2=es.submit(new ThreadPoolDemo(1000));
        Future<Integer> f3=es.submit(new ThreadPoolDemo(500));
        Future<Integer> f4=es.submit(new ThreadPoolDemo(1000));
        Future<Integer> f5=es.submit(new ThreadPoolDemo(500));
        Future<Integer> f6=es.submit(new ThreadPoolDemo(1000));
        Future<Integer> f7=es.submit(new ThreadPoolDemo(500));
        Future<Integer> f8=es.submit(new ThreadPoolDemo(1000));
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());
        System.out.println(f6.get());
        System.out.println(f7.get());
        System.out.println(f8.get());


    }
}
