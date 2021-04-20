package ru.grigan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your birthday day with format: ");
        String day = reader.readLine();
        System.out.println("Enter your birthday month: ");
        String month = reader.readLine();
        BeforeMyBirthday beforeMyBirthday = new BeforeMyBirthday();
        int dayBeforeMyBirthday = beforeMyBirthday.getDayBeforeMyBirthday(month, day);
        System.out.println(dayBeforeMyBirthday + " days before your birthday");
    }
}

