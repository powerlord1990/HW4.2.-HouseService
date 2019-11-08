package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList<>();

    private List<House> sortByPrice() {
        List<House> houseNew = new ArrayList<>(houses);
        houseNew.sort(Comparator.comparing(House::getPrice));
        return houseNew;
    }

    public List<House> searchHouseWishMinMax(int min, int max) {
        List<House> sorting = sortByPrice();
        List<House> sortWithPrice = new ArrayList<>();
        for (House house : sorting) {
            if (house.getPrice() > min && house.getPrice() < max) {
                sortWithPrice.add(house);
            }
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
            }
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

