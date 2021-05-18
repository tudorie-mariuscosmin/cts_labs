package me.tudoriem.cts.observer;

public class UiNotificationsModule implements NetworkStatusHandlerInterface{

    @Override
    public void connectionDown() {
        System.out.println("Alert: Connection lost");
    }

    @Override
    public void connectionUp() {
        System.out.println("Alert: Let's get back to the game");
    }
}
