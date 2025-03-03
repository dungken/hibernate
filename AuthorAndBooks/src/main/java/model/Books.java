package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Books {
	@Id
	private String bookId;
	private String title;
	private double price;
	@ManyToOne
	@JoinColumn(name = "authorId")
	private Author author;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}
	
	public Books(String bookId, String title, double price, Author author) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
