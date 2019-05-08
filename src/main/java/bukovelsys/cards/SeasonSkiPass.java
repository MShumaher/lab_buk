package bukovelsys.cards;

import bukovelsys.services.AccountSystem;

import java.time.LocalDateTime;

public class SeasonSkiPass extends SkiPass {
    public SeasonSkiPass(LocalDateTime date) {
        this.id = AccountSystem.getAccountingSystem().getNextId();
        this.skiPassType = SkiPassType.SEASON;
        this.expirationDate = date;
    }
}
