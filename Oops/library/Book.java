class Book{
  // instance variable
  static int totalBooks;
  String title;
  String author;
  String isbn;
  boolean isBorrow;
  static {
    totalBooks = 0;
  }
  {
    totalBooks++;
  }

  Book(String isbn, String title, String author) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  Book(String isbn) {
    this(isbn, "Unknown", "Unknown");
  }

  public static int getTotalBook() {
    return totalBooks;
  };
  
  public void borrowBook() {
    if(isBorrow){
      System.out.println("Book is already borrowed");
    } else {
      isBorrow = true;
      System.out.println("Book borrowed successfully");
    }
  };
  
  public void returnBook() {
    if(!isBorrow){
      System.out.println("Book is in the labraray");
    } else {
      isBorrow = false;
      System.out.println("Book returned successfully");
    }
  };
  
  static void main ( String args[]) {
    Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
    Book book2 = new Book("2", "To Kill a Mockingbird", " Harper Lee");
    System.out.println("Total books in library: " + Book.getTotalBook());
    book1.borrowBook();
    book1.borrowBook();
    book2.borrowBook();
    book2.borrowBook();
    System.out.println("Total books in library: " + Book.getTotalBook());
    book1.returnBook();
    book1.returnBook();
    book2.returnBook();
    book2.returnBook();
    System.out.println("Total books in library: " + Book.getTotalBook());

  }
}