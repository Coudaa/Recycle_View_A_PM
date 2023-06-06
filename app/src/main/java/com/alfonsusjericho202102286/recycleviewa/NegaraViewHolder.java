package com.alfonsusjericho202102286.recycleviewa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder {
    public ImageView _imageview1;
    public TextView _deskripsi;
    public TextView _nama;

    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);

        _imageview1 = itemView.findViewById(R.id.image1);
        _deskripsi = itemView.findViewById(R.id.deskripsi);
        _nama = itemView.findViewById(R.id.nama);
    }
}
