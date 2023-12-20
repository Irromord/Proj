// Класс страницы для выбора ингридиентов

package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

// Класс Activity для выбора ингредиентов
public class IngridientsSelectorActivity extends AppCompatActivity {
    // переменная для хранения выбранной категории
    public static Category category;

    // Метод onCreate вызывается при создании Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Устанавливаем макет для данного Activity
        setContentView(R.layout.activity_ingridients_selector);

        // Находим кнопку "назад" по её ID и устанавливаем обработчик нажатия
        ImageButton backBtn = findViewById(R.id.selectIngridients_back);
        backBtn.setOnClickListener(v -> {
            // Очищаем список выбранных ингредиентов и завершаем Activity
            Ingridient.selectedIngridient.clear();
            finish();
        });

        // Проверяем, задана ли категория
        if(category != null){

            // Находим RecyclerView по ID и создаем для него адаптер
            RecyclerView recycler = findViewById(R.id.selectIngridients_recycler);
            IngridientsRecyclerAdapter adapter = new IngridientsRecyclerAdapter(this, Ingridient.allIngridients);
            recycler.setAdapter(adapter);

            // Находим кнопку для перехода к рецептам и устанавливаем обработчик нажатия
            ImageButton recipeBtn = findViewById(R.id.selectIngridients_recipeBtn);
            recipeBtn.setOnClickListener(v -> {
                // Создаем Intent для перехода к RecipesActivity и передаем в него выбранную категорию
                Intent intent = new Intent(this, RecipesActivity.class);
                RecipesActivity.category = category;
                startActivity(intent);
            });
        }
    }
}
