package cn.sjh;

import lombok.Data;

import java.util.List;
import java.util.Map;


@Data
public class SuperMarket {


    private List<Activity> activities;


    public SuperMarket(List<Activity> activities) {
        this.activities = activities;
    }


    public int sell(Fruit fruit,Person person,Activity activity){
        Map<String, Integer> fruits = person.getFruits();
        Integer num = fruits.get(fruit.getName());

        Integer amount = fruit.getWeight()*fruit.getPrice()*num;

        amount = activity.doDicCount(amount);

        return amount;
    }

}
