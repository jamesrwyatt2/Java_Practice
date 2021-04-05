import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double legC = Math.sqrt(legA*legA + legB*legB);
        System.out.println(legC);
        return legC;
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
    }
}