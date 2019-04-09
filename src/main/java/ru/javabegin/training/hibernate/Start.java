package ru.javabegin.training.hibernate;

import ru.javabegin.training.hibernate.entity.*;

public class Start {

    public static void main(String[] args) {

//        for (Book book : new BookHelper().getBookList()) {
//            System.out.println("Book = " + book.getName());
//        }

//        Author author = new Author("Artur");
//        new AuthorHelper().addAuthor(author);

        Book book = new Book("Rofl", 2);
        new BookHelper().addBook(book);
    }
}
