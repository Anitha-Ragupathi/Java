abstract class Animal{
    private String name;

    Animal( String name ){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName( String name ){
        this.name = name;
    }
    
    public abstract void animalType( String type );
    public void print( ){
        System.out.println( getName() ); 
    }
    
}

class Domestic extends Animal{
    Domestic( String name ){
        super( name );
    }

    @Override
    public void animalType( String type ){
        System.out.println(" animal type"+ type);
    }
}
class AbstractionTest{
    public static void main ( String args[] ){
        Domestic domestic = new Domestic( "Dog" );
	domestic.animalType( " domestic ");
	domestic.print();
//This is not possible since Animal is an abstract class
//	Animal animal = new Animal("Lion");
	
	//This is possible
	Animal an = new Domestic(" cat ");
	an.print();
    }
}
