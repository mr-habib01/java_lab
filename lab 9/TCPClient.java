import java.net.*;
import java.util.Scanner;
import java.io.*;
public class TCPClient{
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 5000);

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );

        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true
        );

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String msg = sc.nextLine();

        out.println(msg);

        String result = in.readLine();
        System.out.println("Server reply: " + result);
    }
}