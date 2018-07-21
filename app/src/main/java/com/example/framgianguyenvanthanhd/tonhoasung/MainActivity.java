package com.example.framgianguyenvanthanhd.tonhoasung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<Item> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.rc_list_items);
        mItems = new ArrayList<>();
        mItems.add(new Item(1,"thanh",6263,"yes","125.36","122524445"));
        mItems.add(new Item(2,"asdhasjd",2377,"yes","125.36","99834"));
        mItems.add(new Item(3,"jahfjahsj",5,"no","125.36","44451237"));
        mItems.add(new Item(3,"jahfjahsj",5,"no","125.36","44451237"));
        mItems.add(new Item(3,"jahfjahsj",5,"no","125.36","44451237"));
        mItems.add(new Item(3,"jahfjahsj",5,"no","125.36","44451237"));
        mItems.add(new Item(3,"jahfjahsj",5,"no","125.36","44451237"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter itemAdapter = new ItemAdapter(mItems);
        mRecyclerView.setAdapter(itemAdapter);
    }
}
