package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
       MyPhoneNumberValidator valid = new MyPhoneNumberValidator();
        valid.readFile("d:\\english.txt");

    }
}


