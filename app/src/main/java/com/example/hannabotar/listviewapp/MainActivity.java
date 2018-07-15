package com.example.hannabotar.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.hannabotar.listviewapp.model.Album;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Album> albumList = createMockList();

        ListView listView = (ListView) findViewById(R.id.list);

        AlbumAdapter albumAdapter = new AlbumAdapter(this, R.id.list_item, albumList);

        listView.setAdapter(albumAdapter);
    }

    private List<Album> createMockList() {
        List<Album> albumList = new ArrayList<>();
        albumList.add(new Album(1L, "Mumford and Sons", "Wilder mind"));
        albumList.add(new Album(2L, "Mumford and Sons", "Babel"));
        albumList.add(new Album(3L, "George Ezra", "Wanted on Voyage"));
        albumList.add(new Album(4L, "Netsky", "Netsky"));
        albumList.add(new Album(5L, "Metallica", "Saint Anger"));
        albumList.add(new Album(6L, "Metallica", "Ride the Lightning"));
        albumList.add(new Album(7L, "Metallica", "Garage inc."));
        albumList.add(new Album(8L, "Norah Jones", "The Fall"));
        albumList.add(new Album(9L, "Norah Jones", "Day Breaks"));
        albumList.add(new Album(10L, "Norah Jones", "Come Away with Me"));
        albumList.add(new Album(11L, "Eminem", "The Eminem Show"));
        albumList.add(new Album(12L, "Eminem", "Revival"));
        albumList.add(new Album(13L, "Michael Jackson", "Netsky"));
        albumList.add(new Album(14L, "Michael Jackson", "Dangerous"));
        albumList.add(new Album(15L, "Michael Jackson", "Thriller"));

        return albumList;
    }
}
