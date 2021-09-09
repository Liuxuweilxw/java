import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try{
            fis=new FileInputStream("D:\\a.avi");
            fos=new FileOutputStream("E:\\a.avi");
            byte[] bytes=new byte[1024];
            int len=0;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException ex){
            System.out.println(ex);
            throw new RuntimeException("文件复制失败");
        }finally {
                try{
                    if(fos!=null)
                        fos.close();
                }catch(IOException ex){
                    throw new RuntimeException("资源释放失败");
                }finally {
                        try{
                            if(fis!=null)
                                fis.close();
                        }catch(IOException ex){
                            throw new RuntimeException("资源释放失败");
                        }

                    }
                }
    }
}
