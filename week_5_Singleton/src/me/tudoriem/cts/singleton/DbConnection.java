package me.tudoriem.cts.singleton;

public class DbConnection {
    String connString;
    String schema;

    private static DbConnection connection = null;

    private  DbConnection(){
        System.out.println("Creating a connection object");
        System.out.println("Loading config");
        this.connString = "127.0.0.1";
        this.schema = "cts";
    }

    private DbConnection(String connString, String schema) {
        this.connString = connString;
        this.schema = schema;
    }

    public  static DbConnection getConnection(){
        if(connection == null){
            connection = new DbConnection();
        }
        return connection;
    }
    // not clean and misleading - makes u think u have multiple connections
    public  static DbConnection getConnection(String connString, String schema){
        if(connection == null){
            connection = new DbConnection(connString, schema);
        }
        return connection;
    }



}
