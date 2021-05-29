class LevelOne{
    public void print(){
        System.out.println(" Level One");
    }
}

class LevelTwo extends LevelOne{
    public void print2(){
        System.out.println(" Level Two");
    }
}
class LevelThree extends LevelTwo{
    public void print3() {
        System.out.println(" Level Three");
    }
}
public class MultiLevelInheritance{
    public static void main( String args[] ){
        LevelThree l3 = new LevelThree();
        l3.print3();
	l3.print2();
	l3.print();
    }
}
