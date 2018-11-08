package example.com.chairul.projectuaschairulrahmant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dzier on 19/07/2018.
 */
public class CustomGrid1List extends BaseAdapter {
    Context context;
    String[] txt;
    int logo[];
    LayoutInflater inflater;
    public CustomGrid1List(Context aplicationContext, int[] logo,String[] txt){
        this.context = aplicationContext;
        this.txt = txt;
        this.logo = logo;
        inflater = (LayoutInflater.from(aplicationContext));
    }
    @Override
    public int getCount() {
        return logo.length;
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
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.activity_grid1listview, null);
        ImageView ikon = (ImageView)view.findViewById(R.id.ikon);
        TextView txtikon = (TextView)view.findViewById(R.id.txtIkon);
        ikon.setImageResource(logo[i]);
        txtikon.setText(txt[i]);
        return view;
    }
}
