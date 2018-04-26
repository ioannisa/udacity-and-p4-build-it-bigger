package eu.anifantakis.jokesdisplaylib;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    public static final String EXTRAS_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.activity_title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView tvJoke = (TextView) findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRAS_JOKE)){
            String jokeToDisplay = intent.getStringExtra(EXTRAS_JOKE);
            tvJoke.setText(jokeToDisplay);
        }
    }

    /**
     * When the arrow is pressed on the action bar, close the activity
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
