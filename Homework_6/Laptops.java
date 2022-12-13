package Homework_6;

public class Laptops {
    private String model;
    private int ram;
    private int hardDiskCapacity;
    private String operationSystem;
    private String color;
    private double displayDiagonal;

    public int getModel() {
        if (model.equals("Lenovo")) return 1;
        if (model.equals("Asus")) return 2;
        else return 3;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public int getOperationSystem() {
        if (operationSystem.equals("Windows")) return 1;
        else return 2;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getColor() {
        if (color.equals("silver")) return 1;
        else if (color.equals("black")) return 2;
        else return 3;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(double displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", hardDiskCapacity=" + hardDiskCapacity +
                ", operationSystem='" + operationSystem + '\'' +
                ", color='" + color + '\'' +
                ", displayDiagonal=" + displayDiagonal +
                '}';
    }
}
