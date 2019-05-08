package bukovelsys;

import bukovelsys.cards.SkiPass;
import bukovelsys.cards.SkiPassType;
import bukovelsys.services.AccountSystem;
import bukovelsys.services.Turmstile;

import java.time.LocalDateTime;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        AccountSystem accountSystem = new AccountSystem();

        SkiPass seasonSkiPass1 = accountSystem.createSeasonSkiPass(LocalDateTime.of(2019,8, 1,0,0));
        SkiPass seasonSkiPass2 = accountSystem.createSeasonSkiPass(LocalDateTime.of(2018,8, 1,0,0));

        Turmstile turmstile = new Turmstile();

        System.out.println(turmstile.validate(seasonSkiPass1));
        System.out.println(turmstile.validate(seasonSkiPass2));


    }

}