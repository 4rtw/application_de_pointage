package com.artware.applicationdepointage.ListAdapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.artware.applicationdepointage.Model.Personne;
import com.artware.applicationdepointage.R;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder>{

    private List<Personne> personneList;
    private Context context;

    public HistoryAdapter(List<Personne> personneList, Context context){
        this.personneList = personneList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_historique, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Personne personne = personneList.get(position);

        holder.textViewMatricule.setText(String.valueOf(personne.getMatricule()));
        holder.textViewNom.setText(personne.getNom());
        holder.textViewPrenom.setText(personne.getPrenom());
        holder.checkBox.setChecked(personne.getChecked());
        
        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        /*
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                personneList.remove(holder.getAdapterPosition());
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return personneList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewMatricule, textViewNom, textViewPrenom;
        CheckBox checkBox;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewMatricule = itemView.findViewById(R.id.textView_Matricule);
            textViewNom = itemView.findViewById(R.id.textView_Nom);
            textViewPrenom = itemView.findViewById(R.id.textView_Prenom);
            
            checkBox = itemView.findViewById(R.id.checkbox_checked);
        }
    }

}
