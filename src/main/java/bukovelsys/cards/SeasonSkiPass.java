package bukovelsys.cards;

import bukovelsys.services.AccountSystem;

public class SeasonSkiPass extends SkiPass {
    public SeasonSkiPass(){
        this.id = AccountSystem.getAccountingSystem().getNextId();
        this.skiPassType = SkiPassType.SEASON;
    }
}
