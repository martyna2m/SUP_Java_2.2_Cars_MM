package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country Poland = new Country("Poland", 'P');
        Country Germany = new Country("Germany", 'G');
        Country France = new Country("France", 'F');
        Country England = new Country("England", 'E');
        Country Spain = new Country("Spain", 'S');

        List<Country> transportMarketList = List.of(France, Germany, Poland, England);
        List<Country> businessMarketList = List.of(France, Germany, England);
        List<Country> cargoMarketList = List.of(France, England, Spain);
        List<Country> medicalMarketList = List.of(France, Germany, England, Poland);
        List<Country> agriMarketList = List.of(England, Germany, Poland);


        Market transportMarket = new Market("Transport", transportMarketList);
        Market businessMarket = new Market("Business", businessMarketList);
        Market cargoMarket = new Market("Cargo", cargoMarketList);
        Market medicalMarket = new Market("Medical Sector", medicalMarketList);
        Market agriMarket = new Market("Agriculture", agriMarketList);


        Dimension dim1 = new Dimension(165, 185, 400);
        Dimension dim2 = new Dimension(170, 200, 560);
        Dimension dim3 = new Dimension(155, 190, 150);
        Dimension dim4 = new Dimension(159, 175, 280);
        Dimension dim5 = new Dimension(169, 185, 160);
        Dimension dim6 = new Dimension(199, 175, 800);
        Dimension dim7 = new Dimension(170, 165, 320);
        Dimension dim8 = new Dimension(189, 175, 200);
        Dimension dim9 = new Dimension(159, 175, 400);
        Dimension dim10 = new Dimension(155, 175, 100);


        List<Dimension> dimensionsList1 = List.of(dim1, dim3, dim8, dim9);
        List<Dimension> dimensionsList2 = List.of(dim5, dim10, dim4);
        List<Dimension> dimensionsList3 = List.of(dim1, dim2, dim6, dim7);

        ArrayList<Dimension> dimensionsArrayList1 = new ArrayList<>(dimensionsList1);
        ArrayList<Dimension> dimensionsArrayList2 = new ArrayList<>(dimensionsList2);
        ArrayList<Dimension> dimensionsArrayList3 = new ArrayList<>(dimensionsList3);


        Producer skoda1 = new Producer("Skoda", "Fabia");
        Producer bmw1 = new Producer("BMW", "x5");
        Producer bmw2 = new Producer("BMW", "x6");
        Producer bmw3 = new Producer("BMW", "i5");
        Producer nissan1 = new Producer("Nissan", "Juke");
        Producer mercedes1 = new Producer("Mercedes-Benz", "ECV");
        Producer mercedes2 = new Producer("Mercedes-Benz", "EQE");
        Producer mercedes3 = new Producer("Mercedes-Benz", "Vito");
        Producer renault1 = new Producer("Renault", "Traffic");
        Producer volkswagen1 = new Producer("Volkswagen", "Caddy Cargo");


        Car car1 = new Car(bmw1, true, transportMarket, "medium", dimensionsArrayList1);
        Car car2 = new Car(bmw1, false, businessMarket, "standard", dimensionsArrayList1);
        Car car3 = new Car(bmw2, true, transportMarket, "medium", dimensionsArrayList2);
        Car car4 = new Car(bmw3, true, businessMarket, "premium", dimensionsArrayList3);
        Car car5 = new Car(nissan1, false, agriMarket, "standard", dimensionsArrayList2);
        Car car6 = new Car(skoda1, false, medicalMarket, "standard", dimensionsArrayList3);
        Car car7 = new Car(bmw3, true, businessMarket, "premium", dimensionsArrayList1);
        Car car8 = new Car(mercedes2, true, businessMarket, "premium", dimensionsArrayList2);
        Car car9 = new Car(mercedes1, false, cargoMarket, "medium", dimensionsArrayList1);
        Car car10 = new Car(mercedes3, true, medicalMarket, "medium", dimensionsArrayList3);
        Car car11 = new Car(volkswagen1, true, cargoMarket, "medium", dimensionsArrayList2);
        Car car12 = new Car(renault1, true, transportMarket, "medium", dimensionsArrayList1);
        Car car13 = new Car(renault1, false, cargoMarket, "standard", dimensionsArrayList1);
        Car car14 = new Car(volkswagen1, false, agriMarket, "medium", dimensionsArrayList2);
        Car car15 = new Car(bmw1, true, transportMarket, "standard", dimensionsArrayList1);



        Car.getCountries("BMW", 300);


    }
}