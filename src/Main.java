public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("Test", "Te3st", "Test");
        if (success) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");

        }

    }
}