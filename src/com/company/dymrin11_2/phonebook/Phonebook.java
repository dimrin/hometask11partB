package com.company.dymrin11_2.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phonebook {

    /*
    0. Создать новый пакет phonebook.

    1. Создать класс Телефонный Справочник.

    2. Создать класс Запись.

    3. Класс Запись хранит Имя и Телефон.

    4. Класс Телефонный Справочник хранит множество записей типа данных Запись.

    5. В классе Телефонный Справочник реализовать метод add. Метод добавляет Запись в Телефонный Справочник.
    Примечание: Под одной фамилией может храниться несколько телефонов, потому допускается вероятность наличия нескольких записей.

    */
    private List<Note> list = new ArrayList<>();

    public List<Note> addToList() {
        list.add(new Note("Vadim", "0976548934"));
        list.add(new Note("David", "0986743212"));
        list.add(new Note("Joe", "0986743212"));
        list.add(new Note("Vadim", "0973457689"));
        list.add(new Note("Mark", "0973457689"));
        list.add(new Note("Vadim", "0973457689"));
        list.add(new Note("Henry", "0507893241"));
        list.add(new Note("John", "0678907612"));
        return list;
    }

    /*
    В классе Телефонный Справочник реализовать метод find(). Метод осуществляет поиск конкретной записи по имени.
    Если запись найдена (первая найденная), тогда ее необходимо вернуть, иначе возвращается null.
    Does not work
    */
    public List<Note> find(String name) {
        for (Note note : list) {
            return list.stream().filter(note1 -> note.getName().equals(name)).collect(Collectors.toList());
        }
        return null;
    }

}
