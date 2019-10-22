package ru.itpark.model;

public class House {
    private long id;
    private String name;
    private int area;
    private String addres;
    private String district;
    private String telephone;
    private double price;

    public House(long id, String name, int area, String addres, String district, String telephone, double price) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.addres = addres;
        this.district = district;
        this.telephone = telephone;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", addres='" + addres + '\'' +
                ", district='" + district + '\'' +
                ", telephone='" + telephone + '\'' +
                ", price=" + price +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


