package me.tudoriem.cts;

public class DbConnection {
    private static DbConnection theConnection = null;
    String serverName;
    String userAcc;
    String pass;

    // class static constructor executed only once when java vm loads this class
    static {
        System.out.println("Initializing the unique connection");
        theConnection = new DbConnection("127.0.0.1");
    }

    public  static  DbConnection getConnection(){
        return  theConnection;
    }

    private  DbConnection(String serverName){
        this.serverName = serverName;
        System.out.println( "Creating a Db connection to "+ this.serverName);
    }

    private DbConnection(String serverName, String userAcc, String pass) {
        this.serverName = serverName;
        this.userAcc = userAcc;
        this.pass = pass;
    }

    public void connect(){
        System.out.println("Connecting.....");
    }
    public  void disconect(){
        System.out.println("Disconnecting....");
    }
}
