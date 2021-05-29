$ serialVer -classpath /c/Users/ragupathia/Documents/git_work/Java/SerialAndDeSerial Student
Student:    private static final long serialVersionUID = -8082976943847169320L;


Serialization & Deserialization:
	Serialization is a mechanism of converting the state of an object into a byte stream.
	Deserialization is a reverse process where the byte stream is used to recreate the actual java object into memory.
	Byte stream created is platform independent.
	To make java object serializable java.io.Serializable interface has to be implemented.
	The ObjectOutputStream has writeObject() method for Serializing the Object. throws IOException
	The ObjectInputStream has readObject() method for deserializing the object. throws IOEXception,ClassNotFoundException
	To save or persist state of an object we use serialization and deserialization.
	To travel an object accross network.
	Transient and static members can not be serialized
	Only non-static members can be serialized.
