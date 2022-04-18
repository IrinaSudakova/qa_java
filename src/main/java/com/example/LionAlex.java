package com.example;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex() throws Exception {
        super("Самец");
    }

    @Override
    public int getKittens() {
        return getKittens(0);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }


}
