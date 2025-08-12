package Aula09;

public interface Publication {
    public abstract void open();
    public abstract void close();
    public abstract void flipThrough(int page);
    public abstract void nextPage();
    public abstract void previousPage();
}