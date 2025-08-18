import json.JsonService;
import information.Game;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Game game1 = Game.builder().name("Expedition 33").music("Lumiere").build();
        Game game2 = Game.builder().name("Elden ring").music("Main theme").build();
        Game game3 = Game.builder().name("STAR WARS: A GUERRA DOS CLONES").music("DUEL OF FATES").build();

        List<Game> games = new ArrayList<>();

        games.add(game1);
        games.add(game2);
        games.add(game3);

        JsonService jsonService = new JsonService();
        String json = jsonService.convertToJson(games);

        System.out.println(json);
        jsonService.saveJson(json);

    }
}