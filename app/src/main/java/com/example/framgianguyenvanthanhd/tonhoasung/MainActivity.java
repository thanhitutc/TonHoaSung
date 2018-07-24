package com.example.framgianguyenvanthanhd.tonhoasung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<Item> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recepts);
        //mRecyclerView = findViewById(R.id.lay);
//        mItems = new ArrayList<>();
//        mItems.add(new Item(3,"asdhasjd",2377,"yes","125.36","99834"));
//        mItems.add(new Item(4,"thanh",32,"no","125.36","44451237"));
//        mItems.add(new Item(5,"duc",63,"no","125.36","44451237"));
//        mItems.add(new Item(6,"tuan",6723,"no","125.36","44451237"));
//        mItems.add(new Item(7,"dat",891,"no","125.36","44451237"));
//        mItems.add(new Item(8,"jahfjahsj",7623,"no","125.36","44451237"));
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        ItemAdapter itemAdapter = new ItemAdapter(mItems);
//        mRecyclerView.setAdapter(itemAdapter);
    }
}
