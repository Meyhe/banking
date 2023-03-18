package by.alina.banking.statisticservice.model;

public enum Currency {
    USD, EUR, RUB, BYN;

    public static Currency getBase(){
        return USD;
    }
}
