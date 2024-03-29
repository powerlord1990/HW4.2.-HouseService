package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList<>();

    public List<House> searchHouseWishMinMax(int min, int max) {
        List<House> sorting = new ArrayList<>(houses);
        List<House> sortWithPrice = new ArrayList<>();
        for (House house : sorting) {
            if (house.getPrice() > min && house.getPrice() < max) {
                sortWithPrice.add(house);
            }
            sortWithPrice.sort(Comparator.comparing(House::getPrice));
        }
        return sortWithPrice;
    }

    public List<House> searchByDistrict(String... districts) {
        List<House> searchHouseDistrict = new ArrayList<>();
        for (House house : houses) {
            for (String district : districts) {
                if (house.getDistrict().equalsIgnoreCase(district)) {
                    searchHouseDistrict.add(house);
                }
            }searchHouseDistrict.sort(Comparator.comparing(House::getPrice));
        }
        return searchHouseDistrict;
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

