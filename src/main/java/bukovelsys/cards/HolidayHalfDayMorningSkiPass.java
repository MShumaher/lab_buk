package bukovelsys.cards;

import bukovelsys.services.AccountSystem;

public class HolidayHalfDayMorningSkiPass extends SkiPass {
    public HolidayHalfDayMorningSkiPass(){
        this.id = AccountSystem.getAccountingSystem().getNextId();
        this.skiPassType = SkiPassType.HOLIDAY_HALF_DAY_MORNING;
    }
}
