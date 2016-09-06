package net.moudra.espressoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String messageText;
        if (intent.getExtras() != null) {
            messageText = intent.getStringExtra(MainActivity.EXTRA_NAME);
        } else {
            messageText = getString(R.string.nothing_here);
        }

        messageTextView = (TextView) findViewById(R.id.message_textview);
        messageTextView.setText(messageText);
    }
}
