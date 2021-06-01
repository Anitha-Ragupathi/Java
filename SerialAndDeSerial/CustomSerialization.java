import java.io.*;

class User implements Serializable{
    String name = "Anitha";
    String pswd = "hi123";

    private void writeObject( ObjectOutputStream oos ) throws Exception{
        oos.defaultWriteObject();
	String pwd = "123"+pswd;
	oos.writeObject(pwd);
    }

    private void readObject( ObjectInputStream ois ) throws Exception{
        ois.defaultReadObject();
	String pwd = (String) ois.readObject();
	pswd = pwd.substring(3);
    }

}
public class CustomSerialization{
    public static void main ( String args[] ) throws IOException, FileNotFoundException, ClassNotFoundException{
        User u = new User();

	FileOutputStream fos = new FileOutputStream("custSer.ser");
	ObjectOutputStream oos = new ObjectOutputStream( fos );
	oos.writeObject(u);
        System.out.println("Serialization done.....");

	FileInputStream fis = new FileInputStream("custSer.ser");
	ObjectInputStream ois = new ObjectInputStream( fis );
	User u2 = (User) ois.readObject();

	System.out.println( u2.name +"----------"+u2.pswd );
    }
}
