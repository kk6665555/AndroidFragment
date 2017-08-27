package com.example.mac.myfraginttext;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F1Fragment extends Fragment {
    private TextView mesg;
    private View mainview;
    private MainActivity mainActivity;
    private TextView mainTitle;

    public F1Fragment(){
        Log.i("test","F1Fragment()");
    }

    public static F1Fragment newInstance() {
        F1Fragment f1Fragment = new F1Fragment();

        return f1Fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            Log.i("test","F1Fragment:onCreate()");
        mainActivity = (MainActivity) getActivity();
        mainTitle = mainActivity.getMainTitle();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("test","F1Fragment:onCreateView()");
        if(mainview==null) {
            mainview = inflater.inflate(R.layout.fragment_f1, container, false);
            mesg = (TextView) mainview.findViewById(R.id.f1);
            mesg.setText("Hello f1");
            final View f1test1 = mainview.findViewById(R.id.f1test1);

            f1test1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1test1();
                }
            });
            View f1test2 = mainview.findViewById(R.id.f1test2);
            f1test2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1test2();
                }
            });
            View f1test3 = mainview.findViewById(R.id.f1test3);
            f1test2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1test3();
                }
            });
        }

        return mainview;
    }

    public void f1test1(){
        mesg.setText("" + (int)(Math.random()*40+1));
    }
    public void f1test2(){
        mainTitle.setText("Title Changed");
    }
    public void f1test3(){
        TextView f2mesg = mainActivity.getF2().getF2mesg();
        if (f2mesg != null){
            f2mesg.setText("Change by F1");
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("test","F1Fragment:onAttach()");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("test","F1Fragment:onDetach()");
    }

}
