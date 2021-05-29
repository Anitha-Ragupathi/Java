class Car{
    int no;
    int model;

    Car( int no, int model) {
	this.no = no;
	this.model = model;
    }

    void print(){
        System.out.println( "Model "+this.model+" No "+ no);
    }
}
class CarWrapper {
    Car c;
    CarWrapper( Car c ) {
        this.c = c;
    }
}

public class SwapObject{
    static void swap( CarWrapper cw1, CarWrapper cw2) {
        Car temp = cw1.c;
	cw1.c = cw2.c;
	cw2.c = temp;
    }
    public static void main ( String args[] ) {
        Car c1 = new Car(1, 101);
	Car c2 = new Car(2, 202);

	CarWrapper cw1 = new CarWrapper(c1);
	CarWrapper cw2 = new CarWrapper(c2);
        swap( cw1, cw2);

	cw1.c.print();
	cw2.c.print();


    }
}
