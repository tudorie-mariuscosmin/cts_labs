package me.tudoriem.cts.singleton.enumeration;

public enum DbConnection {
    DEV_DB;
    String connString;
    String schema;

    private DbConnection(){
        System.out.println("Loading settings from a conf file");
    }


}
