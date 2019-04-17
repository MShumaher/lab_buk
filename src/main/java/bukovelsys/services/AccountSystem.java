package bukovelsys.services;

import bukovelsys.cards.*;

import java.util.LinkedList;
import java.util.List;

public class AccountSystem {

    private List<SkiPass> skiPassList = new LinkedList<SkiPass>();
    //private Set<Integer> skiPassIdSet = new HashSet<Integer>();
    private int lastSkiPassId;
    private int startMonthOfSeason = 9;
    private int endMonthOfSeason = 4;

    private static class AccountSystemHolder{
        public static final AccountSystem ACCOUNTING_SYSTEM_INTERFACE = new AccountSystem();
    }

    public static  AccountSystem getAccountingSystem(){
        return AccountSystemHolder.ACCOUNTING_SYSTEM_INTERFACE;
    }

    public SkiPass createHalfDayMorningSkiPass(){
        return new HalfDayMorningSkiPass();
    }

    public SkiPass createHalfDayAfternoonSkiPass(){
        return new HalfDayAfternoonSkiPass();
    }

    public SkiPass createDaySkiPass(int days){
        return new DaySkiPass(days);
    }

    public SkiPass createHolidayHalfDayMorningSkiPass(){
        return new HolidayHalfDayMorningSkiPass();
    }

    public SkiPass createHolidayHalfDayAfternoonSkiPass(){
        return new HolidayHalfDayAfternoonSkiPass();
    }

    public SkiPass createHolidayDaySkiPass(int days){
        return new HolidayDaySkiPass(days);
    }

    public SkiPass createSeasonSkiPass(){
        return new SeasonSkiPass();
    }

    public void blockSkiPass(SkiPass skiPass){
        skiPass.setBlocked(true);
    }

    public int getNextId(){
        return ++this.lastSkiPassId;
    }

    public int getStartMonthOfSeason() {
        return startMonthOfSeason;
    }

    public int getEndMonthOfSeason() {
        return endMonthOfSeason;
    }
}