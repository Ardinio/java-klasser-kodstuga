public class BergochDalbana {
    public static void main(String[] args) {
        int personAge = 25;
        double personHeight = 1.75;

        if (personAge >= 18 && personHeight >= 1.6) {
            System.out.println("Du kan åka berg-och dalbana!");
        } else if (personAge < 18 && personHeight >= 1.6) {
            System.out.println("Du får åka berg-och dalbana med en vuxen.");
        } else {
            System.out.println("Du kan inte åka berg-och dalbana.");
        }
    }
}