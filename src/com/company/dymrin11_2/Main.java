package com.company.dymrin11_2;

import com.company.dymrin11_2.phonebook.Phonebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(phonebook.find(name));
    }
}
