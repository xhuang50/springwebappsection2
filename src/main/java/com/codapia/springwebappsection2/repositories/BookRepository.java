package com.codapia.springwebappsection2.repositories;

import com.codapia.springwebappsection2.domin.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
