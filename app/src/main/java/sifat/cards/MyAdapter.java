package sifat.cards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Sifat on 7/12/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] _dataSet;


    /* the layout manager calls this to render new views..
     * as we scroll down */
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    /*
    * Feed the views each row will have in the constructor
    * */
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView _firstLine;
        public TextView _textView;
        public ViewHolder(View v){
            super(v);
            _firstLine = (TextView)v.findViewById(R.id.firstLine);

        }
    }

    /*feed the data in the constructor*/
    public MyAdapter(String[] dataSet){
        _dataSet = dataSet;
    }



}
