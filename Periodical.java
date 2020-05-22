package LabLibrary;

public class Periodical extends LibraryItem {
    public Periodical(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFact) {
        super(publishYear, title, author, genre, ageGroup, isAvailable, isFact);
    }

    private boolean hasColorImg;

    public boolean getColor() {
        return hasColorImg;
    }

    public void setColor(boolean hasColorImg) {
        this.hasColorImg = hasColorImg;
    }

    public void LibraryItem(boolean hasColorImg) {
        if (hasColorImg) {
            System.out.println("Magazine");
        } else {
            System.out.println("Newspaper");
        }
    }

}