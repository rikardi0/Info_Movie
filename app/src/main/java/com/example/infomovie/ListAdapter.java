package com.example.infomovie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.infomovie.model.ListElement;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> data;
    private LayoutInflater inflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.data = itemList;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_view_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.binData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView titleMovie, releaseDate, popularity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_movie);
            titleMovie = itemView.findViewById(R.id.title_movie);
            releaseDate = itemView.findViewById(R.id.release_date);
            popularity = itemView.findViewById(R.id.popularity_movie);

        }

        void binData(final ListElement item) {
            Glide.with(context)
                    .load(item.getPosterPath())
                    .into(image);
            titleMovie.setText(item.getTitle());
            popularity.setText(String.valueOf(item.getVoteAverage()));
            releaseDate.setText(String.valueOf(item.getReleaseDate()));


        }
    }



}
