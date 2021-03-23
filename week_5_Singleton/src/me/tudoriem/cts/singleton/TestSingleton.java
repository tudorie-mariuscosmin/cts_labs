package me.tudoriem.cts.singleton;

public class TestSingleton {
    public static void main(String[] args) {

//        DbConnection con1 = new DbConnection("129.0.0.1:3306", "cts");
//        DbConnection con2 = new DbConnection("129.0.0.1:3306", "cts");

//        DbConnection connection = DbConnection.getConnection();
//        DbConnection connection2 = DbConnection.getConnection();
        DbConnection connection = DbConnection.getConnection("127.0.0.1", "cts");
        DbConnection connection2 = DbConnection.getConnection("127.0.0.1", "cts");
        if(connection == connection2){
            System.out.println("They are poining to the same db");
        }
    }
}
