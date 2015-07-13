package sifat.cards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Sifat on 7/12/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] _dataSet;


    /* the layout manager calls onCreateViewHolder() to render new views.
     * Dynamically a view is rendered by LayoutInflater class, this view is passed
      * on to ViewHolder to hold our view*/
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return null;
    }

    /*Notice that our visible cards/list are the same; it is the content that
    * changes as we scroll down. The onBindViewHolder() calls the data from
    * our database/server and replaces the old content in a particular view
    * at a certain position with new content*/
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        /*We will have an array of data and we will get
        * the respective data for the corresponding holder*/

//        final String name = _dataSet[position];
        holder._firstLine.setText(_dataSet[position]);

    }

    @Override
    public int getItemCount() {
        return _dataSet.length;
    }

    /*
    * Feed the views each row will have in the constructor
    * */
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView _firstLine;
//        public TextView _textView;
        public ViewHolder(View v){
            super(v);
            //the row element view consist of our text view...
            _firstLine = (TextView)v.findViewById(R.id.firstLine);
        }
    }

    /*feed the data in the constructor*/
    public MyAdapter(String[] ds){
        _dataSet = ds;
    }



}
