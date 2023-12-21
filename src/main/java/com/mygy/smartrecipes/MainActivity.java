//вступительный экран с кнопкной "начать"

package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

// Основной класс Activity для приложения.
public class MainActivity extends AppCompatActivity {

    // Метод onCreate вызывается при создании Activity, начало жизненного цикла приложения
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Установка пользовательского интерфейса для этой Activity из XML-макета.
        setContentView(R.layout.activity_main);

        // Находим кнопку запуска по её ID в XML-макете.
        Button startBtn = findViewById(R.id.main_startBtn);

        // Устанавливаем обработчик нажатия на кнопку запуска.
        startBtn.setOnClickListener(v -> {
            // Создание нового Intent (намерения), механизма для для перехода от MainActivity к SelectCategoryActivity.
            Intent intent = new Intent(this, SelectCategoryActivity.class);

            // Запуск SelectCategoryActivity.
            startActivity(intent);
        });
    }
}
