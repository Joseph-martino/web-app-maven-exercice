package webapp.maven.project.services;

import webapp.maven.project.entities.Book;
import webapp.maven.project.repositories.BookRepository;

public class BookService {
	
private BookRepository bookRepository;
	
	public BookService() {
		this.bookRepository = new BookRepository();
	}
	
	public Book getBookById(int id) {
		return bookRepository.getById(id);
	}
	
	public void createBook(Book book) {
		bookRepository.create(book);	
	}
	
	public void deleteBook(int id) {
		bookRepository.delete(id);
	}

}
