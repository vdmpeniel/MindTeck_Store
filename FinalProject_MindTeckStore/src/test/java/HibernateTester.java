package test.java;

import main.java.com.mindteck.store.dao.ProductDAO;
import main.java.com.mindteck.store.dao.UserDAO;
import main.java.com.mindteck.store.model.product.Book;
import main.java.com.mindteck.store.model.product.Gift;
import main.java.com.mindteck.store.model.product.Product;
import main.java.com.mindteck.store.model.product.Training;
import main.java.com.mindteck.store.model.user.Customer;

public class HibernateTester {
	// Create and persist a book
	public void testBookDAO(){
		Book book = new Book();		
		book.setTitle("Lord Of the Rings");
		book.setDescription("Great book");
		book.setCategory("Books");
		book.setAuthor("JRR Tolkien");
		book.setiSBN("35658967456ab");
		book.setPrice(15.00);
		book.setStackQuantity(25);	
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.save(book);		
	}
	
	// Create and persist a training resource
	public void testTrainigDAO(){
		Training training = new Training();
		training.setTitle("Java 2EE");
		training.setDescription("Dan showing off!");
		training.setCategory("Trainings");
		training.setAuthor("Dan William");		
		training.setPrice(200.00);
		training.setStackQuantity(15);
		training.setDownloadable(true);		
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.save(training);
	}
	
	// Create and persist a gift
	public void testGiftDAO(){
		Gift gift = new Gift();				
		gift.setTitle("Mindteck T-Shirt");
		gift.setDescription("MindTeck themed cotton t-shirt!");
		gift.setCategory("Gifts");			
		gift.setPrice(5.0);
		gift.setStackQuantity(5);
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.save(gift);
	}
	
	
	// Create and persist a Customer
	public void testCustomerDAO(){
		Customer customer = new Customer();
		customer.setName("Dan.......");
		customer.setLastName("Williams");
		customer.setEmail("danwilliams@gmail.com");
		customer.setPassword("77777777");
		customer.setPhoneNumber("3024569548");
		UserDAO userDAO = new UserDAO(); 
		userDAO.save(customer);
	}
	
	public static void main(String[] args){
			HibernateTester tester = new HibernateTester();
			
			// Persiting individual products
			//tester.testBookDAO();			
			//tester.testTrainigDAO();
			//tester.testGiftDAO();
			
			tester.testCustomerDAO();
	}
	
}
