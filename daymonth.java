public class daymonth {

   String month="JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
    private int monthnum;
    public  daymonth(String mon)
    {
            String s = mon.substring(0,3).toUpperCase();
            monthnum = month.indexOf(s)/3;
    }
    public String tostring()
    {
    switch (monthnum)
        {
            case 0 : return "January";
            case 1 : return "Feburary";
            case 2 : return "March";
            case 3: return "April";
            case 4 : return "May";
            case 5 : return "June";
            case 6 : return "July";
            case 7 : return "August";
            case 8 : return "September";
            case 9 : return "October";
            case 10 : return "November";
            default : return "December";
        }
    }
    public static void main(String args[])
    {
        daymonth month = new daymonth("dec");
        System.out.println("Month is " + month.tostring());
    }
}
