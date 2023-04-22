package com.example.ebook.repository;

import com.example.ebook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BockRepository extends JpaRepository<Book, Long> {

}
