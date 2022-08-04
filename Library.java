package com.company;

import java.util.ArrayList;

public class Library {
        ArrayList<Book> Books = new ArrayList<>();
        ArrayList<Member> Members = new ArrayList<>();
        final int Max_Books = 1000;
        final int Max_Members = 500;
    /////kamel shvd

    void addBook (Book _book) throws LibraryIsFullException{
            if (Books.size() < Max_Books)
                Books.add(_book);
            else
                throw new LibraryIsFullException("Library is Full Exception");
    }
}

