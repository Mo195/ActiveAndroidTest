package de.krischkes.moritz.activeandroidapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.activeandroid.ActiveAndroid;

public class MainActivity extends Activity {


    Button mAddPersonButton, mRetrievePersonButton;
    long mId;
    TextView mResultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActiveAndroid.initialize(getApplication());
        mAddPersonButton= (Button) findViewById(R.id.addPersonButton);
        mAddPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person p = new Person("Moritz", "Krischke");
                long id= p.save();
            }
        });
        mResultTextView= (TextView) findViewById(R.id.resultPersonView);
        mRetrievePersonButton= (Button)findViewById(R.id.retrievePersonButton);
        mRetrievePersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person blubber = Person.load(Person.class, 1);
                mResultTextView.setText(blubber.getmVorname() +" "+blubber.getmNachname());
            }
        });

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
