package me.tudoriem.cts.facade;

public class GameServer {
    public void connect(String serverIp){
        System.out.println("Connecting to "+ serverIp);
    }

    public boolean isConnected(){
        return  true;
    }

}
