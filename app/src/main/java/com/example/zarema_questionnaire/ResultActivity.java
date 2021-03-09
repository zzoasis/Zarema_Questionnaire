package com.example.zarema_questionnaire;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textViewResultData = findViewById(R.id.textViewResultData);

        textViewResultData.append(String.format("Имя: %s\nПол: %s\nОбразование: %s\n  Семейное положение: %s\nСтрана: %s",
                getIntent().getStringExtra("fio"), getIntent().getStringExtra("gender"),
                getIntent().getStringExtra("education"),
                getIntent().getStringExtra("family"),
                getIntent().getStringExtra("country")));
    }

    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }

    public void onExit(View v) {
        finishAffinity();
    }
}
