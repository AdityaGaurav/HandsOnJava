package com.handsonjava.systemproperties;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyTest {
    public static void main(String[] args){
    String pathOfFile = "E:\\Project\\Java\\HandsOnJava\\src\\main\\java\\com\\handsonjava\\systemproperties\\application.properties".replace("\\", File.separator);
        Properties properties = PropertyLoader.loadProperties(pathOfFile);
        for(Object s : properties.keySet()){
            properties.setProperty((String)s,(String)properties.get(s));
           System.out.println(properties.getProperty((String)s));
        }

        Enumeration enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
               System.out.println(enumeration.nextElement());
        }

        Enumeration enumeration2 = properties.elements();
        while(enumeration2.hasMoreElements()){
            System.out.println(enumeration2.nextElement());
        }

        Enumeration enumeration3 =properties.keys();
        while(enumeration3.hasMoreElements()){
            System.out.println(enumeration3.nextElement());
        }

        for(String s : properties.stringPropertyNames()){
            System.out.println(s);
        }
    }
}
