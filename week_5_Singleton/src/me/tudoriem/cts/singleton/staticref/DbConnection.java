package me.tudoriem.cts.singleton.staticref;

public class DbConnection {
    String connString;
    String schema;

    public final static DbConnection connection = new DbConnection();
    // static class initializer
    static{
        // called only once before the class is loaded by the java virtual machine
        System.out.println("Hello. DbConnection is loaded");
        connection.connString = "127.0.0.1";
        connection.schema = "cts";
    }

    // constructor initializer
    {
        //called every time before a constructor call
        System.out.println("building an object");
    }

    private  DbConnection(){}
}
