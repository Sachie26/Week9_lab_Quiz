package com.example.pet;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText passwordEditText;
    private EditText dateEditText;
    private AutoCompleteTextView petCategoryAutoCompleteTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordEditText = findViewById(R.id.passwordEditText);
        passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        dateEditText = findViewById(R.id.dateEditText);
        dateEditText.setInputType(InputType.TYPE_CLASS_DATETIME | InputType.TYPE_DATETIME_VARIATION_DATE);

        petCategoryAutoCompleteTextView = findViewById(R.id.petCategoryAutoCompleteTextView);
        String[] petCategories = {"Dog", "Sheep", "Cat", "Snake", "Bird"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, petCategories);
        petCategoryAutoCompleteTextView.setAdapter(adapter);
    }
}