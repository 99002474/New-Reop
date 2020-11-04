package com.example.entries;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[],data2[];
    int images[];
    Context context;

    public  MyAdapter(Context ct, String s1[],String s2[], int img[]){
        context  = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {

        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myText1, myText2;
        ImageView myImage;

        public MyViewHolder (@NonNull View itemView){
            super (itemView);
            myText1 = itemView.findViewById(R.id.myTextView);
            myText2 = itemView.findViewById(R.id.myTextView2);
            myImage = itemView.findViewById(R.id.myImageView);
        }

    }

}
