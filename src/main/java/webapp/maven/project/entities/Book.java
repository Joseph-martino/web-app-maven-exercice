package webapp.maven.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String author;
	private String illustrator;
	private String editor;
	private String collection;
	
	
	public Book() {
		
	}
	
	
	public Book(String title, String author, String illustrator, String editor, String collection) {
		
		this.title = title;
		this.author = author;
		this.illustrator = illustrator;
		this.editor = editor;
		this.collection = collection;
		
	}
	
	public String getInformations() {
		/*
		StringBuilder stringBuilder = new StringBuilder("Titre: ");
		stringBuilder.append(this.title);
		
		stringBuilder.toString();
		*/
		
		
		String informations = "Titre: " + this.title + ", auteur: " + this.author + ", illustrateur: " 
							+this.illustrator + ", editor: " + this.editor + ", collection: " 
							+ this.collection + ", date: "; 
		return informations;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIllustrator() {
		return illustrator;
	}

	public void setIllustrator(String illustrator) {
		this.illustrator = illustrator;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	
}
