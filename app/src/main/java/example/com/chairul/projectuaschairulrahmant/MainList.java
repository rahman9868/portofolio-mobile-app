package example.com.chairul.projectuaschairulrahmant;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Dzier on 15/07/2018.
 */
public class MainList extends ListActivity {
    String[] mob = new String[] { "deathrace", "pacificrimuprising",
            "jumanji", "mazerunner", "ikillgiants" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        CustomView cv = new CustomView(this, mob);
        setListAdapter(cv);
    }
    protected void onListItemClick(ListView l,View v, int posisition,long id){
        super.onListItemClick(l,v,posisition,id);

        String clicked_item = (String) getListAdapter().getItem(posisition);
        Toast.makeText(this, clicked_item, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainList.this,DetailList.class);

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
