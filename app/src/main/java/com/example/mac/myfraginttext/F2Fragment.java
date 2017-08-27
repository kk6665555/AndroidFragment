package com.example.mac.myfraginttext;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F2Fragment extends Fragment {
    private View view;
    private TextView f2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(view==null) {
            view = inflater.inflate(R.layout.fragment_f2, container, false);
            f2 = (TextView) view.findViewById(R.id.f2);
        }
        return view;
    }
    public TextView getF2mesg(){
        return f2;
    }
}
