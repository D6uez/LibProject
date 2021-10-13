package com.ATeam.LibProj.bootInit;

import com.ATeam.LibProj.models.Book;
import com.ATeam.LibProj.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author dr559
 *
 * This is just for development as we are using an in-memory database. This will
 * add a single book to the database every time the project is ran
 */
//This is a Spring annotation, read about components and dependency injection
@Component
public class bootData implements CommandLineRunner {

    private final BookRepository bookRepository;

    public bootData(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book sowJava = new Book("Starting Out With Java", "9780134462011");

        bookRepository.save(sowJava);

        /* Used to test that the data was added successfully
            Expected output:
                Number of books:1
                Books:Optional[Book{title=Starting Out With Java, isbn=9780134462011}]
         */
        System.out.println("Number of books:" + bookRepository.count());
        System.out.println("Books:" + bookRepository.findById(1L));
    }

}
