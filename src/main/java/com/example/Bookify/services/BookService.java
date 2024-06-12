package com.example.Bookify.services;

import com.example.Bookify.models.Book;
import com.example.Bookify.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(long id){
        return bookRepository.findById(id);
    }

//    public Book createBook(Book book){
//        return bookRepository.save(book);
//    }

    public void deleteBook(long id){
        bookRepository.deleteById(id);
    }

}
