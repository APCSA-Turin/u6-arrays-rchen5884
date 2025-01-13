import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box(20);
        Box b3 = new Box(10, 5, 20);
        
        Box greater = b1.greaterVolume(b2);
        System.out.println(greater == b2);
        greater = b2.greaterVolume(b1);
        System.out.println(greater == b2);
        greater = b1.greaterVolume(b3);
        System.out.println(greater == null);
        greater = b3.greaterVolume(b1);
        System.out.println(greater == null);
        
        
    }
}


