package com.FATEC.LES.Helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.FATEC.LES.DAO.Contrato;
import com.FATEC.LES.DuplicatasActivity;
import com.FATEC.LES.ExibirDuplicataActivity;
import com.FATEC.LES.Model.Cliente;
import com.FATEC.LES.Model.Duplicata;
import com.FATEC.LES.Model.Emitente;
import com.FATEC.LES.R;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class TableViewAdapter extends RecyclerView.Adapter {

    private Context c;

    List<Duplicata> movieList;
    QueriesHelper qh = new QueriesHelper();
    DBHelper db;


    public TableViewAdapter(List<Duplicata> movieList, Context c){
        this.c = c;
        this.movieList = movieList;
        db = new DBHelper(c);
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.table_list_item, parent, false);

        return new RowViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final RowViewHolder rowViewHolder = (RowViewHolder) holder;

        int rowPos = rowViewHolder.getAdapterPosition();

        if (rowPos == 0) {
            // Header Cells. Main Headings appear here
            rowViewHolder.txtRank.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtMovieName.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtYear.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtCost.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtButton.setBackgroundResource(R.drawable.table_header_cell_bg);

            rowViewHolder.txtRank.setText("ID");
            rowViewHolder.txtMovieName.setText("Cliente");
            rowViewHolder.txtYear.setText("Emitente");
            rowViewHolder.txtCost.setText("Situação");
            rowViewHolder.txtButton.setText("");
            rowViewHolder.txtButton.setVisibility(View.VISIBLE);
            rowViewHolder.btnVer.setVisibility(View.GONE);

        } else {
            final Duplicata modal = movieList.get(rowPos-1);
            final Cliente cliente = qh.selectCliente(modal.getDup_Cliente().toString(),2,db,2);
            final Emitente emitente = qh.selectEmitente(modal.getDup_Emitente().toString(), 2,db,2);

            final SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss", Locale.getDefault());

            // Content Cells. Content appear here
            rowViewHolder.txtRank.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtMovieName.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtYear.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtCost.setBackgroundResource(R.drawable.table_content_cell_bg);

            rowViewHolder.txtRank.setText(modal.getDup_Id_Duplicata()+"");
            rowViewHolder.txtMovieName.setText(emitente.getRazao_Social());
            rowViewHolder.txtYear.setText(cliente.getRazao_Social());
            rowViewHolder.txtCost.setText(modal.transStatus(modal.getDup_Status()));
            rowViewHolder.txtButton.setVisibility(View.GONE);
            rowViewHolder.btnVer.setVisibility(View.VISIBLE);

            rowViewHolder.btnVer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent inDup = new Intent(v.getContext(), ExibirDuplicataActivity.class);
                    System.out.println("ID duplicata : " + modal.getDup_Id_Duplicata());
                    inDup.putExtra("ID_DUP", modal.getDup_Id_Duplicata());
                    inDup.putExtra("CLIENTE", cliente.getRazao_Social());
                    inDup.putExtra("EMITENTE", emitente.getRazao_Social());
                    inDup.putExtra("DTEMI", modal.getDup_Data_Emissao());
                    v.getContext().startActivity(inDup);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return movieList.size()+1; // one more to add header row
    }

    public class RowViewHolder extends RecyclerView.ViewHolder {
        protected TextView txtRank;
        protected TextView txtMovieName;
        protected TextView txtYear;
        protected TextView txtCost;
        protected TextView txtButton;
        protected Button   btnVer;

        public RowViewHolder(View itemView) {
            super(itemView);

            txtRank = itemView.findViewById(R.id.txtRank);
            txtMovieName = itemView.findViewById(R.id.txtMovieName);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtCost = itemView.findViewById(R.id.txtCost);
            txtButton = itemView.findViewById(R.id.txtButton);
            btnVer = itemView.findViewById(R.id.btnVer);
        }
    }


}
