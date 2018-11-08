package example.com.chairul.projectuaschairulrahmant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dzier on 14/07/2018.
 */
public class CustomAdapter extends BaseAdapter {
    Context context;
    String text[];
    int logos[];
    LayoutInflater inflater;
    public CustomAdapter(Context aplicationContext, int[] logos,String[] text){
        this.context = aplicationContext;
        this.logos  = logos;
        this.text = text;
        inflater = (LayoutInflater.from(aplicationContext));
    }
    @Override
    public int getCount() {
        return logos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_gridview, null);
        ImageView icon = (ImageView)view.findViewById(R.id.icon);
        TextView synop = (TextView)view.findViewById(R.id.selectedText);
        icon.setImageResource(logos[i]);

        return view;
    }
}
