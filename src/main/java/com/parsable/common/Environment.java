package com.parsable.common;

public class Environment {

    private static String engineEnv;
    private static String mothershipUrl;
    private static String notificationsUrl;
    private static String adminUser;
    private static String adminPass;

    public static String getMothershipUrl() {
        if (mothershipUrl == null) {
            String url = System.getenv("MOTHERSHIP_URL");
            if (url == null || url.length() == 0) {
                mothershipUrl = "http://localhost:8080";
            } else {
                mothershipUrl = url;
            }
        }
        return mothershipUrl;
    }

    public static String getNotificationsUrl() {
        if (notificationsUrl == null) {
            String url = System.getenv("NOTIFICATIONS_URL");
            if (url == null || url.length() == 0) {
                notificationsUrl = "http://localhost:7000";
            } else {
                notificationsUrl = url;
            }
        }
        return notificationsUrl;
    }

    public static String getAdminUser() {
        if (adminUser == null) {
            String user = System.getenv("ADMIN_USER");
            if (user == null || user.length() == 0) {
                adminUser = "user1@wi.dev";
            } else {
                adminUser = user;
            }
        }
        return adminUser;
    }

    public static String getAdminPass() {
        if (adminPass == null) {
            String pass = System.getenv("ADMIN_PASS");
            if (pass == null || pass.length() == 0) {
                adminPass = "Pass1234!";
            } else {
                adminPass = pass;
            }
        }
        return adminPass;
    }

    public static boolean isDevEnv() {
        if (engineEnv == null) {
            String env = System.getenv("ENGINE_ENV");
            if (env == null || env.length() == 0 || (!env.equals("staging") && !env.equals("prod"))) {
                engineEnv = "dev";
            } else {
                engineEnv = env;
            }
        }
        return engineEnv.equals("dev");
    }
}
