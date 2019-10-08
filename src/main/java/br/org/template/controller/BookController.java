package br.org.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.org.template.entity.Book;
import br.org.template.repository.BookRepository;

@Controller
public class BookController {

	private BookRepository bookRepository;

	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@RequestMapping(value = "/listBooks", method = RequestMethod.GET)
	public String listaBooks(Model model) {
		List<Book> listBooks = bookRepository.findAll();
		if (listBooks != null) {
			model.addAttribute("books", listBooks);
		}
		return "listBooks";
	}

	@RequestMapping(value = "/addAuthor", method = RequestMethod.POST)
	public String adicionaBookAutor(Book Book) {
		bookRepository.save(Book);
		return "redirect:listBooks";
	}

}
