class Student{
    private int id;
    private String name;
    private int age;
 
    Student(){
        this.id = 0;
	this.name = null;
	this.age = 0;
    }
    Student( int id, int age, String name){
        this.id = id;
	this.age = age;
	this.name = name;
    }

    public void setId( int id ){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setAge( int age ){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setName( String name ){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
   
}

public class Encapsulation{
    public static void main( String args[] ){
        Student s = new Student();
	s.setId(1);
	s.setName("Anitha");
	s.setAge(28);

	System.out.println(" Id:"+ s.getId());
	System.out.println(" Name:"+ s.getName());
	System.out.println(" Age:"+ s.getAge());
    }
}
