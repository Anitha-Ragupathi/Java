interface One{
    void printOne();
}
interface Two{
    void printTwo();
}
interface Three extends One,Two{
    void printThree();
    default void print(){
        System.out.println("default Three");
    }

    static void printStatic(){
        System.out.println("static Three");
    }

}

public class MultipleInheritance implements Three{
    public void printOne(){
        System.out.println("One");
    }
    public void printTwo(){
        System.out.println("Two");
    }
    public void printThree(){
        System.out.println("Three");
    }
    public static void main( String args[] ){
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.printOne();
	multipleInheritance.printTwo();
	multipleInheritance.printThree();
	multipleInheritance.print();
	Three.printStatic();
    }

}
