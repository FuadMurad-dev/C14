import json.JsonService;
import information.Game;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Game game1 = Game.builder().name("Expedition 33").music("Lumiere").difficulty("HARD").MetaScore(99).Year(2025).build();
        Game game2 = Game.builder().name("Elden ring").music("Main theme").difficulty("HARD").MetaScore(95).Year(2022).build();
        Game game3 = Game.builder().name("STAR WARS: A GUERRA DOS CLONES").music("DUEL OF FATES").difficulty("HARD").MetaScore(88).Year(2008).build();
        Game game4 = Game.builder().name("Hades").music("Main theme").difficulty("HARD").MetaScore(90).Year(2016).build();
        Game game5 = Game.builder().name("Person 5").music("I belive").difficulty("Median").MetaScore(70).Year(2019).build();

        List<Game> games = new ArrayList<>();

        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);
        games.add(game5);

        JsonService jsonService = new JsonService();
        String json = jsonService.convertToJson(games);

        System.out.println(json);
        jsonService.saveJson(json);

    }
}