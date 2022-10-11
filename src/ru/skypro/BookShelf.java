package ru.skypro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf {

    public static void main (String[] args) {
        getShelvesOfBooks (getBooks ());
    }

    private static List <ArrayList<Book>> getShelvesOfBooks (List<Book> books) {
        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getName))
                .collect(Collectors.toList());
        List<ArrayList<Book>> shelves = new ArrayList<>();
        for (int i=0; i<5; i++) {
            ArrayList <Book> shelf = new ArrayList<>();
            shelves.add (shelf);
        }
        int indexBook = 0;
        int indexShelf = 0;
        while (indexBook < sortedBooks.size()) {
            int perShelf = getBooksPerShelf (sortedBooks.size() - indexBook, shelves.size() - indexShelf);
            for (int i = 0; i<perShelf; i++) {
                shelves.get (indexShelf).add (sortedBooks.get(indexBook));
                indexBook++;}
            indexShelf++;}
        int index = 1;
        for (ArrayList<Book> shelf : shelves) {
            System.out.println("shelf" + index + "=" + shelf);
            index++;}
        return shelves;}

    private static int getBooksPerShelf (int bookSize, int shelvesSize) {
        int perShelf = bookSize / shelvesSize;
        if (perShelf * shelvesSize <bookSize) {
            perShelf++;}
        return perShelf;
            }

            private static List <Book> getBooks () {
                Book book1 = new Book("Война и Мир");
                Book book2 = new Book("Мастер и Маргарита ");
                Book book3 = new Book("Том Сойер");
                Book book4 = new Book("Властелин колец");
                Book book5 = new Book("Гордость и предубеждение");
                Book book6 = new Book("Ребекка");
                Book book7 = new Book("Унесенные ветром");
                Book book8 = new Book("Маленькие женщины");
                Book book9 = new Book("Остров сокровищ");
                Book book10 = new Book("Анна Каренина");
                Book book11 = new Book("Преступление и наказание");
                Book book12 = new Book("Парфюмер");
                Book book13 = new Book("Тайная история");
                Book book14 = new Book("Алхимик");
                Book book15 = new Book("Маленький принц ");

                List <Book> books = new ArrayList<>();
                books.add (book1);
                books.add (book2);
                books.add (book3);
                books.add (book4);
                books.add (book5);
                books.add (book6);
                books.add (book7);
                books.add (book8);
                books.add (book9);
                books.add (book10);
                books.add (book11);
                books.add (book12);
                return books;
        }
    }