package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;

public class ActivityListView extends AppCompatActivity{
    ListView listView;

    String[] judulList = {
            "Apel",
            "Alpukat",
            "Cery",
            "JambuAir",
            "Manggis",
            "Strawberry",
            "Durian",
    };

    Integer[] gambarList = {
            R.drawable.apel,
            R.drawable.alpukat,
            R.drawable.ceri,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry,
            R.drawable.durian,
    };

    int[] listMusik = {
            R.raw.apel,
            R.raw.alpukat,
            R.raw.ceri,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry,
            R.raw.durian,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);

        CustomListAdapter adapter = new CustomListAdapter( this,judulList,gambarList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Anda Memilih :" + judulList[position],
                        Toast.LENGTH_SHORT).show();

                Uri myuri = Uri.parse("android.resource://" + getPackageName() + "/" + listMusik[position]);
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mediaPlayer.setDataSource(getApplicationContext(), myuri);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mediaPlayer.start();
            }
        });
    }
}
