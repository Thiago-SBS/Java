package Aula07e08;

import java.util.List;

public class Aula07e08 {
    public static void main(String[] args) {
        Fighter l1 = new Fighter("Pretty Boy", "French", 31, 1.75, 68.9, 11, 2, 1);
        Fighter l2 = new Fighter("Putscript", "Brazil", 29, 1.68, 57.8, 14, 2, 3);
        Fighter l3 = new Fighter("Snapshadow", "EUA", 35, 1.65, 80.f, 12, 2, 2);
        Fighter l4 = new Fighter("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        Fighter l5 = new Fighter("UFOCobol", "Brazil", 37, 1.70, 119.3, 5, 4, 3);
        Fighter l6 = new Fighter("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        List<Fighter> fightersList = List.of(l1, l2, l3, l4, l5, l6);

        Fight uec01 = new Fight();

        uec01.scheduleFight(fightersList.get(4), fightersList.get(5));
        uec01.toFight();

        fightersList.get(4).status();
        fightersList.get(5).status();

    }
}