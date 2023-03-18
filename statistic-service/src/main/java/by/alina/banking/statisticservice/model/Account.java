package by.alina.banking.statisticservice.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Account {

    @Valid
    @NotNull
    private List<Item> incomes;

    @Valid
    @NotNull
    private List<Item> expenses;

    @Valid
    @NotNull
    private List<Item> saving;

    public List<Item> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Item> incomes) {
        this.incomes = incomes;
    }

    public List<Item> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Item> expenses) {
        this.expenses = expenses;
    }

    public List<Item> getSaving() {
        return saving;
    }

    public void setSaving(List<Item> saving) {
        this.saving = saving;
    }
}
