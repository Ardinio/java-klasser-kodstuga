public class Djur {
    String namn;
    int ålder;
    String ljud;

    Djur(String namn, int ålder, String ljud) {
        this.namn = namn;
        this.ålder = ålder;
        this.ljud = ljud;
    }

    void görLjud() {
        System.out.println(namn + " säger: " + ljud);
    }
}
