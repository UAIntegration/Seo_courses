package com.example.mystart;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class MyFragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3,  container, false);
        TextView mytext_01 = (TextView) view.findViewById(R.id.text_01t);
        mytext_01.setText(Html.fromHtml(getString(R.string.text_05)));
        ImageView tabl_01 = (ImageView) view.findViewById(R.id.imageindeks);
        tabl_01.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8ee2));
        ImageView tabl_02 = (ImageView) view.findViewById(R.id.imageindeks2);
        tabl_02.setImageDrawable(getResources().getDrawable(R.drawable.k_0b8ff2));
        TextView mytext_02 = (TextView) view.findViewById(R.id.text_02t);
        mytext_02.setText(Html.fromHtml(getString(R.string.text_06)));
        ImageView tabl_03 = (ImageView) view.findViewById(R.id.imagerelreq);
        tabl_03.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8ff2));
        ImageView tabl_04 = (ImageView) view.findViewById(R.id.imagerelreq2);
        tabl_04.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8jj2));
        TextView mytext_03 = (TextView) view.findViewById(R.id.text_03t);
        mytext_03.setText(Html.fromHtml(getString(R.string.text_07)));
        ImageView tabl_05 = (ImageView) view.findViewById(R.id.imagerelreq3);
        tabl_05.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8kk2));
        TextView mytext_04 = (TextView) view.findViewById(R.id.text_04t);
        mytext_04.setText(Html.fromHtml(getString(R.string.text_08)));
        ImageView tabl_06 = (ImageView) view.findViewById(R.id.imagerelreq4);
        tabl_06.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8ll2));
        TextView mytext_05 = (TextView) view.findViewById(R.id.text_05t);
        mytext_05.setText(Html.fromHtml(getString(R.string.text_09)));
        ImageView tabl_07 = (ImageView) view.findViewById(R.id.imagerelreq5);
        tabl_07.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8mm2));
        TextView mytext_06 = (TextView) view.findViewById(R.id.text_06t);
        mytext_06.setText(Html.fromHtml(getString(R.string.text_10)));
        return view;
    }
}