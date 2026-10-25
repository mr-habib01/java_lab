import java.net.*;
import java.util.Scanner;
public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String msg = sc.nextLine();

        byte[] data = msg.getBytes("UTF-8");

        if(data.length>1024){
            System.out.println("Message is too long!");
            ds.close();
            sc.close();
            return;
        }

        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket request = new DatagramPacket(data, data.length, ip, 5000);

        ds.send(request);

        byte[] buffer = new byte[1024];
        DatagramPacket reply = new DatagramPacket(buffer, buffer.length);

        ds.receive(reply);

        String result = new String(reply.getData(), 0, reply.getLength(),"UTF-8");

        System.out.println("Server reply: " + result);

        ds.close();
        sc.close();

    }
}
