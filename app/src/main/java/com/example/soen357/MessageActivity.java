package com.example.soen357;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.soen357.databinding.ActivityMessageBinding;

import java.util.ArrayList;
import java.util.List;


public class MessageActivity extends AppCompatActivity {

    private MessageAdapter adapter;
    private List<String> items = new ArrayList<>();
    ActivityMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        items.add("Ned Stark");
        items.add("Jaime Lannister");
        items.add("Bran Stark");
        items.add("John Snow");

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MessageAdapter(this,items);
        binding.recyclerView.setAdapter(adapter);

        binding.searchEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }


    private void filter(String query) {
        List<String> filteredList = new ArrayList<>();
        for (String item : items) {
            if (item.toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }
}