package zajecia.dziewiec;

import java.util.ArrayList;

public class Zajecia9 {
    public static void main(String[] args) {


//        User user = new User("Jan","Nowak","213.21312.");
//        Address address = new Address("Poznan","Marcelinska",102,"60-324","Poland");
//        user.address=address;
//        user.print();
        String message = "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium.";
        Bookshelf bookshelf = new Bookshelf();
        Author henrykSienkiewicz = new Author("Henryk", "Sienkiewicz");
        Book book = new Book("Krzyzacy", henrykSienkiewicz, 2000, message.split(" "));
        Book book2 = new Book("Odniem i mieczem", henrykSienkiewicz, 2060, message.split(" "));
        Book book3 = new Book("Pan Wolodyjowski", henrykSienkiewicz, 2030, message.split(" "));
        Book book4 = new Book("Dziady", new Author("Adam", "Mickiewicz"), 2050, message.split(" "));
        bookshelf.add(book);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);
        ArrayList<Book> booksOf = bookshelf.getBooksOf("Mic");
        for (Book b : bookshelf.getBooksOf("Sie")) {
            System.out.println(b);
        }
//        ArrayList<Book>booksOf = bookshelf.getBooksFrom(2060);
//        ArrayList<Book>booksOf = bookshelf.getBooksSince(2040);
//        ArrayList<Book> booksOf = bookshelf.getBooksLongerThan(2);
//        for (Book b:bookshelf.getBooksOf()){
//            System.out.println(b);
//        }
        for (Book b : booksOf) {
            System.out.println(b);
        }
//        System.out.println(book.toString());
//        bookshelf.add(book);
//        System.out.println(bookshelf.get(0).getAuthor());
//        book.setCategory("Historyczna");
//        book.setDescription("Nawet fajna");
//        String page = book.getPage(5);
//        System.out.println(page);
//        user.print();
//        User[] users=new User[2];
//        users[0]=user;
//        users[1]=user2;
//        printUsers(users);
    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();
        }
    }
}
