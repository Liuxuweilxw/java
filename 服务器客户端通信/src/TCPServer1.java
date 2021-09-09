

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();

        InputStream in=socket.getInputStream();
        File upload=new File("//Users//liuxuwei//Desktop//upload");
        if(!upload.exists()){
            upload.mkdirs();
        }
        String filename="liuxuwei"+System.currentTimeMillis()+new Random().nextInt(9999)+".png";
        FileOutputStream fos=new FileOutputStream(upload+File.separator+filename);

        byte[] data=new byte[1024];
        int len=0;
        while((len=in.read(data))!=-1){
            fos.write(data,0,len);
        }

        OutputStream out=socket.getOutputStream();
        out.write("上传成功".getBytes());

        fos.close();
        socket.close();
        server.close();
    }
}
