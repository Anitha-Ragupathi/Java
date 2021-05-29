import java.io.Serializable;

public class Student implements java.io.Serializable{
    int id;
    String name;
    transient String std;

    public Student( int id, String name, String std){
        this.id = id;
	this.name = name;
	this.std = std;
    }

}

