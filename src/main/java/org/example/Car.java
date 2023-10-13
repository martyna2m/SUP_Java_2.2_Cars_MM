package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Car {
    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    ArrayList<Dimension> dimension;

    private static ArrayList<Car> cars = new ArrayList<>();


    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimension) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension = dimension;
        cars.add(this);
    }


    public Producer getProducer() {
        return producer;
    }

    public boolean getIsAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public ArrayList<Dimension> getDimension() {
        return dimension;
    }


    public static void getCountries(String carBrand, int trunkCapacity) {
        Set<Country> setOfCountries = new HashSet<>();
        for (Car c : cars) {
            if (c.getProducer().getModel().equals(carBrand)) {
                if (c.getIsAutomaticGear()) {
                    for (Dimension dimOption : c.getDimension()) {
                        if (dimOption.getTrunkCapacity() > trunkCapacity) {
                            List<Country> ctrList = c.getMarket().getCountries();
                            setOfCountries.addAll(ctrList);
                        }
                    }

                }
            }
        }
        System.out.println(setOfCountries);
    }
}
