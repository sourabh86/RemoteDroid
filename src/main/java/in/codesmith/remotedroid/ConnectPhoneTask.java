package in.codesmith.remotedroid;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Sourabh Soni on 06-03-2015.
 */
public class ConnectPhoneTask extends AsyncTask<String,Void,Boolean> {

    @Override
    protected Boolean doInBackground(String... params) {
        boolean result = true;
        try {
            InetAddress serverAddr = InetAddress.getByName(params[0]);
            Log.d("ClientActivity", "Connecting...");
            Socket socket = new Socket(serverAddr, 8998);
            //MOGADActivity.isConnected=true;
            //connectPhones.setEnabled(false);
            //closeConnection.setEnabled(true);

            System.out.println("Connected");
        } catch (Exception e) {
            Log.e("ClientActivity", "Error", e);
            //MOGADActivity.isConnected = false;
            result = false;
        }

        return result;
    }

    @Override
    protected void onPostExecute(Boolean result)
    {

    }
}
