// Страница, где выводится список подходящих рецептов

package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

// Класс Activity, представляющий экран со списком рецептов
public class RecipesActivity extends AppCompatActivity {
    // Статическая переменная для хранения выбранной категории рецептов
    public static Category category;

    // Метод, вызываемый при создании Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Установка пользовательского интерфейса из XML-файла макета
        setContentView(R.layout.activity_recipes);

        // Находим кнопку "назад" и устанавливаем обработчик нажатия на кнопку
        ImageButton backBtn = findViewById(R.id.recipes_back);
        backBtn.setOnClickListener(v -> {
            // Закрыть текущую Activity и вернуться назад
            finish();
        });

        // Создаем список для хранения отфильтрованных рецептов
        ArrayList<Reciepe> selected = new ArrayList<>();
        // Перебираем все рецепты в выбранной категории
        for(Reciepe r:category.getResiepes()){
            // Проверяем, содержат ли рецепты выбранные ингредиенты
            for(Ingridient i:Ingridient.selectedIngridient){
                boolean end = false;
                for(Ingridient ii :r.getIngridients().keySet()) {
                    if (ii.getName().equals(i.getName())) {
                        // Если рецепт содержит ингредиент, добавляем его в список и прерываем цикл
                        selected.add(r);
                        end = true;
                        break;
                    }
                }
                if(end) break;
            }
        }

        // Вывод информации о количестве рецептов для отладки
        System.out.println(Ingridient.selectedIngridient.size() + "-------" + category.getResiepes().size() + "++++++++++" + selected.size());

        // Настройка RecyclerView для отображения списка рецептов
        RecyclerView recycler = findViewById(R.id.recipes_recycler);
        RecipesRecyclerAdapter adapter = new RecipesRecyclerAdapter(this, selected);
        recycler.setAdapter(adapter);
    }
}
