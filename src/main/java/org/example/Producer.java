package org.example;

public class Producer {
   private String model;
    private String type;


    public Producer(String model, String type) {
        this.model = model;
        this.type = type;
    }


    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model + " " + type;
    }

}

