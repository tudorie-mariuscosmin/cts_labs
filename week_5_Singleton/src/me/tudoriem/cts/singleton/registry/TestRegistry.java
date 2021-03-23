package me.tudoriem.cts.singleton.registry;

public class TestRegistry {
    public static void main(String[] args) {
        DbConnection con1 = DbConnection.getDbConnections("127.0.0.1", "dev");
        DbConnection con2 = DbConnection.getDbConnections("127.0.0.1", "dev");
        if(con1 == con2){
            System.out.println("They are the same");
        }
        DbConnection con3 = DbConnection.getDbConnections("10.0.0.1", "prod");
        if(con1!=con3){
            System.out.println("They are different");
        }
    }
}
