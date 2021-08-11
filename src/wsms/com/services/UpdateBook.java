package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class UpdateBook {
	public void updateBook(String ISBN, String bookTitle, String bookAuthors, String publishedBy, 
			String bookEdition, String yearOfPublication, String bookCopyright, int bookPageCount, 
			String bookStatus, LocalDate bookEntryDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		LibraryBooks book = entitymanager.find(LibraryBooks.class, ISBN);
		
		book.setBookTitle(bookTitle);
		book.setBookAuthors(bookAuthors);
		book.setPublishedBy(publishedBy);
		book.setBookEdition(bookEdition);
		book.setYearOfPublication(yearOfPublication);
		book.setBookCopyright(bookCopyright);
		book.setBookPageCount(bookPageCount);
		book.setBookStatus(bookStatus);
		book.setBookEntryDate(bookEntryDate);
		book.setUser(user);
		
		entitymanager.persist(book);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//update LendBook
	public void updateLendingBook(String LID, LocalDate lendingDate, LocalDate expectedReturnDate, 
			String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		LendingBook lendBook = entitymanager.find(LendingBook.class, LID);
		
		lendBook.setLendingDate(lendingDate);
		lendBook.setExpectedReturnDate(expectedReturnDate);
		lendBook.setUser(user);
		
		entitymanager.persist(lendBook);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Update ReturningBook
	public void updateReturningBook(String LID, LocalDate returnedDate, int dfDays,
			String penalty, LocalDate suspUntil, int noOfDefaults,
			String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ReturningBook ret = entitymanager.find(ReturningBook.class, LID);
		
		ret.setActualReturnDate(returnedDate);
		ret.setReturnDefaultDays(dfDays);
		ret.setReturnPenalty(penalty);
		ret.setSuspendedUntil(suspUntil);
		ret.setReturnNoOfDefaults(noOfDefaults);
		ret.setUser(user);
		
		entitymanager.persist(ret);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
