import java.net.*;
public class UDPServer{
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(5000);
        System.err.println("UDP server is waiting");

        byte[] buffer = new byte[1024];

        DatagramPacket request = new DatagramPacket(buffer, buffer.length);

        ds.receive(request);

        String msg = new String(
            request.getData(), 0, request.getLength(), "UTF-8"
        );

        String result = msg.toUpperCase();
        Thread.sleep(6);

        byte[] data = result.getBytes("UTF-8");

        DatagramPacket reply = new DatagramPacket(
            data, data.length, request.getAddress(), request.getPort());
        
        ds.send(reply);

        System.out.println("Sent reply: " + reply);

        ds.close();

    }
}