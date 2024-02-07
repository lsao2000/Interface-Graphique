package com.example.viewpagertp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import android.content.Context;
import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{
    private Context context;
    private List<Group> lstGroups;
    public MyAdapter(Context context, List<Group> lstGroups){
        this.context = context;
    }
    @NotNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.classes_view, parent, false);
        return new MyHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull @NotNull MyHolder myHolder, int i) {

    }
    @Override
    public int getItemCount() {
        return lstGroups.size();
    }
    public static class MyHolder extends RecyclerView.ViewHolder{

        public MyHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}
