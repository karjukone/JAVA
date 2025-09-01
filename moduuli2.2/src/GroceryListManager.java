import java.util.ArrayList;
import java.util.List;

class GroceryItem {
    String name;
    double cost;
    String category;
    int quantity;

    GroceryItem(String name, double cost, String category, int quantity) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }
}

public class GroceryListManager {
    private List<GroceryItem> groceryList = new ArrayList<>();

    // Add item with cost and category
    public void addItem(String item, double cost, String category, int quantity) {
        for (GroceryItem g : groceryList) {
            if (g.name.equalsIgnoreCase(item)) {
                System.out.println(item + " is already in the list");
                return;
            }
        }
        groceryList.add(new GroceryItem(item, cost, category, quantity));
        System.out.println(item + " added to category: " + category + " price: " + cost + "€" + " Quantity: " + quantity + " kpl \n");
    }

    public void displayList() {
        System.out.println("\nGrocery List:");
        for (GroceryItem g : groceryList) {
            System.out.println("- " + g.name + " - " + g.cost + "€ (" + g.category + ")");
        }
    }

    public void displayByCategory(String category) {
        System.out.println("\nItems in category: " + category);
        int i = 1;
        for (GroceryItem g : groceryList) {
            if (g.category.equalsIgnoreCase(category)) {
                System.out.println(i++ + ". " + g.name + " - " + g.cost + "€");
            }
        }
    }

    public void removeItem(String item) {
        boolean removed = groceryList.removeIf(g -> g.name.equalsIgnoreCase(item));
        if (removed) {
            System.out.println("\n" + item + " removed from the list");
        }
    }



    public double calculateTotalCost() {
        double total = 0;
        for (GroceryItem g : groceryList) {
            total += g.cost;
        }
        return total;
    }

    public void updateQuantity(String item, int NewQuantity) {
        for (GroceryItem g : groceryList) {
            if (g.name.equalsIgnoreCase(item)) {
                g.quantity = NewQuantity;
                System.out.println("\nUpdated quantity of: " + item + " is: " + NewQuantity);
            }
        }
    }

    public void displayAvailableItems() {
        System.out.println("\nAvailable Grocery Items:");
        int i = 1;
        for (GroceryItem g : groceryList) {
            if (g.quantity > 0) {
                System.out.println(i++ + ". " + g.name + " - " + g.cost + "€ (" + g.category + "), Quantity: " + g.quantity);
            }
        }
        if (i == 1) {
            System.out.println("No items with positive quantity.");
        }
    }

    public static void main(String[] args) {
        GroceryListManager prisma = new GroceryListManager();
        prisma.addItem("Energy drink", 2.5, "Drinks", 2);
        prisma.addItem("Pepsi max", 3.5, "Drinks", 1);
        prisma.addItem("Milk", 1.0, "Dairy", 3);
        prisma.addItem("Bread", 1.5, "Baked goods", 1);
        prisma.addItem("Cheese", 7.0, "Dairy", 2);

        prisma.removeItem("Cheese");

        prisma.updateQuantity("Milk", 2);

        prisma.displayAvailableItems();

        prisma.displayList();
        prisma.displayByCategory("Dairy");
        System.out.println("\nTotal Cost: " + prisma.calculateTotalCost() + "€");
    }
}
