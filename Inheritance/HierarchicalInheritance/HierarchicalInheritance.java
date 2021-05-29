class A{
    public void printA(){
        System.out.println("A");
    }
}
class B extends A{
    public void printB(){
        System.out.println("B");
    }
}
class C extends A{
    public void printC(){
        System.out.println("C");
    }
}
class D extends A{
    public void printD(){
        System.out.println("D");
    }
}
public class HierarchicalInheritance{
    public static void main( String args[]){
        D d = new D();
	C c = new C();
	B b = new B();
	A a = new A();

	d.printD();
	d.printA();

	c.printC();
	c.printA();

	b.printB();
	b.printA();

	a.printA();
    }
}
