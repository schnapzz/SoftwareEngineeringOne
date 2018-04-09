//package dtu.Softwarehuset.app;
//
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//
//import dtu.Softwarehuset.app.OperationNotAllowedException;
//
//import static org.mockito.Mockito.mock;
//
//public class LibraryApp {
//	private boolean adminLoggedIn = false;
//	private DateServer dateServer = new DateServer();
//	private List<Book> books = new ArrayList<Book>();
//	private List<User> users = new ArrayList<User>();
//
//	public boolean adminLoggedIn() {
//		return adminLoggedIn;
//	}
//
//	public boolean adminLogin(String password) {
//		adminLoggedIn = password.equals("adminadmin");
//		return adminLoggedIn;
//	}
//
//	public void adminLogout() {
//		adminLoggedIn = false;
//	}
//
//	public void addBook(Book book) throws OperationNotAllowedException {
//		if (!adminLoggedIn()) {
//			throw new OperationNotAllowedException("Administrator login required");
//		}
//		books.add(book);
//	}
//
//	public List<Book> getBooks() {
//		return books;
//	}
//
//	public List<Book> search(String searchText) {
//		List<Book> searchList = new ArrayList<Book>();
//		for (Book b : books) {
//			if (b.getSignature().contains(searchText) || b.getTitle().contains(searchText)
//					|| b.getAuthor().contains(searchText))
//				searchList.add(b);
//		}
//		return searchList;
//	}
//
//	public void registerUser(User user) throws OperationNotAllowedException {
//		if (!adminLoggedIn()) {
//			throw new OperationNotAllowedException("Administrator login required");
//		} else if (isUserRegistered(user)) {
//			throw new OperationNotAllowedException("User is already registered");
//		} else {
//			users.add(user);
//		}
//	}
//
//	public boolean isUserRegistered(User user) {
//		boolean t = false;
//		for (User u : users) {
//			if (u.equals(user)) {
//				t = true;
//			}
//		}
//		return t;
//	}
//
//	public void borrowBook(User user, Book book) throws TooManyBooksException {
//		user.borrowBook(book);
//	}
//	
//	public void setDateServer(DateServer dateServer) {
//		this.dateServer = dateServer;
//	}
//
//    public Calendar getDate() {
//        return dateServer.getDate();
//    }
//
//}
