package proyectopersonal.alarma;

/**
 * Created by Trabajo on 21/10/2017.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;


public class AlarmReceiver extends Fragment {

    //@Override
    public void onReceive(Context context, Intent intent) {
        String state = intent.getExtras().getString("extra");
        Log.e("MyActivity", "In the receiver with " + state);

        Intent serviceIntent = new Intent(context,RingtonePlayingService.class);
        serviceIntent.putExtra("extra", state);

        context.startService(serviceIntent);
    }
}
