package com.woodman.androidstart.Helper;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.woodman.androidstart.R;

/**
 * Created by Zver on 20.02.2018.
 */

public class MyAlertSettings {
    private Context context;
    AlertDialog.Builder setting;

    private boolean sound = false;
    private boolean vibro = false;
    private final boolean[] choiceItemArray;
    private String[] choiceStrings = {"Sound", "Vibro"};

    public MyAlertSettings(Context context) {
        this.context = context;
        setting = new AlertDialog.Builder(context);
        setting.setTitle("Notification Settings");
        choiceItemArray = new boolean[]{sound, vibro};
    }



    public void chooseFunctions() {
        setting.setMultiChoiceItems(
                choiceStrings
                , choiceItemArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        choiceItemArray[i] = b;
                    }
                }).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                sound = choiceItemArray[0];
                vibro = choiceItemArray[1];
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

    }

    public void createSettingsDialog() {
        setting.create();
        setting.setIcon(R.drawable.ic_notifications_settings);
    }

    public void showSettingsDialog() {

        setting.show();
    }


}
