package tk.thinkerzhangyan.viewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.richinfo.cliprectdemo.ClipRectDemo;

public class ClipRectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ClipRectDemo(this));
    }
}
