package bukovelsys.cards;

import bukovelsys.services.AccountSystem;

import java.util.Date;

public class DaySkiPass extends SkiPass {
    private int dayQuantity;

    public DaySkiPass(int dayQuantity) {
        this.dayQuantity = dayQuantity;
        this.skiPassType = skiPassType.DAY_LIMIT;
        this.id = AccountSystem.getAccountingSystem().getNextId();
    }
}