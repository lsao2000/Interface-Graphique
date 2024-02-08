package com.example.viewpagertp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import android.content.Context;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{
    private Context context;
    private List<Group> lstGroups = new ArrayList<Group>();
    public MyAdapter(Context context, List<Group> lstGroups){
        this.context = context;
        this.lstGroups = lstGroups;
    }
    @NotNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.classes_view, parent, false);
        return new MyHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull @NotNull MyHolder parent, int position) {
        parent.code.setText("Code : "+lstGroups.get(position).getCode());
        parent.filiere.setText("Filiere : " + lstGroups.get(position).getFiliere().getNomFil());
        parent.numStudent.setText("Number Student: "+ lstGroups.get(position).getNumberStudent());
        parent.annee.setText("Annee : "+ lstGroups.get(position).getAnnee());
        parent.nameGroup.setText("Name Group : "+ lstGroups.get(position).getNameGroup());


    }
    @Override
    public int getItemCount() {
        return lstGroups.size();
    }
    public static class MyHolder extends RecyclerView.ViewHolder{
        private TextView filiere, code, numStudent, annee, nameGroup;
        private RecyclerView recyclerStudent;
        public MyHolder(@NonNull @NotNull View parent) {
            super(parent);
            filiere = parent.findViewById(R.id.filiere);
            code = parent.findViewById(R.id.codeGroup);
            numStudent = parent.findViewById(R.id.numberStudent);
            nameGroup = parent.findViewById(R.id.nameGroup);
            annee = parent.findViewById(R.id.annee);
            recyclerStudent = parent.findViewById(R.id.recycleStudent);
        }
    }
}
