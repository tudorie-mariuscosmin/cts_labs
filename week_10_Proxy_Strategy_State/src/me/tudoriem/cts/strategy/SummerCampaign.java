package me.tudoriem.cts.strategy;

public class SummerCampaign implements BonusStrategyInterface{

    @Override
    public void getBonusPoints(int receivedPoints, Player player) {
        player.experiencePoints +=(1.5*receivedPoints);
    }
}

