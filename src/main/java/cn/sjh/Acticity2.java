package cn.sjh;

import java.math.BigDecimal;

public class Acticity2 extends Activity {
    public int doDicCount(int price){

        BigDecimal priceBigDecimal = new BigDecimal(String.valueOf(price));
        BigDecimal discount = new BigDecimal("0.8");
        BigDecimal multiply = priceBigDecimal.multiply(discount);
        return multiply.intValue();
    }
}
