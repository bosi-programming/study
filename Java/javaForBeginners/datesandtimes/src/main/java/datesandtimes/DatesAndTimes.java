package datesandtimes;

import java.util.*;

public class DatesAndTimes 
{
    public static void main( String[] args )
    {
        Calendar now = new GregorianCalendar();
        System.out.println(now.get(Calendar.MONTH) + 1);
        System.out.println(now.getTimeInMillis());
    }
}
