package com.company;

public class Ebook extends Book{
    String format;

    Ebook(String _nameBook, String _athoreName, String _subject, String _text, String _format){
        super(_nameBook, _athoreName, _subject, _text);
        format = _format;
    }
}
