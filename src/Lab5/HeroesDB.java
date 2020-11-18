package Lab5;

import java.util.ArrayList;

public class HeroesDB {
    private ArrayList<Heroes> heroesArrayList;

    public void add(Heroes heroes) {
        this.heroesArrayList.add(heroes);
    }

    public ArrayList<Heroes> getHeroesArrayList() {
        return heroesArrayList;
    }

    public HeroesDB(ArrayList<Heroes> heroesArrayList) {
        this.heroesArrayList = heroesArrayList;
    }

    public void setHeroesArrayList(ArrayList<Heroes> heroesArrayList) {
        this.heroesArrayList = heroesArrayList;
    }

    public HeroesDB() {
        heroesArrayList = new ArrayList<>();
    }

    public HeroesDB filterByLocalizedName(String localizedName){
        HeroesDB heroesDB = new HeroesDB();
        for(Heroes heroes : this.heroesArrayList){
            if(heroes.getLocalizedName().toLowerCase().contains(localizedName.toLowerCase()))
                heroesDB.add(heroes);
        }
        return heroesDB;
    }

    @Override
    public String toString() {
        return "HeroesDB{" +
                "heroesArrayList=" + heroesArrayList +
                '}';
    }
}