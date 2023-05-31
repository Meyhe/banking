package by.alina.banking.statisticservice.model;

import java.math.BigDecimal;

public enum TimePeriod {

    YEAR(365.2424), QUARTER(91.3106), MONTH(30.4368), DAY(1), HOUR(0.0416);

    private double baseInterval;

    TimePeriod(double baseInterval){
        this.baseInterval = baseInterval;
    }

    public BigDecimal getBaseInterval(){
        return new BigDecimal(baseInterval);
    }

    public static TimePeriod getBase(){
        return DAY;
    }

}
