package cn.sjh;

import lombok.Data;

import java.util.Map;

@Data
public class Person {

    /**
     * 對水果的需求量
     */
    private Integer total;

    /**
     * 顧客姓名
     */
    private String name;

    private Map<String,Integer> fruits;

    public Person() {
    }

    public Person(String name, Map<String, Integer> fruits) {
        this.name = name;
        this.fruits = fruits;
    }
}
