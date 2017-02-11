package zajecia.dziewiec;


import java.util.ArrayList;

public class Bookshelf {
    private ArrayList<Book> books;


    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public Book get(int index) {
        if (index >= 0 && index < books.size()) {
            return this.books.get(index);
        }
        return null;
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooksOf(String author) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            Author authorOfBook = book.getAuthor();
            boolean searchRequirement =
                    authorOfBook.getFirstName().startsWith(author) ||
                            authorOfBook.getLastName().startsWith(author) ||
                            (authorOfBook.getLastName() + " " + authorOfBook.getFirstName()).startsWith(author) ||
                            authorOfBook.toString().startsWith(author);

            if (searchRequirement) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksFrom(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate() == releaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksSince(int releaseData) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate() >= releaseData) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksLongerThan(int numberOfPages) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getNumberOfPages() > numberOfPages) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }
}
