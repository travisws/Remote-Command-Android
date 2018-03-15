package com.theraven.mcremotecommander;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class MainActivity extends AppCompatActivity {

    EditText el;
    EditText port;
    EditText IP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        el = (EditText) findViewById(R.id.name);
        port = (EditText) findViewById(R.id.Port);
        IP = (EditText) findViewById(R.id.IP);


    }

    public void button (View view){
        System.out.println("started");
        MessageSender messageSender = new MessageSender();

        int port2 = Integer.parseInt(port.getText().toString());

        messageSender.port = port2;
        messageSender.IP = IP.getText().toString();
        messageSender.execute(el.getText().toString());

        System.out.println("ended");
    }
}
