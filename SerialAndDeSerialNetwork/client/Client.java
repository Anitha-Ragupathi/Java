import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client{
    public static void main ( String args[] ) throws IOException { 
        Socket socket = new Socket("localhost",7777);
	System.out.println("Connected!!!!");

	OutputStream outputStream = socket.getOutputStream();
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

	List<Message> messages = new ArrayList<>();
	messages.add( new Message("Hello I'm on the other side"));
	messages.add( new Message("How are you doing"));
	messages.add( new Message("What time is it?"));
	messages.add( new Message("HI HI HI HI HI "));

        System.out.println(" Sending message to the server socket");
	objectOutputStream.writeObject(messages);

	System.out.println(" Closing socket and terminating program");
	socket.close();
    }
}
