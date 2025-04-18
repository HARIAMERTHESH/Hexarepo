package com.carrental.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {
    public static String getPropertyString(String propertyFileName) {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream(propertyFileName)) {
            props.load(fis);
            return "jdbc:mysql://" + props.getProperty("hostname") + ":" + 
                   props.getProperty("port") + "/" + 
                   props.getProperty("dbname") + "?user=" + 
                   props.getProperty("username") + "&password=" + 
                   props.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}