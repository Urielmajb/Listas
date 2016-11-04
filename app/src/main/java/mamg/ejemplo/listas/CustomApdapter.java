package mamg.ejemplo.listas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Administrador on 31/10/2016.
 */
public class CustomApdapter extends BaseAdapter {
    private Activity mActivity;
    private List<String> list;
    LayoutInflater mLayoutInflate;

    public CustomApdapter(Activity activity, List<String> elements){
       this.mActivity = activity;
        this.list= elements;

    }
    @Override
    public int getCount() {

        return list.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
     if (mLayoutInflate == null) {
         mLayoutInflate = mActivity.getLayoutInflater();
     }
        if (convertView == null) {
            convertView = mLayoutInflate.inflate(R.layout.list_item, parent, false);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        textView.setText(list.get(position));

        return convertView;
    }
}
