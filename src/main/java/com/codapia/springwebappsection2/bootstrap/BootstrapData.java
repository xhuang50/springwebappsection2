package com.codapia.springwebappsection2.bootstrap;

import com.codapia.springwebappsection2.domin.Author;
import com.codapia.springwebappsection2.domin.Book;
import com.codapia.springwebappsection2.repositories.AuthorRepository;
import com.codapia.springwebappsection2.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book book1 = new Book("Book1", "123123");
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book1);


        Author rod = new Author("Rod", "Johnson");
        Book book2 = new Book("Book2", "234234");
        rod.getBooks().add(book2);
        book2.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(book2);

        System.out.println("Started :");
        System.out.println("# books: " + bookRepository.count());

    }
}
