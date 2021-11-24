package org.aplas.project2_flowy;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    String data1[], data2[], data3[], myVideo[];
    int images[];
    Context context;

    public Adapter(Context ct , String s1[] , String s2[] , String s3[], String video[], int img[]){
        context = ct;
        data1   = s1;
        data2   = s2;
        data3   = s3;
        images  = img;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.menulist_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {

        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title, deskripsi;
        ImageView gridIcon;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            title = itemView.findViewById(R.id.txtTitle);
            deskripsi = itemView.findViewById(R.id.txtDeskripsi);
            gridIcon = itemView.findViewById(R.id.imgBunga);
        }
    }
}
