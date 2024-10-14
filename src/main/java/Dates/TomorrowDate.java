package Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TomorrowDate {


    public static void main(String[] args) {
        long surveyEndTime = System.currentTimeMillis() + 24 * 60 * 60 * 1000;
        System.out.println(surveyEndTime);
        System.out.println((TomorrowDate.convertEpochToReadable(surveyEndTime, DateFormatEnum.EEE_MMM_dd_yyyy_HH_mm_ss_Z)));
        System.out.println((TomorrowDate.convertEpochToReadable(surveyEndTime, DateFormatEnum.EEE_MM_dd_yyyy_HH_mm_ss)));
        System.out.println((TomorrowDate.convertEpochToReadable(surveyEndTime, DateFormatEnum.EEEE_MMMM_dd_yyyy_HH_mm_ss)));
        String date= TomorrowDate.convertEpochToReadable(surveyEndTime, DateFormatEnum.EEE_MM_dd_yyyy_HH_mm_ss);
        String[] splitString = date.split(" ");
        String tmrw = splitString[2];

        int TmrwDate = Integer.parseInt(splitString[2]);
        System.out.println(TmrwDate);

        System.out.println(tmrw);
        String xpath1="//*[text()='";
        String xpath3="']";
        String xpath = xpath1+tmrw+xpath3;
        System.out.println(xpath);

        String xPathExp1 = "//input[@ng-value='";
        String xPathExp2 = Integer.toString(5);
        String xPathExp3 = "']";
        String xPathExp = xPathExp1 + xPathExp2 + xPathExp3;
        System.out.println(xPathExp);
    }



    public static String convertEpochToReadable(long epochTime, DateFormatEnum dateFormatEnum) {
        return new SimpleDateFormat(dateFormatEnum.pattern).format(new Date(epochTime));
    }

}



