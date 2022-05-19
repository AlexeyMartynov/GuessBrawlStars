package io.github.alexeymartynov.guessbrawlstars.levels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.github.alexeymartynov.guessbrawlstars.MainActivity;
import io.github.alexeymartynov.guessbrawlstars.Question;
import io.github.alexeymartynov.guessbrawlstars.R;

public class GameLevel extends AppCompatActivity {

    protected int layout;
    protected Question question;

    public GameLevel(int layout, Question question) {
        this.layout = layout;
        this.question = question;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(layout);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button backButton = (Button) findViewById(R.id.button_back);
        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) { back(); }

        });
    }

    private void back() {
        try {
            Intent intent = new Intent(GameLevel.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception exception) {}
    }

    @Override
    public void onBackPressed() { back(); }
}
