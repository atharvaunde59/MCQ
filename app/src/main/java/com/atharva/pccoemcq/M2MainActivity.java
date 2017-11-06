package com.atharva.pccoemcq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.atharva.pccoemcq.MyServerData;
import com.atharva.pccoemcq.QuizActivity;
import com.atharva.pccoemcq.R;

public class M2MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m2main_activity_menu);
        Button btnGrile = (Button)findViewById(R.id.btnGrile);
        btnGrile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Quiz = new Intent(getApplicationContext(), QuizActivity.class);
                MyServerData.getInstance().setTestState("inProgress");
                startActivity(Quiz);
            }
        });
    }
}
