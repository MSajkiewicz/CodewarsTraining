package com.codewarstraining.codewarstraining.kyu8;

public class HolidayDutyFree {

    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol/((double)normPrice*(double)discount/100));
    }

}
