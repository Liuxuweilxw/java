public class ThreadDemo {
    public static void main(String[] args){
        Resouse r=new Resouse();
        Input in=new Input(r);
        Output ou=new Output(r);

        Thread tin=new Thread(in);
        Thread tou=new Thread(ou);

        tin.start();
        tou.start();
    }


}
