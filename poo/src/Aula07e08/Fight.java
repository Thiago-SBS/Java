package Aula07e08;

import java.util.Random;

public class Fight {
    private Fighter challenging;
    private Fighter challenged;
    private int round;
    private boolean approved;

    public Fighter getChallenging() {
        return challenging;
    }

    public void setChallenging(Fighter challenging) {
        this.challenging = challenging;
    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void scheduleFight(Fighter l1, Fighter l2) {
        if (l1.getCategory().equals(l2.getCategory()) && l1 != l2) {
            approved = true;
            challenging = l1;
            challenged = l2;
        } else {
            approved = false;
            challenging = null;
            challenged = null;

            System.out.println("The fight was not approved.\n");
        }
    }

    public void toFight() {
        if (isApproved()) {
            System.out.println("### CHALLENGER ###");
            challenging.toPresent();
            System.out.println("### CHALLENGED ###");
            challenged.toPresent();

            Random random = new Random();
            int winner = random.nextInt(3);

            switch (winner) {
                case 0:
                    System.out.println("The fight ended in a draw!\n");

                    challenging.drawFight();
                    challenged.drawFight();

                    break;
                case 1:
                    System.out.println("the challenger won the fight!");
                    System.out.println("Winner: " + challenging.getName() + "\n");

                    challenging.winFight();
                    challenged.loseFight();

                    break;
                case 2:
                    System.out.println("the challenged won the fight!");
                    System.out.println("Winner: " + challenged.getName() + "\n");

                    challenged.winFight();
                    challenging.loseFight();

                    break;
            }

            // winner = (int) (Math.random() * 3);

            //if (winner == 0) {
            //     System.out.println("The fight ended in a draw!\n");

            //    challenging.drawFight();
            //    challenged.drawFight();;

            //} else if (winner == 1) {
            //    System.out.println("the challenger won the fight!");
            //    System.out.println("Winner: " + challenging.getName() + "\n");

            //    challenging.winFight();
            //    challenged.loseFight();
            //} else  if (winner == 2) {
            //    System.out.println("the challenged won the fight!");
            //    System.out.println("Winner: " + challenged.getName() + "\n");

            //    challenged.winFight();
            //    challenging.loseFight();
            //}

        } else {
            System.out.println("The fight was not approved so it cannot happen.\n");
        }
    }
}