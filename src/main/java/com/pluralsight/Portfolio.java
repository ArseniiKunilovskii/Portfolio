package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets ;

    public Portfolio(String name, String owner){
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    public double getValue(){
        double sum = 0;
        for(Valuable asset: assets){
            sum+= asset.getValue();
        }
        return sum;
    }

    public Valuable mostValuable() {
        Valuable most = null;
        if (!assets.isEmpty()) {
            most = assets.get(0);
            for (Valuable asset : assets) {
                if (most.getValue()<asset.getValue()){
                    most = asset;
                }
            }
        }
        return most;
    }
    public Valuable leastValuable() {
        Valuable least = null;
        if (!assets.isEmpty()) {
            least = assets.get(0);
            for (Valuable asset : assets) {
                if (least.getValue()>asset.getValue()){
                    least = asset;
                }
            }
        }
        return least;
    }

}
