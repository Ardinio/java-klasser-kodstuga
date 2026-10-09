public class Raketuppskjutning {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i == 5) {
                continue; // Hoppar över utskriften av 5
            }
            System.out.println(i);
        }

        System.out.println("LIFTOFF!");
    }
}
