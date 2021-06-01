class Parent {
    public static void foo(){
        System.out.println("Im foo in super");

    }
    public void bar() {
        System.out.println("I'm bar in super");
    }
}

class Child extends Parent{
    	//@Override is not possible here
	//Since this method is static
	//static method can be accessed with object and with the class as well
	public static void foo(){
	    System.out.println("I'm foo in Child");
	}
	@Override
	public void bar(){
	    System.out.println("I'm bar in Child");
	}
	public static void main( String args[] ){
            Parent par = new Child();
	    Child child = new Child();

	    par.foo();
	    par.bar();

	    child.foo();
	    child.bar();
	}

}
