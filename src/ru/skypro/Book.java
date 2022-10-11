package ru.skypro;

import java.util.Objects;
import java.util.StringJoiner;

public class Book {
    //Необходимо реализовать следующий метод:
//На вход получаем список названий книг
//Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
//Все книги должны быть отсортированы по алфавиту с первой до последней полки
//Количество полок константное - 5 штук
//Вернуть книги распределенные по полкам

    private String name;

   public Book (String name) {
       this.name = name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return new StringJoiner("," , Book.class.getSimpleName() + "[", "]")
                .add("name='" + name + "")
                .toString();
    }
}