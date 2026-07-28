package com.dts.core.util;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateWrapper {
    
    // The format MySQL requires
    private static final String MYSQL_FORMAT = "yyyy-MM-dd";
    // The format your frontend/form is sending (DD-MM-YYYY)
    private static final String FORM_FORMAT = "dd-MM-yyyy";

    public static String parseDate(Date date) {
        if (date == null) return null;
        return new SimpleDateFormat(MYSQL_FORMAT).format(date);
    }

    public static String parseDate(String dateStr) {
        if (dateStr == null || dateStr.trim().isEmpty()) return null;
        
        try {
            // 1. Parse the string as it comes from your form (16-03-2006)
            SimpleDateFormat fromForm = new SimpleDateFormat(FORM_FORMAT);
            Date dateObj = fromForm.parse(dateStr);
            
            // 2. Format it for MySQL (2006-03-16)
            SimpleDateFormat toMysql = new SimpleDateFormat(MYSQL_FORMAT);
            return toMysql.format(dateObj);
            
        } catch (Exception e) {
            System.out.println("Error parsing date: " + dateStr);
            e.printStackTrace();
            return null; 
        }
    }     

    public static String parseDate(java.sql.Date date) {
        return (date != null) ? date.toString() : null;
    }
}