package sifat.cards;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;


public class MainActivity extends ActionBarActivity {
    private RecyclerView _recyclerView;
    private MyAdapter _myAdapter;
    private RecyclerView.LayoutManager _layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        _layoutManager = new LinearLayoutManager(this);
        _recyclerView.setLayoutManager(_layoutManager);
        ArrayList<String> _input = new ArrayList<String>();
        for(int i=0;i<100;i++){
            _input.add("Test"+i);
        }
        _myAdapter = new MyAdapter(_input);
        _recyclerView.setAdapter(_myAdapter);
//        _myAdapter.remove("Test 1");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
