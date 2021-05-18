package me.tudoriem.cts.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkMonitorModule {

    List<NetworkStatusHandlerInterface> modules = new ArrayList<>();

    public void register(NetworkStatusHandlerInterface module){
        this.modules.add(module);
    }

    public  void unregister(NetworkStatusHandlerInterface module){
        this.modules.remove(module);
    }

    public void networkStatusChanged(NetworkStatus status){
        if(status == NetworkStatus.UP){
            for(NetworkStatusHandlerInterface module: modules){
                module.connectionUp();
            }
        }
        if(status == NetworkStatus.DOWN){
            for(NetworkStatusHandlerInterface module: modules){
                module.connectionDown();
            }
        }
    }
}
