package testhibernate;

import com.mindteck.store.repositories.BookRepository;
import com.mindteck.store.repositories.CustomerRepository;
import com.mindteck.store.repositories.GiftRepository;
import com.mindteck.store.repositories.TrainingRepository;

import main.java.com.mindteck.store.model.product.Book;
import main.java.com.mindteck.store.model.product.Gift;
import main.java.com.mindteck.store.model.product.Training;
import main.java.com.mindteck.store.model.user.Customer;

public class HibernateTester {
	// Create and persist a book
	public void testPersistBookRepository(){
		Book book = new Book();		
		book.setTitle("Lord Of the Rings");
		book.setDescription("Great book");
		book.setCategory("Books");
		book.setAuthor("JRR Tolkien");
		book.setiSBN("35658967456ab");
		book.setPrice(15.00);
		book.setStackQuantity(25);	
		
		BookRepository bookRepository = new BookRepository();
		bookRepository.save(book);		
	}	
		
	// Create and persist a training resource
	public void testPersistTrainigRepository(){
		Training training = new Training();
		training.setTitle("Java 2EE");
		training.setDescription("Dan showing off!");
		training.setCategory("Trainings");
		training.setAuthor("Dan William");		
		training.setPrice(200.00);
		training.setStackQuantity(15);
		training.setDownloadable(true);		
		
		TrainingRepository trainingRepository = new TrainingRepository();
		trainingRepository.save(training);
	}
	
	// Create and persist a gift
	public void testPersistGiftRepository(){
		Gift gift = new Gift();				
		gift.setTitle("Mindteck T-Shirt");
		gift.setDescription("MindTeck themed cotton t-shirt!");
		gift.setCategory("Gifts");			
		gift.setPrice(5.0);
		gift.setStackQuantity(5);
		
		GiftRepository giftRepository = new GiftRepository();
		giftRepository.save(gift);
	}	
	
	// Create and persist a Customer
	public void testPersistCustomerRepository(){
		Customer customer = new Customer();
		customer.setName("Dan.......");
		customer.setLastName("Williams");
		customer.setEmail("danwilliams@gmail.com");
		customer.setPassword("77777777");
		customer.setPhoneNumber("3024569548");
		CustomerRepository customerRepository = new CustomerRepository(); 
		customerRepository.save(customer);
	}
	
	
	// Delete a book
	public void testDeleteBookRepository(){				
		BookRepository bookRepository = new BookRepository();
		Book book = bookRepository.getBookByISBN("35658967456ab");
		bookRepository.delete(book);		
	}
		
	// Delete a Training
	public void testDeleteTrainingRepository(){				
		TrainingRepository trainingRepository = new TrainingRepository();
		Training training = trainingRepository.getTrainingByISBN("35658967456ab");
		trainingRepository.delete(training);		
	}
	
	// Delete a Gift
	public void testDeleteGiftRepository(){				
		GiftRepository giftRepository = new GiftRepository();
		Gift gift = giftRepository.getGiftBySerialNumber(456987L);
		giftRepository.delete(gift);		
	}
	
	// Delete a Customer
	public void testDeleteCustomerRepository(){				
		CustomerRepository customerRepository = new CustomerRepository();
		Customer customer = customerRepository.getCustomerById(1);
		customerRepository.delete(customer);		
	}
	
	public static void main(String[] args){
			HibernateTester tester = new HibernateTester();
			
			tester.testPersistBookRepository();			
			//tester.testDeleteBookRepository();
			
			//tester.testPersistTrainigRepository();
			//tester.testDeleteTrainigRepository();
			
			//tester.testPersistGiftRepository();
			//tester.testDeleteGiftRepository();
			
			//tester.testPersistCustomerRepository();
			tester.testDeleteCustomerRepository();
	}
	
}
