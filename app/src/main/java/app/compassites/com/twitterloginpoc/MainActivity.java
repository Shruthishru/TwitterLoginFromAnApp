package app.compassites.com.twitterloginpoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ConnectionDetector connectionDetector;
    AlertDialogManager alertDialogManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectionDetector = new ConnectionDetector(this);
        alertDialogManager = new AlertDialogManager();

        if (!connectionDetector.isConnected()) {
            alertDialogManager.showAlertDialog(MainActivity.this,
                    "ERROR !", "Please check your internet connectivity", false);
        }
    }
}
