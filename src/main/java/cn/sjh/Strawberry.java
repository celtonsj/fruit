package cn.sjh;

import lombok.Data;

@Data
public class Strawberry extends Fruit{
    public Strawberry() {
    }

    public Strawberry(int weight, String name, Integer price) {
        super(weight, name, price);
    }
}
