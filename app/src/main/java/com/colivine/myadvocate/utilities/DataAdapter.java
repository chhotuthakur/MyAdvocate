package com.colivine.myadvocate.utilities;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.colivine.myadvocate.R;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {


    private List<DataList> list_data;

    public DataAdapter(List<DataList> list_data) {
        this.list_data = list_data;

    }
    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.data_list_view,parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {

        DataList listData=list_data.get(position);
        holder.textcall.setText(listData.getCallamount());
        holder.textmarket.setText(listData.getMarket());
        holder.textprice.setText(listData.getPrice());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textmarket,textcall,textprice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textcall=(TextView)itemView.findViewById(R.id.textView);
            textmarket=(TextView)itemView.findViewById(R.id.textView2);
            textprice=(TextView)itemView.findViewById(R.id.textView3);

        }
    }
}


