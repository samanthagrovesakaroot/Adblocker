package r.adblocker;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity{
    private long[] pattern = {0};
    private Vibrator v;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        output = (TextView) findViewById(R.id.output);
    }
    public void vibrate(View view){
        v.vibrate(pattern, 0);
        output.setText("Not applied");
    }
    public void apply(View view){
        v.cancel();
        output.setText("Applied");
    }
}
