import java.util.concurrent.Callable;

public  class ThreadPoolDemo implements Callable<Integer> {
    private int a=0;
    public ThreadPoolDemo(int  a){
        this.a=a;
    }
    public Integer call(){
        int sum=0;
        for(int i=1;i<=a;i++)
            sum=sum+i;
        return sum;
    }
}
