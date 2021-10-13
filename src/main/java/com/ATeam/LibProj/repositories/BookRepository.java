package com.ATeam.LibProj.repositories;

import com.ATeam.LibProj.models.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dr559
 *
 * Handles all basic db CRUD operations by simply extending CrudRepository and
 * defining the types (entity, id)
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
