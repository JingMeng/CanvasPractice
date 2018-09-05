package tk.thinkerzhangyan.viewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ClipPathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ClipPathDemo(this));
    }
}
