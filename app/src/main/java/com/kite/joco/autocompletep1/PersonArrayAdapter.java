package com.kite.joco.autocompletep1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joco on 2015.12.06..
 */
public class PersonArrayAdapter extends ArrayAdapter<Person> {

    Context mContext;
    int resource;
    List<Person> persons;

    public PersonArrayAdapter(Context context, int resource) {
        super(context, resource);
    }

    public PersonArrayAdapter(Context mContext, int resource, List<Person> persons) {
        super(mContext, resource, persons);
        this.mContext = mContext;
        this.resource = resource;
        this.persons = persons;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*if(convertView==null){
                // inflate the layout
                LayoutInflater inflater = ((MainActivity) mContext).getLayoutInflater();
                convertView = inflater.inflate(layoutResourceId, parent, false);
            }

            // object item based on the position
            MyObject objectItem = data[position];

            // get the TextView and then set the text (item name) and tag (item ID) values
            TextView textViewItem = (TextView) convertView.findViewById(R.id.textViewItem);
            textViewItem.setText(objectItem.objectName);

            // in case you want to add some style, you can do something like:
            textViewItem.setBackgroundColor(Color.CYAN);
        */
        if (convertView == null ){
            LayoutInflater inflater = ((MainActivity) mContext).getLayoutInflater();
            convertView = inflater.inflate(resource,parent,false);
        }

        Person p = persons.get(position);

        TextView textViewNev = (TextView) convertView.findViewById(R.id.tvnev);
        //TextView textViewBeosztas = (TextView) convertView.findViewById(R.id.tvbeosztas);

        textViewNev.setText(p.getName());
        //textViewBeosztas.setText(p.getBeoasztas());

        return convertView;
    }
}
