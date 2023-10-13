package org.example;

public class Dimension {
    private int high_cm;
    private int width_cm;
    private int trunkCapacity;


    public Dimension(int high_cm, int width_cm, int trunkCapacity) {
        this.high_cm = high_cm;
        this.width_cm = width_cm;
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;

    }
}
