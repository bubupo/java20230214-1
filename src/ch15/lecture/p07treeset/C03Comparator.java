package ch15.lecture.p07treeset;

import java.util.*;

public class C03Comparator {
	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<>();
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("glory"));
		
		System.out.println(set);
	}
}



class Book{
	private String title;

	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}

	public Book(String title) {
		super();
		this.title = title;
	}
}
