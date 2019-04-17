package bukovelsys.cards;

import bukovelsys.services.AccountSystem;

public class HolidayHalfDayAfternoonSkiPass extends SkiPass {

    public  HolidayHalfDayAfternoonSkiPass(){
        this.id = AccountSystem.getAccountingSystem().getNextId();
        this.skiPassType = SkiPassType.HOLIDAY_HALF_DAY_AFTERNOON;
    }
}
