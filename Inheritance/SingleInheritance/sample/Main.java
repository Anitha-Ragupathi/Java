class One{
    public void print(){
        System.out.println(" Hi from Class One");
    }

}

class Two extends One{
    public void print2(){
        System.out.println(" Hi from Class two");
    }
 
}

public class Main{
    public static void main ( String args[] ){
        Two two = new Two();
	two.print();
	two.print2();
    }
}

