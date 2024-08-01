package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPhoneNumberValidator {
    public static void readFile(String fileName) throws IOException, FileNotFoundException {
        try {
            FileReader fr = new FileReader(fileName);
try {
    BufferedReader br = new BufferedReader(fr);
    String line ;
    while ((line = br.readLine()) != null) {
        if(isValidPhoneNumber(line)) {
            System.out.println(line);
        }
    }
    br.close();
}catch (IOException e){
    System.out.println("Помилка читання файла");
}
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    private static boolean isValidPhoneNumber(String phoneNumber) {
        // Перевірка на валідність номера телефону за допомогою регулярних виразів
        String pattern = "^\\(\\d{3}\\) \\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$";
        Pattern phonePattern = Pattern.compile(pattern);
        Matcher matcher = phonePattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
