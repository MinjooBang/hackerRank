package hackerRank;


import javafx.beans.binding.Bindings;

public class dayOfProgrammerSovle {
    private int days = 215;
    private int programmerDay = 256;

    public String dayOfProgrammer(int year) {
        int changeDays = solveDays(year);
        String result = dateFormat(changeDays, year);
        return result;
    }

    private String dateFormat(int changeDays, int year) {
        String day = Integer.toString(programmerDay - changeDays);
        String month = "09";
        String years = Integer.toString(year);

        return day + "." + month + "." + years;
    }

    private int solveDays(int year) {
        int yearCheck = 1918;
        boolean isJullian = year < yearCheck;
        boolean isGregorian = year > yearCheck;


        if (isJullian) {
            if (year % 4 == 0) days += 29;
            else days += 28;
        } else if (isGregorian) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) days += 29;
            else days += 28;
        } else if (year == yearCheck) {
            days += 15;
        }
        return days;
    }
}
