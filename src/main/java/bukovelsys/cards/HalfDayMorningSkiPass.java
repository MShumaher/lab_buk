package bukovelsys.cards;

import bukovelsys.services.AccountSystem;

public class HalfDayMorningSkiPass extends SkiPass {
    public HalfDayMorningSkiPass(){
        this.id = AccountSystem.getAccountingSystem().getNextId();
        this.skiPassType = SkiPassType.HALF_DAY_MORNING;
    }
}
