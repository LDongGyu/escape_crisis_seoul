package cau.escape_crisis_seoul;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EmergencyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        ImageButton cprButton = (ImageButton)findViewById(R.id.CPR_button);
        cprButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_cpr.class);
                startActivity(i);
            }
        });

        ImageButton burnButton = (ImageButton)findViewById(R.id.burn_button);
        burnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_burn.class);
                startActivity(i);
            }
        });

        ImageButton heatstrokeButton = (ImageButton)findViewById(R.id.heatstroke_button);
        heatstrokeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_heatstroke.class);
                startActivity(i);
            }
        });

        ImageButton frostbiteButton = (ImageButton)findViewById(R.id.frostbite);
        frostbiteButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_frostbite.class);
                startActivity(i);
            }
        });

        ImageButton drugButton = (ImageButton)findViewById(R.id.drug_button);
        drugButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_drug.class);
                startActivity(i);
            }
        });

        ImageButton scratchButton = (ImageButton)findViewById(R.id.scratch_button);
        scratchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_scratch.class);
                startActivity(i);
            }
        });

        ImageButton fractureButton = (ImageButton)findViewById(R.id.fracture_button);
        fractureButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_fracture.class);
                startActivity(i);
            }
        });

        ImageButton dogButton = (ImageButton)findViewById(R.id.dog_button);
        dogButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_dog.class);
                startActivity(i);
            }
        });

        ImageButton snakeButton = (ImageButton)findViewById(R.id.snake_button);
        snakeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_snake.class);
                startActivity(i);
            }
        });

        ImageButton beeButton = (ImageButton)findViewById(R.id.bee_button);
        beeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(EmergencyActivity.this,
                        EmergencyActivity_bee.class);
                startActivity(i);
            }
        });


    }
}
