import java.net.*;
import java.io.*;
public class TCPServer{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting.....");

        Socket s = ss.accept();
        System.out.println("Client Connected");

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );

        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true
        );

        String msg = in.readLine();
        out.println(msg.toUpperCase());

        ss.close();
        s.close();
    }
}