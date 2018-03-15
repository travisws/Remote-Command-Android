package com.theraven.mcremotecommander;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText el;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        el = (EditText) findViewById(R.id.name);
    }

    public void button (View view){
        System.out.println("started");
        MessageSender messageSender = new MessageSender();
        messageSender.execute(el.getText().toString());

        System.out.println("ended");
    }
}
