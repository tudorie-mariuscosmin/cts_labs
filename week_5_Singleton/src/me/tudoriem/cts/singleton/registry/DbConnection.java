package me.tudoriem.cts.singleton.registry;

import java.util.Hashtable;

public class DbConnection {
    String connString;
    String schema;

    private static Hashtable<String, DbConnection> connections = new Hashtable<>();

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
    public static  DbConnection getDbConnections(String connString, String schema){
        DbConnection connection = connections.get(connString);
        if(connection == null){
            connection = new DbConnection(connString, schema);
            connections.put(connString, connection);
        }
        return  connection;
    }
}
