package resourcesClass;

public class Months {

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static int monthComparator(String month){

        if("JANUARY".equals(month.toUpperCase())){
            return JANUARY;
        }else if("FEBRUARY".equals(month.toUpperCase())){
            return FEBRUARY;
        }else if("MARCH".equals(month.toUpperCase())){
            return MARCH;
        }else if("APRIL".equals(month.toUpperCase())){
            return APRIL;
        }else if("MAY".equals(month.toUpperCase())){
            return MAY;
        }else if("JUNE".equals(month.toUpperCase())){
            return JUNE;
        }else if("JULY".equals(month.toUpperCase())){
            return JULY;
        }else if("AUGUST".equals(month.toUpperCase())){
            return AUGUST;
        }else if("SEPTEMBER".equals(month.toUpperCase())){
            return SEPTEMBER;
        }else if("OCTOBER".equals(month.toUpperCase())){
            return OCTOBER;
        }else if("NOVEMBER".equals(month.toUpperCase())){
            return NOVEMBER;
        }else if("DECEMBER".equals(month.toUpperCase())){
            return DECEMBER;
        }else {
            return -1;
        }
    }

}
