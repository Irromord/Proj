// Класс непосредственно самих категорий

package com.mygy.smartrecipes;

import java.io.Serializable;
import java.util.ArrayList;

// Класс Category, который реализует интерфейс Serializable для возможности сохранения его экземпляров
public class Category implements Serializable {
    private String name; // Имя категории
    private int btnImageRes; // ID изображения для кнопки
    private ArrayList<Reciepe> resiepes = new ArrayList<>(); // Список рецептов, принадлежащих к этой категории

    // Конструктор класса Category
    public Category(String name, int btnImageRes) {
        this.name = name; // Установка имени категории
        this.btnImageRes = btnImageRes; // Установка изображения для кнопки
    }

    // Геттер для получения имени категории
    public String getName() {
        return name;
    }

    // Геттер для получения ID изображения кнопки
    public int getBtnImageRes() {
        return btnImageRes;
    }

    // Геттер для получения списка рецептов категории
    public ArrayList<Reciepe> getResiepes() {
        return resiepes;
    }

    // Метод для добавления нового рецепта в список рецептов категории
    public void addReciepe(Reciepe reciepe){
        resiepes.add(reciepe); // Добавление рецепта в список
    }
}
