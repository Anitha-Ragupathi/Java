import java.io.*;

public class DeSerializableClass{
    public static void main( String args[]) throws IOException,ClassNotFoundException {
        Student object = null;
	String filename = "file.ser";
	FileInputStream fin = new FileInputStream( filename );
	ObjectInputStream ois = new ObjectInputStream( fin );

        object = (Student) ois.readObject();

	System.out.println( "Deserialization done");
	System.out.println( object.id);
	System.out.println( object.name);
	System.out.println( object.std);

    }
}
