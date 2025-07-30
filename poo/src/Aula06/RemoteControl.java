package Aula06;

public class RemoteControl implements Controller {
    private int volume;
    private boolean turnOn;
    private boolean play;

    public RemoteControl() {
        this.volume = 50;
        this.turnOn = false;
        this.play = false;
    }

    private   void setVolume(int vol) {
        this.volume = vol;
    }
    private int getVolume() {
        return this.volume;
    }
    private void setTurnOn(boolean turn) {
        this.turnOn = turn;
    }
    private boolean getTurnOn() {
        return this.turnOn;
    }
    private void setPlay(boolean ply) {
        this.play = ply;
    }
    private boolean getPlay() {
        return this.play;
    }

    public void turnOn() {
        this.setTurnOn(true);
    }
    public void turnOff() {
        this.setTurnOn(false);
    }
    public void openMenu() {
        if (this.getTurnOn()) {
            System.out.println("------- MENU -------");
            System.out.println("Is the TV on? - " + this.getTurnOn());
            System.out.println("Is the TV playing? - " + this.getPlay());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("The TV is off.");
        }
    }
    public void closeMenu() {
        if (this.getTurnOn()) {
            System.out.println("Closing menu...");
        }
    }
    public void moreVolume() {
        if (this.getTurnOn()) {
            if (this.getVolume() == 100) {
                System.out.println("The TV is already at maximum volume.");
                for (int i = 0; i < this.getVolume(); i += 10) {
                    System.out.print("|");
                }
            } else {
                this.setVolume(this.getVolume() + 10);
                System.out.println("increased volume");
                for (int i = 0; i < this.getVolume(); i += 10) {
                    System.out.print("|");
                }
                System.out.println();
            }
        } else {
            System.out.println("The TV is off.");
        }
    }
    public void lessVolume() {
        if (this.getTurnOn()) {
            if (this.getVolume() == 0) {
                System.out.println("The TV is already at minimum volume.");
            } else {
                this.setVolume(this.getVolume() - 10);
                System.out.println("decreased volume");
                for (int i = 0; i < this.getVolume(); i += 10) {
                    System.out.print("|");
                }
            }
        } else {
            System.out.println("The TV is off.");
        }
    }
    public void mute() {
        if (this.getTurnOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    public void unmute() {
        if (this.getTurnOn() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    public void play() {
        if (this.getTurnOn() && !this.getPlay()) {
            this.setPlay(true);
        }
    }
    public void pause() {
        if (this.getTurnOn() && this.getPlay()) {
            this.setPlay(false);
        }
    }
}