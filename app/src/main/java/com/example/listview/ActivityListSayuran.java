package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityListSayuran extends AppCompatActivity {
    ListView listSayuran;

    String[] JudulSayuran = {
            "Bayam",
            "Kembang Kol",
            "Lobak Putih",
            "Lobak Ungu",
            "Terung",
            "Tomat",
            "Wortel",
    };

    Integer[] GambarSayuran = {
            R.drawable.bayam,
            R.drawable.kembangkol,
            R.drawable.lobakputih,
            R.drawable.lobakungu,
            R.drawable.terung,
            R.drawable.tomat,
            R.drawable.wortel,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sayuran);

        listSayuran = findViewById(R.id.list_sayuran);

        CustomListAdapter adapter = new CustomListAdapter( this,JudulSayuran,GambarSayuran);
        listSayuran.setAdapter(adapter);

        listSayuran.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Anda Memilih :" + JudulSayuran[position],
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}


