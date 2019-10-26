package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList<>();

    private List<House> searchWishPrice() {
        List<House> houseList = houses;
        houseList.sort(Comparator.comparing(House::getPrice));
        return houseList;
    }

    public void sortHouseWishMinMax(int min, int max) {
        List<House> sorting = searchWishPrice();
        for (House house : sorting) {
            if (house.getPrice() > min && house.getPrice() < max) {
                System.out.println(house.toString());
            }
        }
    }

    public List<House> searchByDistrict(String... districts) {
        List<House> result = new ArrayList<>();
        for (House house : houses) {
            for (String district : districts) {
                if(house.getDistrict().equalsIgnoreCase(district)) {
                    System.out.println(house.toString());

                }
            }
        }
        return result;
    }


    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
}

