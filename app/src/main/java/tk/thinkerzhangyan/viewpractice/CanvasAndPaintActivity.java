package tk.thinkerzhangyan.viewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasAndPaintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CanvasAndPaint(this));
    }
}
