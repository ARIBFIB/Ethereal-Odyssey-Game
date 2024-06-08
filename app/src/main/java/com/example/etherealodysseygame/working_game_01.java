package com.example.etherealodysseygame;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class working_game_01 extends AppCompatActivity {

    ImageView maps;
    Button btnTop, btnBottom, btnRight, btnLeft;
    ObjectAnimator animator;
    float currentY = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working_game01);

        maps = findViewById(R.id.maps);
        btnTop = findViewById(R.id.btn_top);
        btnBottom = findViewById(R.id.btn_bottom);
        btnRight = findViewById(R.id.btn_right);
        btnLeft = findViewById(R.id.btn_left);

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMoveDownAnimation();
            }
        });

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMoveUpAnimation();
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMoveLeftAnimation();
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMoveRightAnimation();
            }
        });


        // Initialize ObjectAnimator for Y property
        animator = ObjectAnimator.ofFloat(maps, "translationY", currentY, currentY + 10f);
        animator.setDuration(100);

    }

    private void startMoveDownAnimation() {
        if (animator.isRunning()) {
            animator.cancel();
            float currentY = maps.getTranslationY();
            animator = ObjectAnimator.ofFloat(maps, "translationY", currentY, currentY + 10f);
        }else{
            animator = ObjectAnimator.ofFloat(maps, "translationY" , maps.getTranslationY() , maps.getTranslationY() + 300f);

        }
        animator.setDuration(100);
        animator.start();
    }

    private void startMoveUpAnimation() {
        if (animator.isRunning()) {
            animator.cancel();
            float currentY = maps.getTranslationY();
            animator = ObjectAnimator.ofFloat(maps, "translationY", currentY, currentY - 10f);
        } else {
            animator = ObjectAnimator.ofFloat(maps, "translationY", maps.getTranslationY(), maps.getTranslationY() - 300f);
        }
        animator.setDuration(100);
        animator.start();
    }

//    -----
    private void startMoveRightAnimation() {
        if (animator.isRunning()) {
            animator.cancel();
            float currentX = maps.getTranslationX();
            animator = ObjectAnimator.ofFloat(maps, "translationX", currentX, currentX + 10f);
        } else {
            animator = ObjectAnimator.ofFloat(maps, "translationX", maps.getTranslationX(), maps.getTranslationX() + 300f);
        }
        animator.setDuration(100);
        animator.start();
    }

    private void startMoveLeftAnimation() {
        if (animator.isRunning()) {
            animator.cancel();
            float currentX = maps.getTranslationX();
            animator = ObjectAnimator.ofFloat(maps, "translationX", currentX, currentX - 10f);
        } else {
            animator = ObjectAnimator.ofFloat(maps, "translationX", maps.getTranslationX(), maps.getTranslationX() - 300f);
        }
        animator.setDuration(100);
        animator.start();
    }
}
