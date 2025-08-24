package Aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video v1 = new Video("The Home Team - Loud");
        Video v2 = new Video("Normandie - Renegade");
        Video v3 = new Video("The Home Team - Worthy");
        Video v4 = new Video("Normandie - Serotonin");

        Viewer p1 = new Viewer("Thiago", 24, "M", "Thiaguru");
        Viewer p2 = new Viewer("Gabriel", 24, "M", "Dantts");

        Views vis1 = new Views(p1, v3);
        Views vis2 = new Views(p1,v1);

        System.out.println(v1.toString());
        System.out.println(p1.toString());

        vis1.review(9);
        vis2.review(57.7);
        
        System.out.println(vis1.toString());
        System.out.println(vis2.toString());
    }
}