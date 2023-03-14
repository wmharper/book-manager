package com.csc340sp23.bookmanager.Book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Billy
 */
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
