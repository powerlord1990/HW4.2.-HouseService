package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.service.HouseService;


public class Main {

    public static void main(String[] args) {

        House house1 = new House(
                145,
                "Продам дом",
                108, "Заречная 12",
                "Кировский",
                "+792-134-86-58",
                1_879_125);

        House house2 = new House(
                125,
                "дом в центре",
                158,
                "Вознесение 2",
                "Приволжский",
                "+792-745-82-34",
                2_589_000);

        House house3 = new House(
                534,
                "Огромный дом",
                345,
                "Ленина 165",
                "Вахитовский",
                "+792-734-86-58",
                4_236_000);

        House house4 = new House(
                115,
                "Одноэтажный дом",
                208,
                "Ипподромная 8",
                "Советский",
                "+792-742-86-58",
                1_585_000);



        HouseService housesCatalog = new HouseService();
        housesCatalog.addHouse(house1);
        housesCatalog.addHouse(house2);
        housesCatalog.addHouse(house3);
        housesCatalog.addHouse(house4);
        System.out.println("Поиск в пределах цены " + housesCatalog.searchHouseWishMinMax(1_000_000, 2_000_000));
        System.out.println();
        System.out.println("Поиск по району " + housesCatalog.searchByDistrict("СОВетсКИЙ", "киРОВский", "ВахитовсКИЙ"));
    }
}