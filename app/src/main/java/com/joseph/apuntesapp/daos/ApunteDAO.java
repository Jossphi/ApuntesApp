package com.joseph.apuntesapp.daos;

import com.joseph.apuntesapp.models.Apunte;

import java.util.ArrayList;

/**
 * Created by josep on 05/04/2018.
 */

public class ApunteDAO {
    public static ArrayList<Apunte>all = new ArrayList<>();
    public static void save(Apunte apunte){
        all.add(apunte);
    }
}
