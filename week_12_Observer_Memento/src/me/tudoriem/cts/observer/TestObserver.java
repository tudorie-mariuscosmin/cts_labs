package me.tudoriem.cts.observer;

public class TestObserver {
    public static void main(String[] args) {
        NetworkMonitorModule monitorModule = new NetworkMonitorModule();

        monitorModule.networkStatusChanged(NetworkStatus.UP);

        NetworkStatusHandlerInterface autoSaveModule = new AutoSaveModule();
        NetworkStatusHandlerInterface uiNotificationsModule = new UiNotificationsModule();

        monitorModule.register(autoSaveModule);
        monitorModule.register(uiNotificationsModule);
        monitorModule.networkStatusChanged(NetworkStatus.DOWN);
        monitorModule.unregister(uiNotificationsModule);
        monitorModule.networkStatusChanged(NetworkStatus.UP);


    }
}
