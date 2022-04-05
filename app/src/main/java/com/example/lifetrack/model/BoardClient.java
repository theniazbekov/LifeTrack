package com.example.lifetrack.model;

import com.example.lifetrack.R;

import java.util.ArrayList;

public class BoardClient {
    public  static ArrayList<BoardModel> list = new ArrayList<>();

    public static ArrayList<BoardModel> getList() {
        list.add(new BoardModel(R.drawable.econome, "Экономь время","Дальше"));
        list.add(new BoardModel(R.drawable.sel, "Достигай целей","Дальше"));
        list.add(new BoardModel(R.drawable.rost, "Развивайся","Начинаем"));
        return list;
    }


}
