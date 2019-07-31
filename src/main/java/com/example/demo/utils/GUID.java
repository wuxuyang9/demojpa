package com.example.demo.utils;

/**
 * Created by lhp on 2017/4/9.
 */

import java.util.UUID;

public class GUID {

    public static String getUpperGuid() {
        return getGuid().toUpperCase();
    }

    public static String getGuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }
}
