public class Computer {
    public String brand;
    public String model;
    public String processor;
    public int RAM;

    public Computer(String brand, String model, String processor, int RAM) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.RAM = RAM;
    }

    public Computer() {
        this.brand = "";
        this.model = "";
        this.processor = "";
        this.RAM = 0;
    }

    public void displayInfo() {
        System.out.println("Computer Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + "GB");
    }

    public void upgradeRAM(int additionalRAM) {
        this.RAM += additionalRAM;
        System.out.println("RAM has been upgraded to " + RAM + "GB.");
    }
}
