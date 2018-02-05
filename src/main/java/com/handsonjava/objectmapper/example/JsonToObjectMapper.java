package com.handsonjava.objectmapper.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonToObjectMapper {
    private static String shopInfo = "[{\n" +
            "        \"name\" : \"shopqwe\",\n" +
            "        \"mobiles\" : [],\n" +
            "        \"address\" : {\n" +
            "            \"town\" : \"city\",\n" +
            "            \"street\" : \"streetqwe\",\n" +
            "            \"streetNumber\" : \"59\",\n" +
            "            \"cordX\" : 2.229997,\n" +
            "            \"cordY\" : 1.002539\n" +
            "        },\n" +
            "        \"shoe\" : [{\n" +
            "                \"shoeName\" : \"addidas\",\n" +
            "                \"number\" : \"631744030\",\n" +
            "                \"producent\" : \"nike\",\n" +
            "                \"price\" : 999.0,\n" +
            "                \"sizes\" : [30.0, 35.0, 38.0]\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "]";

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ShopInfo[] shopInfos = objectMapper.readValue(shopInfo, ShopInfo[].class);
        System.out.println(shopInfos);
    }
}
