package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LibraryIsFullException {
        Scanner  scr = new Scanner(System.in);
        System.out.println("Enter Your Book Name: ");
        String _nameBook = scr.nextLine();
        System.out.println("Enter Your Athore Name: ");
        String _athoreName = scr.nextLine();
        System.out.println("Enter Your Subject: ");
        String _subject = scr.nextLine();
        System.out.println("Enter Your Text: ");
        String _text = scr.nextLine();
        System.out.println("Enter Your Format: ");
        String _format = scr.nextLine();

        Ebook eb = new Ebook(_nameBook, _athoreName, _subject, _text, _format);
        Library li = new Library();
        li.addBook(eb);

        System.out.println("Enter Your Search Text: ");
        String _search = scr.nextLine();

        /*if(li.findText(_search,))
            System.out.println("The Search text does in Book");
        else
            System.out.println("The Search text doesnot in Book");

         */
    }
}
