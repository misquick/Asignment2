public class Main {
    public static void main(String[] args){
        Computer computer1 = new Computer("Dell", "XPS 15", "Intel Core i7", 16);
        Computer computer2 = new Computer("Asus", "Zephyrus", "AMD Ryzen 7", 32);
        Computer computer3 = new Computer("Apple", "MacBook Pro", "M3", 8);

        System.out.println("Computer 1:");
        computer1.displayInfo();
        System.out.println();

        System.out.println("Computer 2:");
        computer2.displayInfo();
        System.out.println();

        System.out.println("Computer 3:");
        computer3.displayInfo();
        System.out.println();

        System.out.println("Upgrading RAM for Computer 3...");
        computer3.upgradeRAM(8);
        System.out.println();

        System.out.println("Updated information for Computer 3:");
        computer3.displayInfo();
    }
}
