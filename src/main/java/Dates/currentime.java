package Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class currentime {


    public static void main(String[] args) {
         long surveyEndTime = System.currentTimeMillis() + 24 * 60 * 60 * 1000;
         System.out.println(surveyEndTime);
        System.out.println((currentime.convertEpochToReadable(surveyEndTime, DateFormatEnum.EEE_MMM_dd_yyyy_HH_mm_ss_Z)));
        System.out.println((currentime.convertEpochToReadable(surveyEndTime, DateFormatEnum.EEE_MM_dd_yyyy_HH_mm_ss)));
        System.out.println((currentime.convertEpochToReadable(surveyEndTime, DateFormatEnum.EEEE_MMMM_dd_yyyy_HH_mm_ss)));
        System.out.println((currentime.convertEpochToReadable(surveyEndTime, DateFormatEnum.MMM_dd_yyyy)));
    }



    public static String convertEpochToReadable(long epochTime, DateFormatEnum dateFormatEnum) {
        return new SimpleDateFormat(dateFormatEnum.pattern).format(new Date(epochTime));
    }

}
