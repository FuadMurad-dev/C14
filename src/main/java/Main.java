import json.JsonService;
import information.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do jogo:");

        String nome = in.nextLine();

        System.out.println("Digite o tema do jogo:");

        String tema = in.nextLine();

        Game game1 = Game.builder().name(nome).music(tema).build();

        System.out.println("Digite o nome de outro jogo:");

        nome = in.nextLine();

        System.out.println("Digite o tema deste outro jogo:");

        tema = in.nextLine();

        Game game2 = Game.builder().name(nome).music(tema).build();

        List<Game> games = new ArrayList<>();

        games.add(game1);
        games.add(game2);

        JsonService jsonService = new JsonService();
        String json = jsonService.convertToJson(games);

        System.out.println(json);
        jsonService.saveJson(json);

    }
}