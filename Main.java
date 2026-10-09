public class Main {
    public static void main(String[] args) {
        Djur hund = new Djur("Rex", 5, "Voff!");
        Djur katt = new Djur("Whiskers", 3, "Mjau!");

        MonsterArena monster1 = new MonsterArena("Goblin", 100);

        Pet Felix = new Pet("Felix");

        hund.görLjud();
        katt.görLjud();

        while (true) {
            System.out.println(monster1.name + " har " + monster1.health + " liv kvar.");
            monster1.health -= 10; // Minskar hälsan med 10
            if (monster1.health <= 0) {
                System.out.println(monster1.name + " är besegrad!");
                break;
            }
        }

        Felix.eat();
        Felix.play();
        Felix.play();
        Felix.play();
        Felix.play();
        Felix.play();
        Felix.play();
    }
}
