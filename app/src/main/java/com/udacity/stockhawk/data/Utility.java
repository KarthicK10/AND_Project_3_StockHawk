package com.udacity.stockhawk.data;

import android.content.Context;
import android.text.format.Time;

import java.text.SimpleDateFormat;

/**
 * Created by KarthicK on 11/27/2016.
 */

public class Utility {

    /**
     * Converts db date format to the format "Month day", e.g "June 24".
     * @param context Context to use for resource localization
     * @param dateInMillis The db formatted date string, expected to be of the form specified
     *                in Utility.DATE_FORMAT
     * @return The day in the form of a string formatted "December 6"
     */
    public static String getFormattedMonthDay(Context context, long dateInMillis ) {
        Time time = new Time();
        time.setToNow();
        SimpleDateFormat monthDayFormat = new SimpleDateFormat("MM/dd/yyyy");
        String monthDayString = monthDayFormat.format(dateInMillis);
        return monthDayString;
    }
}
