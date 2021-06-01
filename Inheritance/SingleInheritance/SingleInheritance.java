class Bicycle{
    private int gear;
    private int speed;
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setSpeed( int speed ) {
        this.speed = speed;
    }

    public void setGear( int gear){
        this.gear = gear;
    }
    public int getGear() {
        return gear;
    }

    public Bicycle( int gear, int speed) {
        this.gear = gear;
	this.speed = speed;
    }

    public void speedUp( int increment ){
        speed += increment;
    }
    public void applyBrake( int decrement) {
        speed -= decrement;
    }

    public String toString() {
        return " No of gears are "+ this.gear + "\n speed of the bicycle "+this.speed ;
    }
}
class MountainBike extends Bicycle{
    private int seatHeight;

    public void setSeatHeight( int height ){
        this.seatHeight = height;
    }
    public int getSeatHeight() {
        return this.seatHeight;
    }
    public MountainBike( int gear, int speed, int startHeight){
        super( gear, speed);
	this.seatHeight = startHeight;
    }
    @Override
    public void applyBrake( int decrement ){
        super.setSpeed( super.getSpeed() - decrement);
	System.out.println(" MountainBike");
    }
    @Override
    public String toString(){
        return super.toString()+"\n seat height is "+ this.seatHeight;
    }

}

public class SingleInheritance{
    public static void main ( String args[] ) {
        MountainBike mb = new MountainBike( 3, 100, 25);
        Bicycle bicycle = new MountainBike( 2, 80, 25);
        System.out.println( bicycle.toString() );
	bicycle.speedUp(3);
	System.out.println( bicycle.toString() );
        bicycle.applyBrake( 3 );
//This will throw compilation error as cannot find symbol 
// Can call only methods in the super type, since super type is used to create the object
//	bicycle.setSeatHeight( 30 );
	System.out.println( bicycle.toString() );


	System.out.println( mb.toString() );
    }
}
