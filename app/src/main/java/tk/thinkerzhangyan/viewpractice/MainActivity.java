package tk.thinkerzhangyan.viewpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CanvasAndPaintActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CanvasLayerActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CanvasSaveScaleActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ClipRectActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_five).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ClockActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_six).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CanvasAndPaintActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_seven).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ClipPathActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.bt_eight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        findViewById(R.id.bt_nine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrawTextActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.bt_ten).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XferModeActivity.class);
                startActivity(intent);
            }
        });

    }
}
