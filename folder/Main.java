package com.example.photo_frame_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] names = { "Bill Gates", "Rohit Sharma", "Virat Kohli", "Shah Rukh Khan", "Raju" };
    ImageButton prev, next;
    ImageView[] pics = new ImageView[5];
    TextView text;
    int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next);
        text = findViewById(R.id.textView6);

        pics[0] = findViewById(R.id.imageView1);
        pics[1] = findViewById(R.id.imageView2);
        pics[2] = findViewById(R.id.imageView3);
        pics[3] = findViewById(R.id.imageView4);
        pics[4] = findViewById(R.id.imageView5);
        pics[0].setImageResource(R.drawable.billgates);
        pics[1].setImageResource(R.drawable.hitman);
        pics[2].setImageResource(R.drawable.vk);
        pics[3].setImageResource(R.drawable.shahrukhkhan);
        pics[4].setImageResource(R.drawable.raju);


        updateUI();

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
    }

    private void prev() {
        pics[currentImage].setAlpha(0f);
        currentImage = (5 + currentImage - 1) % 5;
        updateUI();
    }

    private void next() {
        pics[currentImage].setAlpha(0f);
        currentImage = (currentImage + 1) % 5;
        updateUI();
    }

    private void updateUI() {
        pics[currentImage].setAlpha(1f);
        text.setText(names[currentImage]);
    }

}
