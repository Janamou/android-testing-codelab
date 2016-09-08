package net.moudra.espressoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_NAME = "net.moudra.extra.message";
    EditText messageEditText;
    Button messageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageEditText = (EditText) findViewById(R.id.message_edittext);
        messageButton = (Button) findViewById(R.id.message_btn);
        messageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String text = messageEditText.getText().toString();
        Intent intent = new Intent(this, DetailActivity.class);
        if (!text.isEmpty()) {
            intent.putExtra(EXTRA_NAME, text);
        }
        startActivity(intent);
    }
}
