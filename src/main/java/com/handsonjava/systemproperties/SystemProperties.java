package com.handsonjava.systemproperties;

import java.io.File;
import java.util.Properties;
import java.util.Set;

/**
 * Created by adityag on 2/15/17.
 */
public class SystemProperties {

    public static void findSystemProperties(){
        String osName = System.getProperty("os.name");
        System.out.println("osName:" +osName);
        String osArch = System.getProperty("os.arch");
        System.out.println("osArch:" +osArch);
        String osVersion = System.getProperty("os.version");
        System.out.println("osVersion:" +osVersion);
        String browserName = System.getProperty("browser");
        System.out.println("browserName:" +browserName);


        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion:" +javaVersion);
        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome:" +javaHome);

        String userName = System.getProperty("user.name");
        System.out.println("userName:" +userName);
        String userHome = System.getProperty("user.home");
        System.out.println("userHome:" +userHome);
        String userDir = System.getProperty("user.dir");
        System.out.println("userDir:" +userDir);
        String userDirF = System.getProperty("user.dir")+ File.separator+"com.handsonjava";
        System.out.println("userDirF:" +userDirF);

    }

    public static void  findProperties(){
        Properties properties = System.getProperties();
        Set<Object> sysPropertiesKeys = properties.keySet();
        for (Object key : sysPropertiesKeys) {
            System.out.println(key + " =  " + properties.getProperty((String)key));
        }
    }

    public static void main(String[] args){
        findProperties();
    }
}
