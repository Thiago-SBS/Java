package Aula09;

public class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Person reader;

    public Book(String title, String author, int totalPages, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = 0;
        this.open = false;
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String details() {
        return "Book" +
                "\ntitle = " + title +
                "\nauthor = " + author +
                "\ntotalPages = " + totalPages +
                "\ncurrentPage = " + currentPage +
                "\nopen = " + open +
                "\nreader = " + reader.getName() +
                "\nage = " + reader.getAge() +
                "\ngender = " + reader.getGender();
    }

    @Override
    public void open() {
        open = true;
    }

    @Override
    public void close() {
        open = false;
    }

    @Override
    public void flipThrough(int page) {
        if (page > totalPages) {
            currentPage = 0;
        } else {
            currentPage = page;
        }
    }

    @Override
    public void nextPage() {
       currentPage++;
    }

    @Override
    public void previousPage() {
        currentPage--;
    }
}
