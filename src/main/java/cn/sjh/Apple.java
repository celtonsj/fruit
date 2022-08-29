package cn.sjh;

import lombok.Data;

@Data
public class Apple extends Fruit{

    public Apple() {
    }

    public Apple(int weight, String name, Integer price) {
        super(weight, name, price);
    }
}
