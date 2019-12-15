package com.example.a08_listadaptertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/*
* ArrayAdapter<Person> 을 상속 받아
* Alt + Insert => Constructor를 선택 => 아래 구문 자동 생성 => 생성자의 3번 파라메터 List<Person> => ArrayList<Person>으로 변경
* why? ==> MainActivity 에서 PersonListAdapter을 호출하기 위해 사용한 것이 ArrayList<T> 형의 데이터형임.
* */

public class PersonListAdapter extends ArrayAdapter<Person> {

    private Context mContext;
    int mResource;

    /*
    * PersonListAdapter의 기본 생성자
    * @param context
    * @param resource
    * @param objects
    * */
    public PersonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    /*
     *  Alt + Insert => Override Methods => getView
    * */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the persons information
        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        // Create the person object with the information
        Person person = new Person(name, birthday, sex);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvBirthday = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvSex = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);

        return convertView;
    }

}
