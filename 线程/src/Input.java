public class Input implements Runnable {
     private Resouse r;
    public Input(Resouse r){
        this.r=r;
    }
    public void run(){
        int i=0;
        while(true){
            synchronized (r){
                if(r.flag){
                    try{
                        r.wait();
                    }catch (Exception ex){}
                }
                if(i%2==0){
                    r.name="张三";
                    r.sex="男";
                }else{
                    r.name="lisi";
                    r.sex="nv";
                }
                i++;
                r.flag=true;
                r.notify();
            }

        }
    }
}
