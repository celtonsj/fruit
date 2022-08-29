package cn.sjh;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        /**
         * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
         * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
         * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         * 测试用例：
         * 1）输入的水果斤数为0
         * 2）输入的水果斤数为负数
         * 3）输入的水果斤数为9999999999999999999999999999999999999
         */
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Acticity1());
        activities.add(new Acticity2());
        SuperMarket superMarket = new SuperMarket(activities);
        HashMap<String, Integer> mapA = new HashMap<>();
        mapA.put("苹果", 5);
        mapA.put("草莓", 10);
        Person a = new Person("A", mapA);
        Apple apple = new Apple(1, "苹果", 8);
        Strawberry strawberry = new Strawberry(1, "草莓", 13);
        int buyAppleAmount = superMarket.sell(apple, a, new Acticity1());
        int buyStrawberryAmount = superMarket.sell(strawberry, a, new Acticity1());
        int amount = buyAppleAmount + buyStrawberryAmount;
        System.out.println("A用户购买的水果是：" + amount + "元");
        /**
         * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
         * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        Mongo mongo = new Mongo(1, "芒果", 20);
        HashMap<String, Integer> mapB = new HashMap<>();
        mapB.put("芒果", 1);
        mapB.put("苹果", 5);
        mapB.put("草莓", 10);
        Person b = new Person("B", mapB);
        buyAppleAmount = superMarket.sell(apple, b, new Acticity1());
        buyStrawberryAmount = superMarket.sell(strawberry, b, new Acticity1());
        int buyMongoAmount = superMarket.sell(mongo, b, new Acticity1());
        int amountB = buyAppleAmount + buyStrawberryAmount + buyMongoAmount;
        System.out.println("B用户购买的水果是：" + amountB + "元");
        /**
         * 3、超市做促销活动，草莓限时打 8 折。
         * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        HashMap<String, Integer> mapC = new HashMap<>();
        mapC.put("芒果", 1);
        mapC.put("苹果", 5);
        mapC.put("草莓", 10);
        Person c = new Person("C", mapC);
        buyAppleAmount = superMarket.sell(apple, c, new Acticity1());

        buyStrawberryAmount = superMarket.sell(strawberry, c, new Acticity2());
        buyMongoAmount = superMarket.sell(mongo, c, new Acticity1());
        int amountC = buyAppleAmount + buyStrawberryAmount + buyMongoAmount;
        System.out.println("C用户购买的水果是：" + amountC + "元");
        /**
         * 促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
         * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        HashMap<String, Integer> mapD = new HashMap<>();
        mapD.put("芒果", 1);
        mapD.put("苹果", 5);
        mapD.put("草莓", 10);
        Person d = new Person("D", mapD);
        buyAppleAmount = superMarket.sell(apple, d, new Acticity1());

        buyStrawberryAmount = superMarket.sell(strawberry, d, new Acticity2());
        buyMongoAmount = superMarket.sell(mongo, d, new Acticity1());
        int amountD = buyAppleAmount + buyStrawberryAmount + buyMongoAmount;
        if (amountD > 100) {
            amountD -= 10;
        }
        System.out.println("D用户购买的水果是：" + amountD + "元");
    }
}
