import java.io.*;

public class SerializableClass{
    public static void main( String args[] ) throws IOException{
        Student object = new Student(1,"Anitha","IV");
	String filename = "file.ser";

	FileOutputStream file = new FileOutputStream(filename);
	ObjectOutputStream out = new ObjectOutputStream(file);
	out.writeObject(object);
	out.close();
	file.close();
	System.out.println("Object is serialized");
	System.out.println(object.id);
	System.out.println(object.name);
	System.out.println(object.std);
    }
}
