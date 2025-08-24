package Aula14;

public class Views {
    private Viewer viewer;
    private Video film;

    public Views(Viewer viewer, Video film) {
        this.viewer = viewer;
        this.film = film;
        this.viewer.setTotalWatched(viewer.getTotalWatched() + 1);
        this.film.setViews(film.getViews() + 1);
    }

    public void review() {
        this.film.setReview(5);
    }
    public void review(int rating) {
        this.film.setReview(rating);
    }
    public void review(double percent) {
        int tot = 0;
        if (percent <= 20) {
            tot = 3;
        } else if (percent <= 50) {
            tot = 5;
        } else if (percent <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        film.setReview(tot);
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public Video getFilm() {
        return film;
    }

    public void setFilm(Video film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "Views{" +
                "viewer=" + viewer +
                ", film='" + film + '\'' +
                '}';
    }
}