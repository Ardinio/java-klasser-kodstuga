public class Pet {
    private String name;
    private int hunger;
    private int energy;

    Pet(String name) {
        this.name = name;
        this.hunger = 50; // Initial hunger level
        this.energy = 50; // Initial energy level
    }

    void eat() {
        hunger -= 10;
        energy += 5;
        if (hunger < 0) hunger = 0;
        if (energy > 100) energy = 100;
        System.out.println(name + " is eating. Hunger level: " + hunger + ", Energy level: " + energy);
    }

    void play() {
        if (energy < 30) {
            System.out.println("Jag är trött!");
            return;
        } 
        if (hunger > 70) {
            System.out.println("Jag är hungrig!");
            return;
        }
        energy -= 5;
        hunger += 10;
        if (energy < 0) energy = 0;
        if (hunger > 100) hunger = 100;
        System.out.println(name + " is playing. Energy level: " + energy + ", Hunger level: " + hunger);
    }
}
