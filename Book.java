package Library-Lending-System;
public class Book {
    private int id;
    private String title;
    private int availableCopies;

    public Book(int id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.availableCopies = copies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public void borrowCopy() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void returnCopy() {
        availableCopies++;
    }
}
