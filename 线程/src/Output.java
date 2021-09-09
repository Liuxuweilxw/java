public class Output implements Runnable {
    private Resouse r;
    public Output(Resouse r){
        this.r=r;
    }
    public void run(){
        while(true){
            synchronized (r){
                if(!r.flag){
                    try{
                        r.wait();
                    }catch (Exception ex){}
                }
                System.out.println(r.name+"...."+r.sex);
                r.flag=false;
                r.notify();
            }

        }

    }

}
