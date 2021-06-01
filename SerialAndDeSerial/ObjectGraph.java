import java.io.*;

class C implements Serializable{
    B b = new B();
}

class B implements Serializable{
    A a = new A();
}

class A implements Serializable{
    int j = 20;
}

public class ObjectGraph{
    public static void main( String args[] ) throws IOException, FileNotFoundException, ClassNotFoundException{
        C c = new C();

        FileOutputStream fos = new FileOutputStream("objectgraph.ser");
	ObjectOutputStream oos = new ObjectOutputStream( fos );
	oos.writeObject( c );

	System.out.println( " Serialization done .........");

	FileInputStream fis = new FileInputStream( "Objectgraph.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	C c2 = (C) ois.readObject();

	System.out.println( c2.b.a.j);

    }
}
