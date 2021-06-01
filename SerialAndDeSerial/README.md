$ serialVer -classpath /c/Users/ragupathia/Documents/git_work/Java/SerialAndDeSerial Student
Student:    private static final long serialVersionUID = -8082976943847169320L;


Serialization & Deserialization:
-------------------------------

	-> Serialization is a mechanism of converting the state of an object into a byte stream.
	-> Deserialization is a reverse process where the byte stream is used to recreate the actual java object into memory.
	-> Byte stream created is platform independent.
	-> To make java object serializable java.io.Serializable interface has to be implemented.
	-> The ObjectOutputStream has writeObject() method for Serializing the Object. throws IOException
	-> The ObjectInputStream has readObject() method for deserializing the object. throws IOEXception,ClassNotFoundException
       	-> To save or persist state of an object we use serialization and deserialization.
	-> To travel an object accross network.
	-> Transient and static members can not be serialized
	-> Only non-static members can be serialized.
	-> Final variable will also be the same.
	-> You can serialize any number of objects in a single file.
	-> Remember, when you de-serialize follow the same order.
	-> or use instanceOf to check the object type, if you dont remember the order 

	Object o = ois.readOject();

	if( o instanceOf Dog ){
	    Dog d = (Dog) o;
	}

Object Graaph in Serialization
------------------------------ 
	-> When we are serializing an Object, set of object reachable from that object will be serialized Automatically. This is known as Object graph.
	-> In Object graph everything should be serializable. If not we will get runtime exception.

Customized Serialization:
------------------------
	-> Transient variable cannot be serialized, in that case, we will lose the data.
	-> Customized serialization can be implemented using the following two method:
		-> private void writeObject( ObjectOutputStream oos) throws Exception
		-> private void readObject ( ObjectInputStream ois) throws Exception
	-> The above methods will be executed automatically by the java (also known as Callback stack) at the time serialization / deserialization.

Serialization with respect to Inheritance:
-----------------------------------------
	-> If the parent is serializable, then every child is serializable.
	-> That is Serializable Nature is inheriting from Parent to Child.
	-> Even though the child doesnt implement serializable, if Parent class implements serializable then we can serialize child class object.
	-> Event though child class didnt implement Serializable, we can iplement serializable in child class.
	-> At the Time of serialization, jvm will check if there is any Instance variable is inheriting from Non-Serializabel parent or not. If any 
	   variable inheriting from Non-Serializable parent then JVM ignore the original value sets the default value.
	-> At the time of de-serialization JVm will check is any parent class is Non-Serializable or not. if yes, then JVM will execute Instance Control Flow in that 
	   Non-serializable parent and share it instance variable to the current.
	-> Nom-Serializable parent JVM will always invoke No argument constructor.Hence, every Non-Serializable Class should contain a no-argument constructor.
	-> Otherwise we will get a Invalid class exception
	

