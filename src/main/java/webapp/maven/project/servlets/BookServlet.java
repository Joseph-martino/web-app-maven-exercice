package webapp.maven.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.maven.project.entities.Book;
import webapp.maven.project.services.BookService;


/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BookService bookService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
         this.bookService = new BookService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Bonjour ça va ?").append(request.getContextPath());
		int id = Integer.parseInt(request.getParameter("book-id"));
		
		Book book = bookService.getBookById(id);
		PrintWriter writer = response.getWriter();		
		writer.println("<h2>Titre: " + book.getTitle() + ", autheur: " + book.getAuthor() + ", illustrateur: " + book.getIllustrator() + ", editeur: "
				+ book.getEditor() + ", collection: " + book.getCollection()+"</h2>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String illustrator = request.getParameter("illustrator");
		String editor = request.getParameter("editor");
		String collection = request.getParameter("collection");
		PrintWriter writer = response.getWriter();
		writer.println("<h2>Titre: " + title + ", autheur: " + author + ", illustrateur: " + illustrator + ", editeur: "
				+ editor + ", collection: " + collection +"</h2>");
		Book book = new Book(title, author, illustrator, editor, collection);
		bookService.createBook(book);
		
		writer.close();
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idAsString = request.getParameter("id");
		int id = Integer.parseInt(idAsString);
		bookService.deleteBook(id);
		
	}

	
	

}
