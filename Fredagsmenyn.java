public class Fredagsmenyn {
    public static void main(String[] args) {
        int menuNumber = 3;

        switch (menuNumber) {
            case 1:
                System.out.println("Du har valt: Kyckling med ris.");
                break;
            case 2:
                System.out.println("Du har valt: Fisk med potatis.");
                break;
            case 3:
                System.out.println("Du har valt: Vegetarisk lasagne.");
                break;
            case 4:
                System.out.println("Du har valt: Pasta med tomatsås.");
                break;
            default:
                System.out.println("Ogiltigt val. Vänligen välj ett nummer mellan 1 och 3.");
                break;
        }
    }
}
