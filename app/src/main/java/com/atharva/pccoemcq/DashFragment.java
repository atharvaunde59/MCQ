package com.atharva.pccoemcq;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashFragment extends Fragment {





        public DashFragment() {
            // Required empty public constructor
        }


        @Override

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View root = inflater.inflate(R.layout.fragment_dash, container, false);

            ImageButton imagebutton = (ImageButton) root.findViewById(R.id.imageButtonm2);
            imagebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(),M2MainActivity.class);
                    startActivity(intent);


                }
            });

            return root;
        }
    }