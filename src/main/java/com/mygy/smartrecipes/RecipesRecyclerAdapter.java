//адаптер чтобы выводить список рецептов

package com.mygy.smartrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Определение класса SelectCategoryActivity, который наследуется от AppCompatActivity.
// AppCompatActivity является базовым классом для активностей, который поддерживает функции совместимости на разных версиях Android.
public class SelectCategoryActivity extends AppCompatActivity {

    // Это общий список категорий, который используется в этой активности.
    public static ArrayList<Category> categories = new ArrayList<>();

    // Метод onCreate вызывается при создании активности.
    // Bundle savedInstanceState содержит состояние активности, если она была пересоздана (например, при изменении конфигурации).
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Установка пользовательского интерфейса для активности из XML-файла разметки.
        setContentView(R.layout.activity_select_category);

        // Вызов пользовательского метода для инициализации данных. 
        initializeData();

        // Поиск RecyclerView по идентификатору в разметке.
        // RecyclerView используется для отображения списка данных (в данном случае категорий) в виде прокручиваемого списка.
        RecyclerView recycler = findViewById(R.id.selectCategory_recycler);

        // Создание адаптера для RecyclerView. Адаптер отвечает за привязку данных к представлениям.
        // CategoriesRecyclerAdapter - это пользовательский адаптер, который принимает контекст и список категорий.
        CategoriesRecyclerAdapter adapter = new CategoriesRecyclerAdapter(this, categories);

        // Установка адаптера для RecyclerView. Это связывает данные списка категорий с RecyclerView (компонент пользо-го интерфейса).
        recycler.setAdapter(adapter);
    }

      private void initializeData() {
    }
}

