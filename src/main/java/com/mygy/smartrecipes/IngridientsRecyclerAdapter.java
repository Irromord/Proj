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

/**
 * Адаптер для RecyclerView, который управляет отображением списка ингредиентов.
 * Этот класс наследуется от RecyclerView.Adapter и предоставляет необходимую
 * связь между данными и представлением элементов в RecyclerView.
 */
public class IngridientsRecyclerAdapter extends RecyclerView.Adapter<IngridientsRecyclerAdapter.ViewHolder> {

    // Переменная для инфлейтинга (создания) View из XML-макета
    private final LayoutInflater inflater;

    // Список объектов Ingridient, который содержит данные, отображаемые в RecyclerView
    private final List<Ingridient> ingridients;

    /**
     * Конструктор адаптера.
     * @param context Контекст, используемый для инфлейтинга макетов.
     * @param ingridients Список данных, которые необходимо отобразить в RecyclerView.
     */
    public IngridientsRecyclerAdapter(Context context, List<Ingridient> ingridients) {
        this.ingridients = ingridients;
        this.inflater = LayoutInflater.from(context);
    }

    /**
     * Создает новые View-элементы для каждого элемента в RecyclerView.
     * @param parent ViewGroup, в который будет добавлен новый View.
     * @param viewType Тип представления элемента.
     * @return ViewHolder с созданным View.
     */
    @Override
    public IngridientsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ingridient_item, parent, false);
        return new IngridientsRecyclerAdapter.ViewHolder(view);
    }

    /**
     * Привязывает данные к View-элементам.
     * @param holder ViewHolder, содержащий View-элементы.
     * @param position Позиция элемента в RecyclerView.
     */
    @Override
    public void onBindViewHolder(IngridientsRecyclerAdapter.ViewHolder holder, int position) {
        Ingridient ingridient = ingridients.get(position); // Получение ингредиента по позиции

        // Назначение текста кнопке и обработка событий нажатия на кнопку
        holder.btn.setText(ingridient.getName());
        holder.btn.setOnClickListener(v -> {
            // Обработка выбора/снятия выбора ингредиента
            if(Ingridient.selectedIngridient.contains(ingridient)){
                holder.selectIco.setVisibility(View.INVISIBLE);
                Ingridient.selectedIngridient.remove(ingridient);
            }else{
                holder.selectIco.setVisibility(View.VISIBLE);
                Ingridient.selectedIngridient.add(ingridient);
            }
        });
    }

    /**
     * Возвращает количество элементов в списке ингредиентов.
     * @return Размер списка ingridients.
     */
    @Override
    public int getItemCount() {
        return ingridients.size();
    }

    /**
     * Внутренний класс ViewHolder для управления View-элементами в каждом элементе списка RecyclerView.
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // TextView для отображения названия ингредиента и ImageView для отображения иконки выбора
        final TextView btn;
        final ImageView selectIco;

        // Конструктор ViewHolder
        ViewHolder(View view){
            super(view);
            btn = view.findViewById(R.id.ingridient_btn);
            selectIco = view.findViewById(R.id.ingridient_selectIco);
        }
    }
}


