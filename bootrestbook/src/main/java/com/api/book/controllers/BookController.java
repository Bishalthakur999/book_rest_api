package com.api.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entity.Books;
import com.api.book.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService; 
	
	//@RequestMapping(value = "/books",method = RequestMethod.GET)
	@GetMapping("/books")
	public List<Books> getBooks() {
//		Books book =new Books();
//		book.setId(1);
//		book.setName("rich dad poor dad");
//		book.setAuthor("robert kiosaki");
		
		return  bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Books getBook(@PathVariable("id") int ids) {
		return bookService.getBookById(ids);
	
	
	}
	
	@PostMapping("/books")
	public Books add(@ RequestBody Books book) {
		return bookService.addBook(book);
	}
	
	@DeleteMapping("/books/{bid}")
	public void deleteBooks(@PathVariable("bid") int bid) {
		bookService.deleteBooks(bid);
		
	}
	@PutMapping("/books/{bid}")
	public Books updateBooks(@RequestBody Books book,@PathVariable("bid") int bid) {
		bookService.updateBooks(book, bid);
		return book;
		
	}

}
