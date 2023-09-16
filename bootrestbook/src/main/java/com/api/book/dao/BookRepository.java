package com.api.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.entity.Books;
import java.util.List;


public interface BookRepository extends CrudRepository<Books, Integer> {
	public Books  findById(int ids);

}
