import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your first name:");
        firstName = scanner.nextLine();
        System.out.println("Please enter your favourite food:");
        favouriteFood = scanner.nextLine();
        System.out.println("First name: "+firstName);
        System.out.println("Age: "+age);
        System.out.println("Favourite food: "+favouriteFood);

    }

}