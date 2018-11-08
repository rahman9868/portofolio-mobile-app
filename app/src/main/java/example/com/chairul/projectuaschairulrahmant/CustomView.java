package example.com.chairul.projectuaschairulrahmant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dzier on 15/07/2018.
 */
public class CustomView  extends ArrayAdapter {
    private final Context context;
    private final String[] values;

    public CustomView(Context context, String[] values) {
        super(context, R.layout.listview, values);
        this.context = context;
        this.values = values;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.listview, parent, false);
        TextView tv = (TextView) rowView.findViewById(R.id.label);
        ImageView iv = (ImageView) rowView.findViewById(R.id.logo);

        String item_value = values[position];

        if (item_value.equals("deathrace")) {
            iv.setImageResource(R.drawable.pilem1);
            tv.setText(item_value);
        } else if (item_value.equals("pacificrimuprising")) {
            iv.setImageResource(R.drawable.pilem2);
            tv.setText(item_value);
        } else if (item_value.equals("jumanji")) {
            iv.setImageResource(R.drawable.pilem3);
            tv.setText(item_value);
        } else if (item_value.equals("mazerunner")) {
            iv.setImageResource(R.drawable.pilem4);
            tv.setText(item_value);
        } else if (item_value.equals("ikillgiants")) {
            iv.setImageResource(R.drawable.pilem5);
            tv.setText(item_value);
        }
        return rowView;
    }

}
