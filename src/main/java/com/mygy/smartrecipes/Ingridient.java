//класс ингридиента

package com.mygy.smartrecipes;

import java.io.Serializable;
import java.util.ArrayList;

// Класс Ingridient, реализующий интерфейс Serializable для возможности его сохранения и передачи
public class Ingridient implements Serializable {

    // Список всех ингредиентов, доступных в приложении
    public static ArrayList<Ingridient> allIngridients = new ArrayList<>(); //

    // Список выбранных ингредиентов
    public static ArrayList<Ingridient> selectedIngridient = new ArrayList<>();

    // Поле для хранения названия ингредиента
    private String name;

    // Конструктор класса Ingridient
    public Ingridient(String name) {
        this.name = name; // Установка названия ингредиента
        allIngridients.add(this); // Добавление созданного ингредиента в список всех ингредиентов
    }

    // Геттер для получения названия ингредиента
    public String getName() {
        return name;
    }
}
