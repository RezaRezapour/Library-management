package com.company;

import java.util.Random;

public class Member {
    String name;
    int age;
    String id;

    Member(String _name, int _age){
        name = _name;
        age = _age;
        String toBetweenChar;
        String toFirstChar;
        String lastChar;
        toFirstChar = new String(String.valueOf(_age));
        int number_name = _name.length();
        if(number_name < 10)
            toBetweenChar = "0"+ new String(String.valueOf(number_name));
        else
            toBetweenChar = new String(String.valueOf(number_name));
        Random random = new Random();
        random.nextInt(10);
        lastChar = new String(String.valueOf(random));
        id = toFirstChar + toBetweenChar + lastChar;
    }
}
