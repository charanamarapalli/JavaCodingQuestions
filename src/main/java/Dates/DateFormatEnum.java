package Dates;

    public enum DateFormatEnum {

        EEE_MM_dd_yyyy_HH_mm_ss("EEE MM dd yyyy HH:mm:ss"),
        EEEE_MMMM_dd_yyyy_HH_mm_ss("EEEE MMMM dd yyyy HH:mm:ss"),
        EEE_MMM_dd_yyyy_HH_mm_ss_Z("EEE MMM dd yyyy HH:mm:ss zZ (zzzz)"),
        MMM_dd_yyyy("MMM dd, yyyy");
        String pattern;
        DateFormatEnum(String pattern) {
            this.pattern = pattern;
        }

    }

