package com.example.mystart;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MyFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,  container, false);
        TextView mytext_01 = (TextView) view.findViewById(R.id.text_01t);
        mytext_01.setText(Html.fromHtml(getString(R.string.text_04)));
        ImageView tabl_01 = (ImageView) view.findViewById(R.id.imagekachzapr);
        tabl_01.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8cc2));
        ImageView tabl_02 = (ImageView) view.findViewById(R.id.imagekachzapr2);
        tabl_02.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8dd2));
        return view;
    }
}