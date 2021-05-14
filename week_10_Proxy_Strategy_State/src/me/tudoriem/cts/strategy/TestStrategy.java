package me.tudoriem.cts.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Player player = new Player("Marius", 10, 100);
        System.out.println("Points: " + player.experiencePoints);
        player.setBonusCampaign(new NoCampaign());
        player.getExperiencePoints(150);
        System.out.println("Points: " + player.experiencePoints);
        player.setBonusCampaign(new EasterCampaign());
        player.getExperiencePoints(200);
        System.out.println("Points: " + player.experiencePoints);
        player.setBonusCampaign(new SummerCampaign());
        player.getExperiencePoints(100);
        System.out.println("Points: " + player.experiencePoints);
    }
}
