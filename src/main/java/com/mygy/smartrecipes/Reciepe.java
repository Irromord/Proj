package com.mygy.smartrecipes;

import java.io.Serializable;
import java.util.HashMap;

public class Reciepe implements Serializable {
    private String name; //название
    private String cookingTime; //время готовки
    private String cookingSteps; // описание процесса готовки
    private int btnImgRes, icoRes; //кнопка рецепта и иконка блюда
    private HashMap<Ingridient,String> ingridients; // Hashmap - массив, содержащий в себе ingridient : кол-во

    public Reciepe(String name, String cookingTime, int icoRes,int btnImgRes, HashMap<Ingridient, String> ingridients, String cookingSteps) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.icoRes = icoRes;
        this.btnImgRes = btnImgRes;
        this.ingridients = ingridients;
        this.cookingSteps = cookingSteps;
    }

    //функция для получения этих данных
    
    public String getName() {
        return name;
    }
    public int getBtnImgRes() {
        return btnImgRes;
    }

    public int getIcoRes() {
        return icoRes;
    }


    public String getCookingTime() {
        return cookingTime;
    }

    public String getCookingSteps() {
        return cookingSteps;
    }

    public HashMap<Ingridient, String> getIngridients() {
        return ingridients;
    }
}
