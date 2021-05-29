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

    public void getSeatHeight( int height ){
        this.seatHeight = height;
    }
    public int setSeatHeight() {
        return this.seatHeight;
    }
    public MountainBike( int gear, int speed, int startHeight){
        super( gear, speed);
	this.seatHeight = startHeight;
    }

    @Override
    public String toString(){
        return super.toString()+"\n seat height is "+ this.seatHeight;
    }

}

public class SingleInheritance{
    public static void main ( String args[] ) {
        MountainBike mb = new MountainBike( 3, 100, 25);

	System.out.println( mb.toString() );
    }
}
