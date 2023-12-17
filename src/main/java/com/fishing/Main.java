package com.fishing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FishingGear> reelList = new ArrayList<>();
        reelList.add(new FishingGear("stella", "14000XG", 675));
        reelList.add(new FishingGear("twinpower", "14000PG", 660));
        reelList.add(new FishingGear("saltiga","14000XH", 665));
        reelList.add(new FishingGear("cartate", "14000XH", 635));
        for (FishingGear fishingGear : reelList) {
            System.out.printf("%-10s番手:%-8s自重:%3dg\n", fishingGear.getReelName(), fishingGear.getModelNumber(), fishingGear.getReelWeight());
        }
        System.out.println("");
//      リール名を小文字から大文字に変換して表示
        List<String> result = reelList.stream()
                .map(fishingGear -> fishingGear.getReelName().toUpperCase()).toList();
        System.out.println(result);
        System.out.println("");
//      番手に"XH"が含まれるものをフィルタリングして表示
        List<FishingGear> result2 = reelList.stream()
                .filter(fishingGear -> fishingGear.getModelNumber().contains("XH")).toList();
        result2.forEach(fishingGear -> System.out.printf("%-10s番手:%-8s自重:%3dg\n", fishingGear.getReelName(), fishingGear.getModelNumber(), fishingGear.getReelWeight()));
        System.out.println("");
//      自重を昇順に並べ替えて表示
        List<FishingGear> result3 = reelList.stream()
                .sorted(Comparator.comparing(fishingGear -> fishingGear.getReelWeight())).toList();
        result3.forEach(fishingGear -> System.out.printf("%-10s番手:%-8s自重:%3dg\n", fishingGear.getReelName(), fishingGear.getModelNumber(), fishingGear.getReelWeight()));
    }
}