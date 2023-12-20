// Адаптер для вывода ингредиентов при их выборе

package com.mygy.smartrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

// Адаптер для списка ингредиентов в RecyclerView
public class IngridientsRecyclerAdapter extends RecyclerView.Adapter<IngridientsRecyclerAdapter.ViewHolder> {

    // Для создания новых View элементов
    private final LayoutInflater inflater;

    // Список ингредиентов для отображения
    private final List<Ingridient> ingridients;

    // Конструктор: принимает контекст и список ингредиентов
    public IngridientsRecyclerAdapter(Context context, List<Ingridient> ingridients) {
        this.ingridients = ingridients;
        this.inflater = LayoutInflater.from(context);
    }

    // Создает и возвращает ViewHolder для каждого элемента в списке
    @Override
    public IngridientsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ingridient_item, parent, false);
        return new IngridientsRecyclerAdapter.ViewHolder(view);
    }

    // Заполняет ViewHolder данными ингредиента
    @Override
    public void onBindViewHolder(IngridientsRecyclerAdapter.ViewHolder holder, int position) {
        Ingridient ingridient = ingridients.get(position);
        holder.btn.setText(ingridient.getName());
        holder.btn.setOnClickListener(v -> {
            // Меняет видимость иконки и обновляет список выбранных ингредиентов
            if(Ingridient.selectedIngridient.contains(ingridient)){
                holder.selectIco.setVisibility(View.INVISIBLE);
                Ingridient.selectedIngridient.remove(ingridient);
            } else {
                holder.selectIco.setVisibility(View.VISIBLE);
                Ingridient.selectedIngridient.add(ingridient);
            }
        });
    }

    // Возвращает количество ингредиентов в списке
    @Override
    public int getItemCount() {
        return ingridients.size();
    }

    // Внутренний класс для хранения элементов интерфейса каждого элемента в списке
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView btn; // Кнопка для названия ингредиента
        final ImageView selectIco; // Иконка для выбора ингредиента

        // Конструктор для инициализации элементов интерфейса
        ViewHolder(View view){
            super(view);
            btn = view.findViewById(R.id.ingridient_btn);
            selectIco = view.findViewById(R.id.ingridient_selectIco);
        }
    }
}


