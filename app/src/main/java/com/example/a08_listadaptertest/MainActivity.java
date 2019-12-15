package com.example.a08_listadaptertest;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView)findViewById(R.id.listView);

        // 데이터 준비
        Person ghchoe = new Person("gyeonghu", "1977-12-12", "Male");
        Person jkpark = new Person("jungki", "1977-04-21", "Male");
        Person hjryu = new Person("hyungje", "1977-05-05", "Male");
        Person wdjung = new Person("wondo", "1977-01-25", "Male");
        Person dshwang = new Person("doseong", "1977-10-13", "Male");
        Person jhlee = new Person("jaehun", "1977-07-11", "Male");
        Person ghchoe2 = new Person("gyeonghu2", "1977-12-12", "Male");
        Person ghchoe3 = new Person("gyeonghu3", "1977-12-12", "Male");
        Person ghchoe4 = new Person("gyeonghu4", "1977-12-12", "Male");
        Person ghchoe5 = new Person("gyeonghu5", "1977-12-12", "Male");
        Person ghchoe6 = new Person("gyeonghu6", "1977-12-12", "Male");
        Person ghchoe7 = new Person("gyeonghu7", "1977-12-12", "Male");
        Person ghchoe8 = new Person("gyeonghu8", "1977-12-12", "Male");
        Person ghchoe9 = new Person("gyeonghu9", "1977-12-12", "Male");
        Person ghchoe10 = new Person("gyeonghu10", "1977-12-12", "Male");
        Person ghchoe11 = new Person("gyeonghu11", "1977-12-12", "Male");
        Person ghchoe12 = new Person("gyeonghu12", "1977-12-12", "Male");
        Person ghchoe13 = new Person("gyeonghu13", "1977-12-12", "Male");

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(ghchoe);
        list.add(jkpark);
        list.add(hjryu);
        list.add(wdjung);
        list.add(dshwang);
        list.add(jhlee);
        list.add(ghchoe2);
        list.add(ghchoe3);
        list.add(ghchoe4);
        list.add(ghchoe5);
        list.add(ghchoe6);
        list.add(ghchoe7);
        list.add(ghchoe8);
        list.add(ghchoe9);
        list.add(ghchoe10);
        list.add(ghchoe11);
        list.add(ghchoe12);
        list.add(ghchoe13);

        // Adapter 선언 및 정의
        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, list);
        mListView.setAdapter(adapter);
    }
}
