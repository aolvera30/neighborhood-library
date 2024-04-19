package com.pluralsight;

public class Book
{
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo)

    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = null;
    }

    //Getters and Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public boolean getIsCheckedOut() {return isCheckedOut;}
    public void setIsCheckedOut(boolean isCheckedOut) {this.isCheckedOut = isCheckedOut;}

    public String getCheckedOutTo() {return checkedOutTo;}
    public void setCheckedOutTo(String checkedOutTo) {this.checkedOutTo = checkedOutTo;}

    //Checked Out and In Methods
    public void checkOut(String name) {
        isCheckedOut = !isCheckedOut;
        checkedOutTo = isCheckedOut ? name : null;
        String action = isCheckedOut ? "checked out to " + name : "already checked out";
        System.out.println(title + " has been " + action);
    }
    public void checkIn() {
        isCheckedOut = false;
        checkedOutTo = null;
        System.out.println(title + " has been checked in.");
    }


    }













