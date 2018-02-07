package com.example.rahul.gamechooser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RaHuL on 2/4/2018.
 */

public class FindGame {
    private List<String> games;

    public FindGame(){
        games = new ArrayList<>();
        games.add("Clash Royale,\nClash of Clans,\nCastle Clash");
        games.add("Need for speed,\nDirt rally,\nForza horizon");
        games.add("Call of duty,\nFar cry,\nMax payne");
        games.add("Fifa18,\nPES2018,\nCricket");
        games.add("Edge,\nCreate,\nOsmos");
    }

    public String getGameList(int index){
        return games.get(index);
    }

    public String getGameList(String category){
        int index = getCategoryIndex(category);
        return games.get(index);
    }

    public int getCategoryIndex(String category){
        int index = 0;
        if (category.equals("Strategy")){
            index = 0;
        } else if (category.equals("Racing")){
            index = 1;
        } else if (category.equals("Action")){
            index = 2;
        } else if (category.equals("Sports")){
            index = 3;
        } else if (category.equals("Puzzle")){
            index = 4;
        }

        return index;
    }

    public String getGames (int index) {
        return games.get(index);
    }
}
