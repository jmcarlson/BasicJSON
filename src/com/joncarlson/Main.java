package com.joncarlson;

import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", new Integer(100));

        System.out.print(obj);

    }
}
