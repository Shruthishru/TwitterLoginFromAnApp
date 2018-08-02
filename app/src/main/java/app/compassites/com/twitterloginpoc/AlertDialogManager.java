package app.compassites.com.twitterloginpoc;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by shruthi on 2/8/18.
 */

public class AlertDialogManager {

    public void showAlertDialog(final Context context, String title, String message, Boolean status) {

        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Title");
        alertDialog.setMessage("Internet Unavailable");
        alertDialog.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(context, "You clicked on OK", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();
        alertDialog.setButton(Dialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(context, "Cancelled", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();
    }
}
