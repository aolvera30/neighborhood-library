package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        //create array to hold 20 books
        Book[] library =
                {

                        new Book(1, "9781982143091", "The Great Gatsby"),
                        new Book(2, "9780061120084", "To Kill a Mockingbird"),
                        new Book(3, "9781400033423", "1984"),
                        new Book(4, "9780544003415", "The Hobbit"),
                        new Book(5, "9780141439563", "Pride and Prejudice"),
                        new Book(6, "9780060838659", "The Catcher in the Rye"),
                        new Book(7, "9780446310789", "To Kill a Mockingbird"),
                        new Book(8, "9780765326355", "A Game of Thrones"),
                        new Book(9, "9780671723657", "One Hundred Years of Solitude"),
                        new Book(10,"9780141182551", "One Flew Over the Cuckoo's Nest"),
                        new Book(11,"9780062315007", "The Fault in Our Stars"),
                        new Book(12,"9781400079986", "The Kite Runner"),
                        new Book(13,"9780743273565", "The Da Vinci Code"),
                        new Book(14,"9780374533557", "Sapiens: A Brief History of Humankind"),
                        new Book(15,"9780060958027", "The Road"),
                        new Book(16,"9780679720201", "In Cold Blood"),
                        new Book(17,"9780679764025", "Into the Wild"),
                        new Book(18,"9780307594006", "The Help"),
                        new Book(19,"9780060850521", "Life of Pi"),
                        new Book(20,"9781594480003", "The Namesake")
                };

        int choice = 0;
        while (choice != 3) {
            System.out.println("Library Home Screen: ");
            System.out.println("1.Display Available Books");
            System.out.println("2.Display Checked Out Books");
            System.out.println("3.Exit");
            System.out.println("Enter your command: ");
            choice = Integer.parseInt(userInput.nextLine());
        }

        switch (choice)
        {
            case 1:
                displayAvailableBooks(library);
                System.out.println("1 Checkout Book");
                System.out.println("2 Return to Menu");
                int subChoice = Integer.parseInt(userInput.nextLine());
                switch (subChoice) {

                    case 1:
                        checkOutBook(library);
                        break;
                    case 2:
                        break;
                }
                break;

            case 2:
                displayCheckedOutBooks(library);
                System.out.println("(C) Check in Book");
                System.out.println("(X) Return to menu");
                String subInput = userInput.nextLine().strip().toUpperCase();
                switch (subInput) {
                    case "C":
                        checkInBook(library);
                        break;
                    case "X":
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                break;


            case 3:
                System.out.println("Take care of all books!");
                break;

            default:
                System.out.println("Invalid Selection");
        }


    }



    private static void displayAvailableBooks(Book[] book)
    {
        System.out.println("Available Books: ");
        for(Book book : book)

            if (!book.isCheckedOut())
            {
                System.out.println(book.getId() + ". " + book.getTitle() + " - ISBN: " + book.getIsbn() + " (Checked out to: " + book.getCheckedOutTo() + ")");
            }


    }


    private static void displayCheckedOutBooks(Book[] book)
    {
        System.out.println("Checked Out Books:");
        for (Book book : book) {
            if (book.isCheckedOut()) {
                System.out.println(book.getId() + ". " + book.getTitle() + " - ISBN: " + book.getIsbn() + " (Checked out to: " + book.getCheckedOutTo() + ")");
            }
        }
    }
    }

    private static void checkOutBook(Book[] book)
    {
        System.out.println("Enter the ID of the book you want to check out:");
        int bookId = Integer.parseInt(Main.userInput.nextLine());
        if (bookId < 1 || bookId > book.length) {
            System.out.println("Invalid book ID.");
            return;
        }
        Book selectedBook = book[bookId - 1];
        if (selectedBook.isCheckedOut()) {
            System.out.println("Sorry, the book is already checked out.");
        } else {
            System.out.println("Enter your name:");
            String name = Main.userInput.nextLine();
            selectedBook.checkOut(name);
        }
    private static void checkInBook(Book[] book)
    {
        private static void checkInBook(Book[] book) {
        System.out.println("Enter the ID of the book you want to check in:");
        int bookId = Integer.parseInt(Main.userInput.nextLine());
        if (bookId < 1 || bookId > book.length) {
            System.out.println("Invalid book ID.");
            return;
        }
        Book selectedBook = book[bookId - 1];
        if (!selectedBook.isCheckedOut()) {
            System.out.println("The book is not checked out.");
        } else {
            selectedBook.checkIn();
        }
    }



}