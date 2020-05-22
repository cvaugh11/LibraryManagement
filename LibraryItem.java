package LabLibrary;

public class LibraryItem {

    private int publishYear;
    private String title, author, genre, ageGroup;
    private boolean isAvailable, isFact;

    // constructor
    public LibraryItem(int publishYear, String title, String author, String genre, String ageGroup, boolean isAvailable,
            boolean isFact) {
        this.publishYear = publishYear;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ageGroup = ageGroup;
        this.isAvailable = isAvailable;
        this.isFact = isFact;
    }

    // getters

    public int getPublishYear() {
        return publishYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public boolean getFactual() {
        return isFact;
    }

    // setters

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setFactuality(boolean isFactual) {
        this.isFact = isFact;
    }

    public LibraryItem(boolean isAvailable, boolean isFact) {
        if (isAvailable) {
            System.out.println("Yes, the book " + getTitle() + " is available");
        } else {
            System.out.println("Sorry, " + getTitle() + " is not available");
        }
        if (isFact) {
            System.out.println("Reference book or Newspaper");
        } else {
            System.out.println("General book or Magazine");
        }
    }

    @Override // Annotation telling us and compiler that we are Overriding previously defined
              // behavior
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " published " + this.getPublishYear();
    }

}
/*public interface Search {
    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchBySubject(String subject);
    public List<Book> searchByPublishYear(Date publishYear);
    public List<Book> searchByGenre(String Genre);
    public List<Book> searchByAgeGroup(String ageGroup);
    public List<Book> searchByisAvailable(boolean isAvailable );
    public List<Book> searchByisFactual(boolean isFact);
  } */