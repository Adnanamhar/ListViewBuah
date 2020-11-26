package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityListDaging extends AppCompatActivity {
    ListView ListDaging;

    String[] JudulDaging = {
            "Daging Unta",
            "Daging Sapi",
            "Daging Kambing",
            "Daging Kerbau",
            "Daging Kelinci",
            "Daging Ayam",
            "Daging Bebek",
    };

    Integer[] GambarDaging = {
            R.drawable.dagingunta,
            R.drawable.dagingsapi,
            R.drawable.dagingkambing,
            R.drawable.dagingkerbau,
            R.drawable.dagingkelinci,
            R.drawable.dagingayam,
            R.drawable.dagingbebek,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_daging);

        ListDaging = findViewById(R.id.list_daging);

        CustomListAdapter adapter = new CustomListAdapter( this,JudulDaging,GambarDaging);
        ListDaging.setAdapter(adapter);

        ListDaging.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Anda Memilih :" + JudulDaging[position],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}