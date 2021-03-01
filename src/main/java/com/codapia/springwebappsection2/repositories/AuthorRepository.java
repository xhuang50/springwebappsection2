package com.codapia.springwebappsection2.repositories;

import com.codapia.springwebappsection2.domin.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
