package me.tudoriem.cts.singleton.staticref;

public class TestSingletone {
    public static void main(String[] args) {
        DbConnection connection = DbConnection.connection;
        DbConnection connection1 = DbConnection.connection;
        if(connection == connection1){
            System.out.println("");
        }
    }



}
