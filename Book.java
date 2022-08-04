package com.company;

public class Book {
    String nameBook;
    String athoreName;
    String subject;
    String text;

    Book(String _nameBook, String _athoreName, String _subject, String _text){
        nameBook = _nameBook;
        athoreName = _athoreName;
        subject = _subject;
        text = _text;
    }
    Book(){
        nameBook = "";
        athoreName="";
        subject = "";
        text = "";
    }
}
