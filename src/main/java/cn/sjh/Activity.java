package cn.sjh;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Activity{
    //打折金額
    private BigDecimal discount;

    public Activity() {
    }

    public Activity(BigDecimal discount) {
        this.discount = discount;
    }

    public int doDicCount(int price){
        return -1;
    }
}
