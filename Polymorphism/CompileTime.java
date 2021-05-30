class Student{
    private int id;
    private String name;
    private String std;


    public void setId( int id ){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getStd(){
        return this.std;
    }
    public void print(){
        System.out.println(this.id);
    }
    public void print(int cnt) {
        System.out.println( cnt);
    }

}

class CompileTime{
    public static void main( String args[] ){
        Student stdnt = new Student();
	stdnt.setId(2222);
	stdnt.print();
	stdnt.print(3);
    }
}
