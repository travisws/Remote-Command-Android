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

    public Socket s;
    public String IP;
    public int port;
    DataOutputStream dos;
    PrintWriter pw;


    @Override
    protected Void doInBackground(String... voids) {
        String message = voids[0];
        try {
            s = new Socket(IP, port);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();
            pw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }
}
