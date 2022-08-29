package cn.sjh;

import lombok.Data;

@Data
public class Fruit {

    //水果重量单位
    private int weight;

    //水果名字
    private String name;

    //金額
    private Integer price;

    public Fruit() {
    }

    public Fruit(int weight, String name, Integer price) {
        this.weight = weight;
        this.name = name;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
