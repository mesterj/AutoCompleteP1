package com.kite.joco.autocompletep1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autoText);
        textView.setAdapter(adapter);*/


        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autoText);


        ArrayAdapter<Person> myadapter = new PersonArrayAdapter(this,R.layout.personitemview,getPersons());

        textView.setAdapter(myadapter);
    }

    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain", "Scotland","Finland","Beluros","Hungary","Ireland","Geneva","Frankreich"
    };

    List<Person> getPersons() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Mester József", "vezető programozó", 41));
        persons.add(new Person("Mester Béla", "vezető programozó", 41));
        persons.add(new Person("Dúró István", "vezető programozó", 28));
        persons.add(new Person("Dúró József", "vezető programozó", 25));
        persons.add(new Person("Fejes József", "informatikus", 25));
        persons.add(new Person("Fejes Mihály", "faszfej", 42));
        persons.add(new Person("Fejes Tibor", "idióta", 35));
        persons.add(new Person("Fejes Béla", "minta", 25));
        persons.add(new Person("Kovács László", "valami", 25));

        return persons;
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
