// страница, где мы выбираем категорию

package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class SelectCategoryActivity extends AppCompatActivity {

    public static ArrayList<Category> categories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);

        initializeData();

        RecyclerView recycler = findViewById(R.id.selectCategory_recycler);
        CategoriesRecyclerAdapter adapter = new CategoriesRecyclerAdapter(this, categories);
        recycler.setAdapter(adapter);
    }

    private void initializeData(){  // функция, в которой мы создаем каждую категорию
        Category c1 = new Category("Завтраки",R.drawable.knopka_1); // указываем имя и кнопку категории
        //ингридиенты добавляются в массив
        HashMap<Ingridient,String> c1hm = new HashMap<>();
        c1hm.put(Store.eggs,"1 шт.");
        c1hm.put(Store.sugar,"30 г.");
        c1hm.put(Store.salt,"½ чайные ложки");
        c1hm.put(Store.milk,"250 мл");
        c1hm.put(Store.wheat_flour,"120 г.");
        c1hm.put(Store.soda,"½ чайные ложки");
        c1hm.put(Store.vegetable_oil,"2 ст. ложки");
        c1.addReciepe(new Reciepe("Панкейки классические американские","",R.drawable.b1,R.drawable.s13 //и добавляются в список
                ,c1hm,"1. Яйца, сахар и соль взбить до пены.\n" +
                "2. Влить половину молока, взбить, постепенно всыпать половину муки, чтобы не было комков. Влить оставшееся молоко и так же постепенно досыпать муку.\n" +
                "3. Погасить соду, добавить в тесто, вылить масло. Еще раз хорошо все взбить. Дать тесту постоять, погреть сковороду.\n" +
                "4. Смазать сковороду маленьким количеством масла только для первого блинчика.\n" +
                "5. Жарить на среднем огне. Как начнут лопаться пузырики, перевернуть. Еще несколько секунд и снять.\n"));

        HashMap<Ingridient,String> c1hm2 = new HashMap<>();
        c1hm2.put(Store.tvorog,"500 г.");
        c1hm2.put(Store.sugar,"100 г.");
        c1hm2.put(Store.eggs,"1 шт.");
        c1hm2.put(Store.wheat_flour,"150 г.");
        c1hm2.put(Store.vanilin,"1 г.");
        c1hm2.put(Store.vegetable_oil,"50 мл");
        c1hm2.put(Store.smetana,"по вкусу");
        c1.addReciepe(new Reciepe("Сырники","",R.drawable.b3,R.drawable.s11
                ,c1hm2,"1. Подготовить все ингредиенты. Творог нужно брать обязательно сухой и рассыпчатый, из мягкого не получится. Чем выше процент жирности, тем вкуснее будут сырники.\n" +
                "2. Размять творог вилкой. Смешать с яйцом, сахаром и ванилином. Затем добавить 90 г муки и перемешать.\n" +
                "3. Сырная масса не должна быть ни слишком сухой, ни слишком влажной. Смоченными в воде руками взять немного массы и скатать из нее шарик, затем сдавить шарик ладонями и придать сырнику плоскую форму. Обвалять сформованные сырники в муке.\n" +
                "4. На сковороде разогреть масло и на среднем огне обжарить сырники сначала с одной стороны до золотистой корочки. Затем перевернуть и так же обжарить до золотистой корочки.\n" +
                "5. Готовые сырники выложить на бумажные полотенца, чтобы избавиться от лишнего жира. Подавать со сметаной.\n"));

        HashMap<Ingridient,String> c1hm3 = new HashMap<>();
        c1hm3.put(Store.wheat_flour,"500 г.");
        c1hm3.put(Store.drozzi,"25 г.");
        c1hm3.put(Store.milk,"500 мл.");
        c1hm3.put(Store.eggs,"2 шт.");
        c1hm3.put(Store.sugar,"25 г.");
        c1hm3.put(Store.vegetable_oil,"60 мл");
        c1hm3.put(Store.salt,"½ чайные ложки");
        c1.addReciepe(new Reciepe("Оладьи","",R.drawable.b4,R.drawable.s15
                ,c1hm3,"1. Смешать теплое молоко, сахар и дрожжи, оставить на 5–10 минут, пока на поверхности не появятся пузырьки.\n" +
                "2. Смешать опару с мукой при помощи миксера, накрыть чашу с тестом пленкой и поставить в теплое место на 40 минут, чтобы тесто поднялось.\n" +
                "3. К расставшемуся тесту добавить яйца, соль и столовую ложку масла, снова вымесить. Накрыть чашу пленкой и убрать в теплое место еще на 30 минут.\n" +
                "4. На сковороде разогреть масло. Не размешивая тесто, захватить часть его смоченной в воде ложкой, выложить на сковородку. Обжаривать оладьи с обеих сторон.\n"));

        HashMap<Ingridient,String> c1hm4 = new HashMap<>();
        c1hm4.put(Store.wheat_flour,"600 г.");
        c1hm4.put(Store.slivochnoe_maslo,"70 г.");
        c1hm4.put(Store.milk,"1 л.");
        c1hm4.put(Store.sugar,"3 ст. ложки");
        c1hm4.put(Store.vegetable_oil,"4 столовые ложки");
        c1hm4.put(Store.salt,"½ чайные ложки");
        c1hm4.put(Store.soda,"½ чайные ложки");
        c1.addReciepe(new Reciepe("Блинчики без яиц","",R.drawable.b5,R.drawable.s16
                ,c1hm4,"1. Смешать муку, сахар, соль, соду и добавить 0,5 л молока. Хорошо размешать, чтобы не было комочков. Тесто должно быть по консистенции как густая сметана.\n" +
                "2. Оставшееся молоко довести до кипения и потихоньку, размешивая, влить в тесто.\n" +
                "3. Сливочное масло растопить на сковороде, на которой вы будете печь блины.\n" +
                "4. Добавить его к тесту и перемешать.\n" +
                "5. Добавить в тесто растительное масло и еще раз перемешать.\n" +
                "6. Влить немного теста на сковородку и распределить его по всей поверхности. Жарить 1–2 минуты. \n" +
                "7. Поддеть чем-нибудь и перевернуть его на другую сторону. Выпекать еще около минуты. Перед следующей порцией теста сковороду смазывать маслом не нужно.\n" +
                "8. Готовые блины без яиц складывать стопочкой. Их тоже не обязательно смазывать маслом, так как в тесте его содержится достаточно. \n"));

        HashMap<Ingridient,String> c1hm5 = new HashMap<>();
        c1hm5.put(Store.eggs,"8 шт.");
        c1hm5.put(Store.onion_porey,"2 шт.");
        c1hm5.put(Store.olive_oil,"50 мл.");
        c1hm5.put(Store.cheese_parmezan,"50 г.");
        c1hm5.put(Store.salt,"по вкусу");
        c1hm5.put(Store.molotiy_perec,"по вкусу");
        c1.addReciepe(new Reciepe("Фриттата","",R.drawable.b6,R.drawable.s17
                ,c1hm5,"1. На сковороде разогреть оливковое масло, нарезанный полукольцами порей, перемешать, накрыть крышкой и готовить на небольшом огне 3–5 минут, до мягкости.\n" +
                "2. Взбить яйца с солью, перцем и пармезаном при помощи венчика.\n" +
                "3. Залить яйца в сковороду с луком, слегка размешать и накрыть крышкой. Жарить на слабом огне 10–15 минут, пока низ яичницы не покроется золотистой корочкой. Готовую фриттату перевернуть вверх дном на большую тарелку.\n"));

        HashMap<Ingridient,String> c1hm6 = new HashMap<>();
        c1hm6.put(Store.ovsyanka,"225 г.");
        c1hm6.put(Store.milk,"450 мл.");
        c1hm6.put(Store.slivochnoe_maslo,"40 г.");
        c1hm6.put(Store.sugar,"35 г.");
        c1hm6.put(Store.salt,"по вкусу");
        c1hm6.put(Store.slivki35,"50 мл.");
        c1.addReciepe(new Reciepe("Овсянка","",R.drawable.b7,R.drawable.s18
                ,c1hm6,"1. Накануне залить овсяную крупу водой и оставить на ночь, оптимально на 12 часов.\n" +
                "2. На следующее утро слить воду, переложить крупу в кастрюлю, залить молоком и добавить сливочное масло. Довести до кипения и варить на небольшом огне 20–25 минут, периодически помешивая, пока крупа не станет мягкой.\n" +
                "3. Снять кашу с огня, добавить сливки, сахар и соль по вкусу. Овсянку можно подать с сиропом, медом, сухофруктами, впрочем, она хороша и без добавок.\n"));

        HashMap<Ingridient,String> c1hm7 = new HashMap<>();
        c1hm7.put(Store.bread_toast,"4 куска");
        c1hm7.put(Store.cheese,"100 г.");
        c1hm7.put(Store.varenaya_vetchina,"80 г.");
        c1hm7.put(Store.slivochnoe_maslo,"50 г.");
        c1.addReciepe(new Reciepe("Крок-месье","",R.drawable.b8,R.drawable.s19
                ,c1hm7,"1. Все кусочки хлеба намазать тонким слоем размягченного сливочного масла. На половину хлеба выложить тонкие ломтики ветчины, сверху ломтики сыра, накрыть бутерброды хлебом.\n" +
                "2. На сковороде растопить столовую ложку сливочного масла на среднем огне, обжарить бутерброды с обеих сторон до золотистой корочки.\n" +
                "3. Обжаренные бутерброды посыпать тертым сыром и поставить в духовку, разогретую до 240 градусов, на 3–5 минут.\n"));

        HashMap<Ingridient,String> c1hm8 = new HashMap<>();
        c1hm8.put(Store.milk,"200 мл.");
        c1hm8.put(Store.eggs,"1 шт.");
        c1hm8.put(Store.slivochnoe_maslo,"60 г.");
        c1hm8.put(Store.vanilniy_ecstract,"1 чайная ложка");
        c1hm8.put(Store.wheat_flour,"180 г.");
        c1hm8.put(Store.brown_sugar,"40 г.");
        c1hm8.put(Store.razrihritel,"1 чайная ложка");
        c1hm8.put(Store.salt,"½ чайные ложки");
        c1hm8.put(Store.banana,"2 шт.");
        c1.addReciepe(new Reciepe("Банановые оладьи","",R.drawable.b9,R.drawable.s20
                ,c1hm8,"1. Растопить сливочное масло. Смешать масло с молоком, яйцом и ванильным экстрактом.\n" +
                "2. В отдельной чаше смешать муку, сахар, разрыхлитель и соль.\n" +
                "3. Отдельно размять вилкой бананы до состояния пюре.\n" +
                "4. Соединить банановое пюре с сухой и влажной смесями. Перемешать до однородного теста.\n" +
                "5. Разогреть сковородку с антипригарным покрытием. Вылить часть теста на сковороду и жарить 2–3 минуты, пока на поверхности теста не появятся пузырьки.\n" +
                "6. Перевернуть оладушек на другую сторону и жарить еще 1–2 минуты. С оставшимся тестом поступить так же.\n"));



        Category c2 = new Category("Салаты",R.drawable.knopka_2);

        Category c3 = new Category("Супы",R.drawable.knopka_3);

        HashMap<Ingridient,String> c3hm = new HashMap<>();
        c3hm.put(Store.eggs,"6 шт");
        c3hm.put(Store.onion,"1 головка");
        c3hm.put(Store.garlic,"3 зубчика");
        c3hm.put(Store.red_bell_pepper,"1 шт.");
        c3hm.put(Store.wheat_flour,"120 г.");
        c3hm.put(Store.tomato,"500 г.");
        c3hm.put(Store.ground_cumin,"1 чайная ложка");
        c3hm.put(Store.sweet_paprika,"1 чайная ложка");
        c3hm.put(Store.cheese_feta,"150 г.");
        c3hm.put(Store.olive_oil,"50 мл.");
        c3hm.put(Store.parsley,"10 г.");
        c3hm.put(Store.salt,"по вкусу");
        c3hm.put(Store.molotiy_perec,"по вкусу");
        c3.addReciepe(new Reciepe("Шакшука","",R.drawable.b2,R.drawable.s14
                ,c3hm,"1. На оливковом масле обжарить измельченный лук до мягкости, добавить измельченный чеснок и нарезанные небольшими кубиками сладкий перец и чили, готовить, помешивая, еще пару минут.\n" +
                "2. Добавить нарезанные небольшими кубиками помидоры, приправить солью, перцем, зирой и паприкой, готовить еще 10–12 минут, пока овощи не станут мягкими.\n" +
                "3. Добавить к овощам нарезанную небольшими кубиками фету, перемешать, разбить в овощи яйца так, чтобы желток остался целым. Отправить сковороду в духовку, разогретую до 180 градусов, на 7–10 минут. Готовую шакшуку посыпать свежей петрушкой и подавать.\n"));

        Category c4 = new Category("Основные блюда",R.drawable.knopka_4);

        HashMap<Ingridient,String> c4hm = new HashMap<>();
        c4hm.put(Store.eggs,"1 шт.");
        c4hm.put(Store.water,"125 мл.");
        c4hm.put(Store.milk,"125 мл.");
        c4hm.put(Store.wheat_flour,"450 г.");
        c4hm.put(Store.vegetable_oil,"600 мл.");
        c4hm.put(Store.sugar,"50 г.");
        c4hm.put(Store.tvorog,"40 г.");
        c4hm.put(Store.slivochnoe_maslo,"по вкусу");
        c4hm.put(Store.salt,"по вкусу");
        c4hm.put(Store.smetana,"по вкусу");
        c4.addReciepe(new Reciepe("Вареники с творогом","",R.drawable.b10,R.drawable.s12
                ,c4hm,"1. Взбить яйцо с водой, молоком и чайной ложкой соли, добавить просеянную муку и замесить тесто. Это можно сделать с помощью миксера, а затем домесить тесто руками. Вылить на стол 20 мл растительного масла и вмесить его в тесто, от масла тесто станет более эластичным. Обернуть тесто пищевой пленкой и убрать в холодильник на 20–30 минут.\n" +
                "2. Творог смешать с сахаром и щепоткой соли.\n" +
                "3. Раскатать часть теста, вырезать круги с помощью специальной вырубки или обычного стакана. Положить на тесто ложку начинки и плотно слепить края теста, стараясь не оставлять внутри вареников воздух. Готовые вареники складывать на подпыленную мукой поверхность.\n" +
                "4. В большой кастрюле вскипятить воду, добавить немного соли и бросить в нее вареники, дождаться, когда они всплывут, после чего поварить их еще 5 минут. Готовые вареники положить в большую чашу со сливочным маслом. Подавать со сметаной.\n"));


        Category c5 = new Category("Десерты",R.drawable.knopka_5);
        c5.addReciepe(new Reciepe("Блинчики без яиц","",R.drawable.b5,R.drawable.s16
                ,c1hm4,"1. Смешать муку, сахар, соль, соду и добавить 0,5 л молока. Хорошо размешать, чтобы не было комочков. Тесто должно быть по консистенции как густая сметана.\n" +
                "2. Оставшееся молоко довести до кипения и потихоньку, размешивая, влить в тесто.\n" +
                "3. Сливочное масло растопить на сковороде, на которой вы будете печь блины.\n" +
                "4. Добавить его к тесту и перемешать.\n" +
                "5. Добавить в тесто растительное масло и еще раз перемешать.\n" +
                "6. Влить немного теста на сковородку и распределить его по всей поверхности. Жарить 1–2 минуты. \n" +
                "7. Поддеть чем-нибудь и перевернуть его на другую сторону. Выпекать еще около минуты. Перед следующей порцией теста сковороду смазывать маслом не нужно.\n" +
                "8. Готовые блины без яиц складывать стопочкой. Их тоже не обязательно смазывать маслом, так как в тесте его содержится достаточно. \n"));
        c5.addReciepe(new Reciepe("Панкейки классические американские","",R.drawable.b1,R.drawable.s13
                ,c1hm,"1. Яйца, сахар и соль взбить до пены.\n" +
                "2. Влить половину молока, взбить, постепенно всыпать половину муки, чтобы не было комков. Влить оставшееся молоко и так же постепенно досыпать муку.\n" +
                "3. Погасить соду, добавить в тесто, вылить масло. Еще раз хорошо все взбить. Дать тесту постоять, погреть сковороду.\n" +
                "4. Смазать сковороду маленьким количеством масла только для первого блинчика.\n" +
                "5. Жарить на среднем огне. Как начнут лопаться пузырики, перевернуть. Еще несколько секунд и снять.\n"));

        c5.addReciepe(new Reciepe("Банановые оладьи","",R.drawable.b9,R.drawable.s15
                ,c1hm8,"1. Растопить сливочное масло. Смешать масло с молоком, яйцом и ванильным экстрактом.\n" +
                "2. В отдельной чаше смешать муку, сахар, разрыхлитель и соль.\n" +
                "3. Отдельно размять вилкой бананы до состояния пюре.\n" +
                "4. Соединить банановое пюре с сухой и влажной смесями. Перемешать до однородного теста.\n" +
                "5. Разогреть сковородку с антипригарным покрытием. Вылить часть теста на сковороду и жарить 2–3 минуты, пока на поверхности теста не появятся пузырьки.\n" +
                "6. Перевернуть оладушек на другую сторону и жарить еще 1–2 минуты. С оставшимся тестом поступить так же.\n"));


        Category c6 = new Category("Напитки",R.drawable.knopka_6);

        categories.add(c1);
        categories.add(c2);
        categories.add(c3);
        categories.add(c4);
        categories.add(c5);
        categories.add(c6);
    }
}
