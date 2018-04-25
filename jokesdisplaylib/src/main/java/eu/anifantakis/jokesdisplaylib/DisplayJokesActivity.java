package eu.anifantakis.jokesdisplaylib;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    public static final String EXTRAS_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        TextView tvJoke = (TextView) findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRAS_JOKE)){
            String jokeToDisplay = intent.getStringExtra(EXTRAS_JOKE);
            tvJoke.setText(jokeToDisplay);
        }
    }
}
