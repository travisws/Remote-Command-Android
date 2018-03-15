package com.theraven.mcremotecommander;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Travisws on 3/14/2018.
 */

public class MessageSender extends AsyncTask<String, Void, Void> {

    Socket s;
    DataOutputStream dos;
    PrintWriter pw;


    @Override
    protected Void doInBackground(String... voids) {

        String message = voids[0];
        try {
            s = new Socket("192.168.0.22", 9999);
            System.out.println("1");
            pw = new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();
            System.out.println("2");
            pw.close();
            s.close();
            System.out.println("3");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }
}
