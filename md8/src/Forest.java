import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    private static String season;

    // объявите недостающие переменные и добавьте конструктор
    Forest(ArrayList<MountainHare> hare){
        hares = hare;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    public static void setSeason(String newseason) {
        season = newseason;
        if (season.equals("Зима"))
            MountainHare.color = "Белый";
        else
            MountainHare.color = "Серо-рыжий";

    }


    // добавьте метод printHares()
    public void printHares(){
        for (MountainHare a : hares){
            System.out.println(a);
        }
    }

}