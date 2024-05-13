import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Creating a ServerSocket object to listen on a specific port
            ServerSocket ss = new ServerSocket(2444);
            
            // Asking user to enter the port address for the server to listen on
            // This line is incorrect and should be removed
            // ServerSocket ss=new ServerSocket(port);

            // Printing the IPv4 address and local port number of the server socket
            System.out.println("Server Socket information: " + ss.getInetAddress() + " " + ss.getLocalPort());

            // Accepting an incoming client connection
            Socket s1 = ss.accept();

            // Printing information about the accepted client connection
            System.out.println("Client Accepted with Information: " + s1.getInetAddress() + " " + s1.getLocalPort());

            // This line won't be printed until a client connects
            System.out.println("Text that won't be printed until client comes in");

            // Creating a DataInputStream object to receive messages from the client
            DataInputStream dis = new DataInputStream(s1.getInputStream());

            // Reading the message from the client
            String str = dis.readUTF();
            System.out.println("Message: " + str);

            // Creating a DataOutputStream object to send messages to the client
            DataOutputStream dout = new DataOutputStream(s1.getOutputStream());
            
            // Sending a message back to the client
            dout.writeUTF("Hello Client");
            dout.flush();

            // Closing the streams and the socket
            dout.close();
            dis.close();
            s1.close();
            ss.close();
        } catch (IOException e) {
            // Handling any IOException that occurs during socket operations
            System.out.println("An error occurred: " + e);
        }
    }
}
