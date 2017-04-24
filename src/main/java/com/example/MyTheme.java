package com.example;

public class MyTheme {

    public static String LONG_FIELD = "long";

    public enum ContactStatus { DEAD, ALIVE, UNKNOWN;
        public String toString() {
            return "status-" + this.name().toLowerCase();
        }
    };

}
