package sifat.cards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Sifat on 7/12/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<String> _dataSet;


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtHeader;
        public TextView txtFooter;

        public ViewHolder(View itemView) {
            super(itemView);
            txtHeader = (TextView)itemView.findViewById(R.id.firstLine);
            txtFooter = (TextView)itemView.findViewById(R.id.secondLine);
        }
    }

    public void add(int position, String item){
        _dataSet.add(position,item);
        notifyItemInserted(position);
    }

    public void remove(String item){
        int position = _dataSet.indexOf(item);
        _dataSet.remove(position);
        notifyItemRemoved(position);
    }


    public MyAdapter(ArrayList<String> myDataSet) {
        _dataSet = myDataSet;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        final String name = _dataSet.get(position);
        holder.txtHeader.setText(_dataSet.get(position));
        holder.txtFooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remove(name);
            }
        });
        holder.txtFooter.setText("Footer: "+_dataSet.get(position));


    }

    @Override
    public int getItemCount() {
        return _dataSet.size();
    }
}

