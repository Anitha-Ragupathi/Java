class Animal{
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public void print(){
        System.out.println(name);
    }
}
class Dog extends Animal{
    @Override
    public void print(){
        System.out.println("Dog"+ getName());
    }
}

class RunTime{
    public static void main( String args[] ){
        Dog dog = new Dog();
	dog.setName("Kombai");
	dog.print();
    }
}

