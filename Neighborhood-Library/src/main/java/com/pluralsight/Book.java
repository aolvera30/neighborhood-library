package com.pluralsight;

public class Book
{
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title)

    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }


    //Getters and Setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean getIsCheckedOut()
    {
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean isCheckedOut)
    {
        this.isCheckedOut = isCheckedOut;
    }

    public String getCheckedOutTo()
    {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo)
    {
        this.checkedOutTo = checkedOutTo;
    }

    //Check out Method
    public void checkOut(String name)
    {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("Book checked out to: " + name);
        } else {
            System.out.println("This book is already checked out.");
        }
    }

    // Check in Method
    public void checkIn()
    {
        if (isCheckedOut) {
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println("Book checked in.");
        } else {
            System.out.println("This book is already checked in.");
        }

    }
    //Book info
    public String toString()
    {
        if (isCheckedOut)
        {
            return "Book ID: " + id + ", Title: " + title + ", ISBN: " + isbn + ", Checked Out: " + isCheckedOut +
                    ", Checked Out To: " + checkedOutTo;
        }

        else
        {
            return "Book ID: " + id + ", Title: " + title + ", ISBN: " + isbn + ", Checked Out: " + isCheckedOut;
        }
    }
}








































































































































































