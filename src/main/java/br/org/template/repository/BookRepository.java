package br.org.template.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.template.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByAuthor(String author);

	List<Book> findByTitle(String title);

	Book findByIsbn(String isbn);

}
