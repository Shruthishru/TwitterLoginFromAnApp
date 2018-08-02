package app.compassites.com.twitterloginpoc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by shruthi on 2/8/18.
 */

public class ConnectionDetector {

    private Context context;

   public ConnectionDetector(Context context) {
        this.context = context;
    }

    public boolean isConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
       if (connectivityManager!=null){
           NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
           if (networkInfo!=null){
               if (networkInfo.getState()==NetworkInfo.State.CONNECTED){
                   Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
                   return true;
               }
               else {
                   Toast.makeText(context, "Not connected", Toast.LENGTH_SHORT).show();
                   return false;
               }
           }
       }
        return false;
    }
}
