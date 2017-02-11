package zajecia.dziewiec;


public class Book {


    private String title;
    private Author author;
    private int numberOfPages;
    private int releaseDate;
    private String description;
    private String[] content;
    private String category;


    public Book(String title, Author author, int releaseDate, String[] content) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.content = content;
        this.numberOfPages = content.length;

    }

    public Book(String title, Author author, int releaseDate, String description, String[] content, String category) {
        this(title, author, releaseDate, content);
        this.description = description;
        this.category = category;
    }

    public String getPage(int index) {
        int actualIndex = index - 1;
        if (actualIndex < this.numberOfPages && index >= 0) {
            return content[actualIndex];
        } else {
            return "Brak strony";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", releaseDate='" + releaseDate + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
