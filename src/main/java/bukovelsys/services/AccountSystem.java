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
        HalfDayMorningSkiPass skiPass = new HalfDayMorningSkiPass();
        skiPassList.add(skiPass);
        return skiPass;
    }

    public SkiPass createHalfDayAfternoonSkiPass(){
        HalfDayAfternoonSkiPass skiPass = new HalfDayAfternoonSkiPass();
        skiPassList.add(skiPass);
        return skiPass;
    }

    public SkiPass createDaySkiPass(int days){
        DaySkiPass skiPass = new DaySkiPass(days);
        skiPassList.add(skiPass);
        return skiPass;
    }

    public SkiPass createHolidayHalfDayMorningSkiPass(){
        HolidayHalfDayMorningSkiPass skiPass = new HolidayHalfDayMorningSkiPass();
        skiPassList.add(skiPass);
        return skiPass;
    }

    public SkiPass createHolidayHalfDayAfternoonSkiPass(){
        HolidayHalfDayAfternoonSkiPass skiPass = new HolidayHalfDayAfternoonSkiPass();
        skiPassList.add(skiPass);
        return skiPass;
    }

    public SkiPass createHolidayDaySkiPass(int days){
        HolidayDaySkiPass skiPass = new HolidayDaySkiPass(days);
        skiPassList.add(skiPass);
        return skiPass;
    }

    public SkiPass createSeasonSkiPass(){
        SeasonSkiPass skiPass = new SeasonSkiPass();
        skiPassList.add(skiPass);
        return skiPass;
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

    public List<SkiPass> getSkiPassList() {
        return skiPassList;
    }
}