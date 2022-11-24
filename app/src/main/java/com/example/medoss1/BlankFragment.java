package com.example.medoss1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    private EditText txtNom;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, true);

        txtNom = (EditText) rootView.findViewById(R.id.txtNom);


        return rootView;

    }

    private  View.OnClickListener btnConnectListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG", txtNom);

        }

    //}


    };
}