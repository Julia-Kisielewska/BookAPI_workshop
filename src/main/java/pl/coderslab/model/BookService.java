package pl.coderslab.model;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    Book getBookById(String id);

    void addBook(Book book);

    List<Book> updateBook(String id, Book book);

    List<Book> deleteBook(String id);
}
