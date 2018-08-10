package com.example.macjio.a0004_prj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MyActivity extends AppCompatActivity {
    TextView BasicText;
    String message;
    ImageButton[] img = new ImageButton[16];
    ImageView imageViewBG;
    AlertDialog dialogD;



    int[] field = {1, 0, 0, 0,
                   1, 1, 1, 0,
                   1, 0, 0, 1,
                   1, 0, 1, 0};
    int open1 = -1;
    int open2 = -1;
    int moves = 0;
    int[] res_img = new int[3];
    int[] res_template = new int[8];
    int[] res_rub = new int[3];
    int[] res_bg = new int[3];
   // int[] res_r = new int[2];
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        BasicText = (TextView) findViewById(R.id.BasicText);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AlertDialog.Builder dialogD = new AlertDialog.Builder(MyActivity.this);
        dialogD.setTitle(R.string.dialog_title);
        dialogD.setMessage(R.string.dialog_message);
        dialogD.setCancelable(true);
        dialogD.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        res_template[0] = R.drawable.a01;
        res_template[1] = R.drawable.a02;
        res_template[2] = R.drawable.a03;
        res_template[3] = R.drawable.a04;
        res_template[4] = R.drawable.a05;
        res_template[5] = R.drawable.a06;
        res_template[6] = R.drawable.a07;
        res_template[7] = R.drawable.a08;

        res_rub[0] = R.drawable.rub1;
        res_rub[1] = R.drawable.rub2;
        res_rub[2] = R.drawable.rub3;

        res_bg[0] = R.drawable.a;
        res_bg[1] = R.drawable.b;
        res_bg[2] = R.drawable.c;

        imageViewBG = (ImageView)findViewById(R.id.imageViewBG);

        img[0] = (ImageButton)findViewById(R.id.img1);
        img[1] = (ImageButton)findViewById(R.id.img2);
        img[2] = (ImageButton)findViewById(R.id.img3);
        img[3] = (ImageButton)findViewById(R.id.img4);
        img[4] = (ImageButton)findViewById(R.id.img5);
        img[5] = (ImageButton)findViewById(R.id.img6);
        img[6] = (ImageButton)findViewById(R.id.img7);
        img[7] = (ImageButton)findViewById(R.id.img8);
        img[8] = (ImageButton)findViewById(R.id.img9);
        img[9] = (ImageButton)findViewById(R.id.img10);
        img[10] = (ImageButton)findViewById(R.id.img11);
        img[11] = (ImageButton)findViewById(R.id.img12);
        img[12] = (ImageButton)findViewById(R.id.img13);
        img[13] = (ImageButton)findViewById(R.id.img14);
        img[14] = (ImageButton)findViewById(R.id.img15);
        img[15] = (ImageButton)findViewById(R.id.img16);
        res_img[0] = R.drawable.a01;
        res_img[1] = R.drawable.a04;
        res_img[2] = R.drawable.rub1;



        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        img[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(0);
            }
        });
        img[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(1);
            }
        });
        img[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(2);
            }
        });
        img[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(3);
            }
        });
        img[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(4);
            }
        });
        img[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(5);
            }
        });
        img[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(6);
            }
        });
        img[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(7);
            }
        });

        img[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(8);
            }
        });
        img[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(9);
            }
        });
        img[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(10);
            }
        });
        img[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(11);
            }
        });
        img[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(12);
            }
        });
        img[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(13);
            }
        });
        img[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(14);
            }
        });
        img[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game(15);
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setBackgroundResource(R.drawable.a01);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "New Game", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                newGame();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_newgame:
                message = "Выбран пункт newGame";
                newGame();
                break;
                /*
            case R.id.action_about:
                message = "Выбран пункт showAbout";
                showAbout();
                break;
                */
            case R.id.action_exit:
                message = "Выбран пункт goExit";
                goExit();
                break;
        }
        return true;
    }

    public void game(int k){
    moves++;

    BasicText.setText("Moves:" + " " + moves);

    int i, j=0;
       if((open1 < 0)&&(open2 < 0)){
           open1 = k;
           img[k].setImageResource(res_img[field[k]]);
       } else {
           if ((k != open1)&&(open1 > -1)&&(open2 < 0)) {
               open2 = k;
               if (field[open1] == field[open2]) {
                   img[open1].setVisibility(View.INVISIBLE);
                   img[open2].setVisibility(View.INVISIBLE);

                   for(i=0; i < img.length; i++)
                       if(img[i].getVisibility() == View.INVISIBLE) j++;
                   if(j == img.length) {
                       Toast toast = Toast.makeText(getApplicationContext(), R.string.game_over, Toast.LENGTH_SHORT);
                       toast.show();
                   }

                   open1 = -1;
                   open2 = -1;
               } else {
                   img[open1].setImageResource(res_img[2]);
                   open1 = -1;
                   open2 = -1;
               }
           }
           if ((k != open2)&&(open1 < 0)&&(open2 > -1)) {
               open1 = k;
               if (field[open1] == field[open2]) {
                   img[open1].setVisibility(View.INVISIBLE);
                   img[open2].setVisibility(View.INVISIBLE);

                   for(i=0; i < img.length; i++)
                       if(img[i].getVisibility() == View.INVISIBLE) j++;
                   if(j == img.length) {
                       Toast toast = Toast.makeText(getApplicationContext(), R.string.game_over, Toast.LENGTH_SHORT);
                       toast.show();
                   }

                   open1 = -1;
                   open2 = -1;
               } else {
                   img[open2].setImageResource(res_img[2]);
                   open1 = -1;
                   open2 = -1;
               }
           }
           if((k == open1)||(k == open2)){
               img[k].setImageResource(res_img[2]);
               open1 = -1;
               open2 = -1;
           }
       }

    }


    public void newGame()
    {
        int i, t, t2;
        open1 = -1;
        open2 = -1;
        for (i=0; i<field.length; i++){
            t = r.nextInt(100);
            if(t/2*2 == t)
                field[i] = 0;
            else field[i] = 1;
        }

        int a=0, c=-1;

        for (i=0; i<field.length; i++){
            if(field[i] == 0) a++;
            if(field[i] == 1) c = i;
        }

        switch(a){
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            break;
            default:
                field[c] = 0;
            break;
        }




        t = r.nextInt(8);
        res_img[0] = res_template[t];
        t2 = r.nextInt(8);
        if(t2 != t)
            res_img[1] = res_template[t2];
        else {
            for (i = 0; i < res_template.length; i++) {
                if (res_template[i] != res_img[0]) {
                    res_img[1] = res_template[i];
                    i = res_template.length;
                }
            }
        }

        t = r.nextInt(3);
        for(i=0; i<img.length; i++){
            img[i].setVisibility(View.VISIBLE);
            img[i].setImageResource(res_rub[t]);
        }
        res_img[2] = res_rub[t];

        t = r.nextInt(3);
        imageViewBG.setImageResource(res_bg[t]);

        moves = 0;
        BasicText.setText("Moves:"+ " " + moves);
    }

    public void showAbout()
    {
        dialogD.show();
    }
    public void goExit()
    {
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

}