// класс для вывода всех категорий еды 

package com.mygy.smartrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Адаптер для RecyclerView, предназначенный для отображения категорий в виде списка
public class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoriesRecyclerAdapter.ViewHolder> {
    private final LayoutInflater inflater; // Инфлейтер для создания View из XML-макета
// LayoutInflater — это класс, который используется для инфлейта, или "раздувания", XML-макетов. Он берет XML-файл макета и создает из него соответствующие объекты View. 
    private final List<Category> categories; // Список объектов категорий для отображения

    // Конструктор адаптера
    public CategoriesRecyclerAdapter(Context context, List<Category> categories) {
        this.categories = categories;
        this.inflater = LayoutInflater.from(context);
    }

    // Создание новых View (вызывается layout manager'ом)
    @Override
    public CategoriesRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Создание нового view
        View view = inflater.inflate(R.layout.category_button_item, parent, false);
        return new ViewHolder(view);
    }

    // Замена содержимого view (вызывается layout manager'ом)
    @Override
    public void onBindViewHolder(CategoriesRecyclerAdapter.ViewHolder holder, int position) {
        // Получение элемента из списка категорий в данной позиции
        Category category = categories.get(position);

        // Назначение ресурса изображения и обработчика нажатия кнопки
        holder.btn.setImageResource(category.getBtnImageRes());
        holder.btn.setOnClickListener(v -> {
            // Создание и старт активности при нажатии на кнопку
            Intent intent = new Intent(inflater.getContext(), IngridientsSelectorActivity.class);
            IngridientsSelectorActivity.category = category; // Передача данных в следующую активность
            inflater.getContext().startActivity(intent);
        });
    }

    // Возвращает размер списка категорий
    @Override
    public int getItemCount() {
        return categories.size();
    }

    // Внутренний класс для хранения данных View
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView btn; // View для отображения кнопки категории

        ViewHolder(View view){
            super(view);
            btn = view.findViewById(R.id.category_btn); // Привязка view к переменной
        }
    }
}
