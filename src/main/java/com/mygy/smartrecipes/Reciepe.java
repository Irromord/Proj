package com.mygy.smartrecipes;

import java.io.Serializable;
import java.util.HashMap;

public class Reciepe implements Serializable {
    private String name; //название
    private String cookingTime; //время готовки
    private String cookingSteps; // описание процесса готовки
    private int btnImgRes, icoRes; //кнопка рецепта и иконка блюда
    private HashMap<Ingridient,String> ingridients; // Hashmap - массив, содержащий в себе ingridient : кол-во

// Конструктор для создания объекта рецепта
    public Reciepe(String name, String cookingTime, int icoRes, int btnImgRes, HashMap<Ingridient, String> ingridients, String cookingSteps) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.icoRes = icoRes;
        this.btnImgRes = btnImgRes;
        this.ingridients = ingridients;
        this.cookingSteps = cookingSteps;
    }

    // Геттеры для доступа к данным рецепта

    // Возвращает название блюда
    public String getName() {
        return name;
    }

    // Возвращает ID ресурса изображения кнопки рецепта
    public int getBtnImgRes() {
        return btnImgRes;
    }

    // Возвращает ID ресурса иконки блюда
    public int getIcoRes() {
        return icoRes;
    }

    // Возвращает время приготовления
    public String getCookingTime() {
        return cookingTime;
    }

    // Возвращает описание шагов приготовления
    public String getCookingSteps() {
        return cookingSteps;
    }

    // Возвращает список ингредиентов и их количество
    public HashMap<Ingridient, String> getIngridients() {
        return ingridients;
    }
}
