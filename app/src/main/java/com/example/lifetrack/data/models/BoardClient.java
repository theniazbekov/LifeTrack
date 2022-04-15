package com.example.lifetrack.data.models;

import com.example.lifetrack.R;

import java.util.ArrayList;

public class BoardClient {

    public static ArrayList<OnBoardModel> getList() {
        ArrayList<OnBoardModel> list = new ArrayList<>();
        list.add(new OnBoardModel(R.raw.time_onboard, "Экономь время", "Дальше"));
        list.add(new OnBoardModel(R.raw.goal_onboard, "Достигай целей", "Дальше"));
        list.add(new OnBoardModel(R.raw.task_onboard, "Развивайся", "Начинаем"));
        return list;
    }


}
