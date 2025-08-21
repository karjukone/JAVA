import java.util.Scanner;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the name of the first cat: ");
        Cat cat1 = new Cat(scanner.nextLine());
        System.out.println("Give the name of the second cat: ");
        Cat cat2 = new Cat(scanner.nextLine());

        // Call the meow method on the cat instance
        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();
    }
}