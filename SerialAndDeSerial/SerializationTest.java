import java.io.*;

//Serializable is a marker interface
//Interface without any method declaration is known as Marker interface
class Dog implements Serializable{
    private int type;
    private String color;

    Dog( int type, String color){
        this.type = type;
	this.color = color;
    }

    public void setColor( String color ){
        this.color = color;
    }

    public void setType( int type ){
        this.type = type;
    }

    public String getColor(){
        return this.color;
    }

    public int getType(){
        return this.type;
    }

}

public class SerializationTest{
    public static void main ( String args[] ) throws IOException, FileNotFoundException, ClassNotFoundException{
        Dog dog = new Dog( 1, "white");
	System.out.println("Type :"+dog.getType()+" Color :"+ dog.getColor() );

	FileOutputStream fos = new FileOutputStream( "sertest.ser" );
        ObjectOutputStream oos = new ObjectOutputStream( fos );
	oos.writeObject(dog);
	System.out.println( "Serialization Done............." );


	FileInputStream fis = new FileInputStream( "sertest.ser" );
	ObjectInputStream ois = new ObjectInputStream ( fis );
	Dog dogRead = (Dog) ois.readObject();

	System.out.println("Type :"+dogRead.getType()+" Color :"+ dogRead.getColor() );
    }

}
