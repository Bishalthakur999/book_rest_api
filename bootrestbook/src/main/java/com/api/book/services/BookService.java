package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entity.Books;


@Component
public class BookService {
	
	
	@Autowired
	private BookRepository bookRepository;
	
//	private static List<Books> list =new ArrayList<>();
//
//	static{
//		list.add(new Books(2,"khi","tahavayana"));
//		list.add(new Books(3,"malai","pani"));
//		
//	}
//	
	//get all books
	
	public List<Books> getAllBooks(){
		return (List<Books>) bookRepository.findAll();
		
	}
	
	//get books by single id
	public Books getBookById(int id) {
		
		Books book=null;
		book=this.bookRepository.findById(id);
		//book=list.stream().filter(e->e.getId()==id).findFirst().get();
		
		return book;
	}
	
	//add data
	public Books addBook(Books b) {
	   Books result= bookRepository.save(b);
		System.out.println("books added suscessfully");
		return result;
		
	}
	//delete data
	public void deleteBooks( int id) {
//		list=list.stream().filter(book->book.getId()!=id).
//				collect(Collectors.toList());
		
		bookRepository.deleteById(id);
		
	}
	//update data
	public void updateBooks(Books book,int bid) {
//		list=list.stream().map(b->{
//			if(b.getId()==bid) 
//			{
//				b.setAuthor(book.getAuthor());
//				b.setName(book.getName());	
//				
//			}
//			return b;
//		}).collect(Collectors.toList());
		book.setId(bid);
		bookRepository.save(book);
	}
	
	

}
