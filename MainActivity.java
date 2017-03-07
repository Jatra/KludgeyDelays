package uk.co.jatra.kludgeydelays;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tf;
    private Button b1, b2, b3;
    private Handler handler;
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        handler = new Handler();

        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        tf = (TextView)findViewById(R.id.text1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                //disable this button
                v.setEnabled(false);
                //launch a snackbar after 1 second
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        snackbar = Snackbar.make(v, "b1 operation", Snackbar.LENGTH_INDEFINITE);
                        snackbar.show();
                    }
                }, 1000);
                //disable other buttons after 1 second
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                    }
                }, 1000);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        snackbar.dismiss();
                    }
                }, 5000);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                //disable this button
                v.setEnabled(false);
                //launch a snackbar after 1 second
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        snackbar = Snackbar.make(v, "b2 operation", Snackbar.LENGTH_INDEFINITE);
                        snackbar.show();
                    }
                }, 1000);
                //disable other buttons after 1 second
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                    }
                }, 1000);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        snackbar.dismiss();
                    }
                }, 5000);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                //disable this button
                v.setEnabled(false);
                //launch a snackbar after 1 second
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        snackbar = Snackbar.make(v, "b3 operation", Snackbar.LENGTH_INDEFINITE);
                        snackbar.show();
                    }
                }, 1000);
                //disable other buttons after 1 second
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                    }
                }, 1000);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        snackbar.dismiss();
                    }
                }, 5000);
            }
        });
    }


}
