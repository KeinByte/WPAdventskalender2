package net.woodpixel.adventskalender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandler {

    public static String getDate(long l) {
        Date date = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.");
        return sdf.format(date);
    }

}
