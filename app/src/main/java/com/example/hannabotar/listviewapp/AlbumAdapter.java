package com.example.hannabotar.listviewapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hannabotar.listviewapp.model.Album;

import java.util.List;

/**
 * Created by hanna on 7/15/2018.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(@NonNull Context context, int resource, @NonNull List<Album> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Album currentAlbum = getItem(position);

        TextView albumTitle = (TextView) convertView.findViewById(R.id.album_title);
        TextView albumArtist = (TextView) convertView.findViewById(R.id.album_artist);
        albumTitle.setText(currentAlbum.getName());
        albumArtist.setText(currentAlbum.getArtist());

        return convertView;
    }
}
