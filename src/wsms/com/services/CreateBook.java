package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateBook {
	public void createBook(String ISBN, String bookTitle, String bookAuthors, String publishedBy, 
			String bookEdition, String yearOfPublication, String bookCopyright, int bookPageCount, 
			String bookStatus, LocalDate bookEntryDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		LibraryBooks book = new LibraryBooks();
		
		book.setISBN(ISBN);
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
	
	//CreateLendingBook
	public void createLendingBook(String LID, String stdID, String stdName, String stdClass,
			String stdClassLetter, String ISBN, String bookTitle, String bookAuthors, 
			String bookEdition, String yearOfPublication, String bookStatus, 
			LocalDate lendingDate, LocalDate expectedReturnDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		LendingBook lendBook = new LendingBook();
		
		lendBook.setLendLID(LID);
		lendBook.setLendStdID(stdID);
		lendBook.setLendStdName(stdName);
		lendBook.setLendStdClass(stdClass);
		lendBook.setLendStdClassLetter(stdClassLetter);
		lendBook.setLendISBN(ISBN);
		lendBook.setLendBookTitle(bookTitle);
		lendBook.setLendBookAuthors(bookAuthors);
		lendBook.setLendBookEdition(bookEdition);
		lendBook.setLendYearOfPublication(yearOfPublication);
		lendBook.setLendBookStatus(bookStatus);
		lendBook.setLendingDate(lendingDate);
		lendBook.setExpectedReturnDate(expectedReturnDate);
		lendBook.setUser(user);
		
		entitymanager.persist(lendBook);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//CreateLendingBookCount
	public void createLendingBookCount(String ISBN, String bookTitle, String bookAuthors, String publishedBy, 
			String bookEdition, String yearOfPublication, String bookCopyright, int bookPageCount, 
			String bookStatus, LocalDate bookEntryDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		LibraryBooks book = new LibraryBooks();
		
		book.setISBN(ISBN);
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
	
	//Create ReturningBook
	public void createReturningBook(String LID, String stdID, String stdName, String stdClass,
			String stdClassLetter, String ISBN, String bookTitle, String bookAuthors, 
			String bookEdition, String yearOfPublication, int defaultDays, 
			int noOfDefaults, String penalty,	LocalDate lendingDate, 
			LocalDate expectedReturnDate, LocalDate dateReturned, 
			LocalDate suspendedUntil, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ReturningBook retBook = new ReturningBook();
		
		retBook.setReturnLID(LID);
		retBook.setReturnStdID(stdID);
		retBook.setReturnStdName(stdName);
		retBook.setReturnStdClass(stdClass);
		retBook.setReturnStdClassLetter(stdClassLetter);
		retBook.setReturnISBN(ISBN);
		retBook.setReturnBookTitle(bookTitle);
		retBook.setReturnBookAuthors(bookAuthors);
		retBook.setReturnBookEdition(bookEdition);
		retBook.setReturnYearOfPublication(yearOfPublication);
		retBook.setReturnDefaultDays(defaultDays);
		retBook.setReturnNoOfDefaults(noOfDefaults);
		retBook.setReturnPenalty(penalty);
		retBook.setLentDate(lendingDate);
		retBook.setExpectedReturnDate(expectedReturnDate);
		retBook.setActualReturnDate(dateReturned);
		retBook.setSuspendedUntil(suspendedUntil);
		retBook.setUser(user);
		
		entitymanager.persist(retBook);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Create DefaultPenalty
	public void createDefaultPenalty(String dfId, String stdName,
			String duration, String suspensionStatus, String reason, 
			LocalDate penaltyDate, LocalDate penaltyEndDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DefaultPenalty penalty = new DefaultPenalty();
		
		penalty.setDefaultId(dfId);
		penalty.setStdName(stdName);
		penalty.setDuration(duration);
		penalty.setSuspensionStatus(suspensionStatus);
		penalty.setReason(reason);
		penalty.setPenaltyDate(penaltyDate);
		penalty.setPenaltyEndDate(penaltyEndDate);
		penalty.setUser(user);
		
		entitymanager.persist(penalty);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
