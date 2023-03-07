package com.example.myapplicationtryingout;

import static com.example.myapplicationtryingout.R.id.id_cookieImage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
    // THINGS THAT STILL NEED TO BE DONE
    // - ein ErsatzButton
    // - Speichern des spielstandes
    // - Animation beim ButtonClick

public class SecondActivity extends AppCompatActivity {
    ImageView cookieImage;
    ImageView button2;
    ImageView button3;
    ImageView button4;
    ImageView button5;
    ImageView button6;
    TextView Number;
    TextView ppsNumber;
    TextView costy1;
    TextView costy2;
    TextView costy3;
    TextView costy4;
    TextView costy5;
    TextView costy6;
    TextView upgrade_cost1;
    TextView upgrade_cost2;
    TextView upgrade_cost3;
    TextView upgrade_cost4;
    TextView upgrade_cost5;
    TextView upgrade_cost6;
    ProgressBar progressBar1;
    ProgressBar progressBar2;
    ProgressBar progressBar3;
    ProgressBar progressBar4;
    ProgressBar progressBar5;
    ProgressBar progressBar6;
    public int Count = 0;
    public int f = 0;
    volatile double cookieInterval = 0;
    Timer timer = new Timer();
    final Handler handler = new Handler();
    private Handler mhandler = new Handler();
    private int proggistatus = 0;
    private int proggistatus2 = 0;
    private int proggistatus3 = 0;
    private int proggistatus4 = 0;
    private int proggistatus5 = 0;
    private int proggistatus6 = 0;

    private int upgrade = 5;
    private int upgrade2 = 10;
    private int upgrade3 = 25;
    private int upgrade4 = 50;
    private int upgrade5 = 75;
    private int upgrade6 = 200;

    private int cost1 = 10;
    private int cost2 = 50;
    private int cost3 = 100;
    private int cost4 = 200;
    private int cost5 = 400;
    private int cost6 = 1000;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        cookieImage = (ImageView) findViewById(id_cookieImage);
        button2 = (ImageView) findViewById(R.id.id_button2);
        button3 = (ImageView) findViewById(R.id.id_button3);
        button4 = (ImageView) findViewById(R.id.id_button4);
        button5 = (ImageView) findViewById(R.id.id_button5);
        button6 = (ImageView) findViewById(R.id.id_button6);
        Number = (TextView) findViewById(R.id.id_count);
        ppsNumber = (TextView) findViewById(R.id.id_cps);
        costy1 = (TextView) findViewById(R.id.costy1);
        costy2 = (TextView) findViewById(R.id.costy2);
        costy3 = (TextView) findViewById(R.id.costy3);
        costy4 = (TextView) findViewById(R.id.costy4);
        costy5 = (TextView) findViewById(R.id.costy5);
        costy6 = (TextView) findViewById(R.id.costy6);
        upgrade_cost1 = (TextView) findViewById(R.id.upgrade_cost1);
        upgrade_cost2 = (TextView) findViewById(R.id.upgrade_cost2);
        upgrade_cost3 = (TextView) findViewById(R.id.upgrade_cost3);
        upgrade_cost4 = (TextView) findViewById(R.id.upgrade_cost4);
        upgrade_cost5 = (TextView) findViewById(R.id.upgrade_cost5);
        upgrade_cost6 = (TextView) findViewById(R.id.upgrade_cost6);

        progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar3 = (ProgressBar) findViewById(R.id.progressBar3);
        progressBar4 = (ProgressBar) findViewById(R.id.progressBar4);
        progressBar5 = (ProgressBar) findViewById(R.id.progressBar5);
        progressBar6 = (ProgressBar) findViewById(R.id.progressBar6);
        int l = 0;
        final int[] m = {l};
        final int[] k = {0};
        progressBar1.setMax(163);       //10s
        progressBar2.setMax(162 * 3);     //30s
        progressBar3.setMax(162 * 6);     //60s
        progressBar4.setMax(162 * 12);    //2min
        progressBar5.setMax(162 * 18);    //3min
        progressBar6.setMax(162 * 30);     //5min

        final ScaleAnimation startAnimation = new ScaleAnimation(0.75f, 1.0f, 0.75f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        startAnimation.setDuration(150);
        final ScaleAnimation gaEnter = new ScaleAnimation(0f, 1.0f, 0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        gaEnter.setDuration(250);
        final ScaleAnimation gaExit = new ScaleAnimation(1f, 0f, 1f, 0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        gaExit.setDuration(250);


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (f < 20) {
                    while (proggistatus < progressBar1.getMax()) {
                        proggistatus++;
                        android.os.SystemClock.sleep(50);
                        mhandler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar1.setProgress(proggistatus);
                            }
                        });
                    }
                    if (proggistatus == progressBar1.getMax()) {
                        Count += upgrade;
                        proggistatus = 0;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (f < 20) {
                    while (proggistatus2 < progressBar2.getMax()) {
                        proggistatus2++;
                        android.os.SystemClock.sleep(50);
                        mhandler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar2.setProgress(proggistatus2);
                            }
                        });
                    }
                    if (proggistatus2 == progressBar2.getMax()) {
                        Count += upgrade2;
                        proggistatus2 = 0;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (f < 20) {
                    while (proggistatus3 < progressBar3.getMax()) {
                        proggistatus3++;
                        android.os.SystemClock.sleep(50);
                        mhandler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar3.setProgress(proggistatus3);
                            }
                        });
                    }
                    if (proggistatus3 == progressBar3.getMax()) {
                        Count += upgrade3;
                        proggistatus3 = 0;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (f < 20) {
                    while (proggistatus4 < progressBar4.getMax()) {
                        proggistatus4++;
                        android.os.SystemClock.sleep(50);
                        mhandler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar4.setProgress(proggistatus4);
                            }
                        });
                    }
                    if (proggistatus4 == progressBar4.getMax()) {
                        Count += upgrade4;
                        proggistatus4 = 0;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (f < 20) {
                    while (proggistatus5 < progressBar5.getMax()) {
                        proggistatus5++;
                        android.os.SystemClock.sleep(50);
                        mhandler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar5.setProgress(proggistatus5);
                            }
                        });
                    }
                    if (proggistatus5 == progressBar5.getMax()) {
                        Count += upgrade5;
                        proggistatus5 = 0;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (f < 20) {
                    while (proggistatus6 < progressBar6.getMax()) {
                        proggistatus6++;
                        android.os.SystemClock.sleep(50);
                        mhandler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar6.setProgress(proggistatus6);
                            }
                        });
                    }
                    if (proggistatus6 == progressBar6.getMax()) {
                        Count += upgrade5;
                        proggistatus6 = 0;
                    }
                }
            }
        }).start();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        if (Count >= cost1) {
                            cookieImage.setVisibility(View.VISIBLE);
                        } else {cookieImage.setVisibility(View.INVISIBLE);
                        }
                        if (Count >= cost2) {
                            button2.setVisibility(View.VISIBLE);
                        } else {button2.setVisibility(View.INVISIBLE);
                        }
                        if (Count >= cost3) {
                            button3.setVisibility(View.VISIBLE);
                        } else {button3.setVisibility(View.INVISIBLE);

                        }
                        if (Count >= cost4) {
                            button4.setVisibility(View.VISIBLE);
                        } else {button4.setVisibility(View.INVISIBLE);
                        }

                        if (Count >= cost5) {
                            button5.setVisibility(View.VISIBLE);
                        } else {button5.setVisibility(View.INVISIBLE);
                        }
                        if (Count >= cost6) {
                            button6.setVisibility(View.VISIBLE);
                        } else {button6.setVisibility(View.INVISIBLE);
                        }
                        Number.setText(cookieChange(Count));
                        ppsNumber.setText(cookieInterval + " PPS");
                        costy1.setText(upgradechange1(upgrade));
                        costy2.setText(upgradechange2(upgrade2));
                        costy3.setText(upgradechange3(upgrade3));
                        costy4.setText(upgradechange4(upgrade4));
                        costy5.setText(upgradechange5(upgrade5));
                        costy6.setText(upgradechange6(upgrade6));
                        upgrade_cost1.setText(costchange1(cost1));
                        upgrade_cost2.setText(costchange2(cost2));
                        upgrade_cost3.setText(costchange3(cost3));
                        upgrade_cost4.setText(costchange4(cost4));
                        upgrade_cost5.setText(costchange5(cost5));
                        upgrade_cost6.setText(costchange6(cost6));
                    }
                });
            }
        }, 0, 500);
        cookieImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(startAnimation);
                upgrade += 1;
                Count -= cost1;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(startAnimation);
                upgrade2 += 5;
                Count -= cost2;

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(startAnimation);
                upgrade3 += 10;
                Count -= cost3;

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(startAnimation);
                upgrade4 += 20;
                Count -= cost4;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(startAnimation);
                upgrade5 += 50;
                Count -= cost5;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(startAnimation);
                upgrade6 += 100;
                Count -= cost6;
            }
        });
    }




    public String cookieChange(int i) {
        if(i==1)
            return i+" POWER";
        else
            return i+" POWER";

    }
    public String upgradechange1(int i) {
        if(i==1)
            return "+ " + upgrade + " POWER";
        else
            return "+ " + upgrade + " POWER";
    }
    public String upgradechange2(int i) {
        if(i==1)
            return "+ " + upgrade2 + " POWER";
        else
            return "+ " + upgrade2 + " POWER";
    }
    public String upgradechange3(int i) {
        if(i==1)
            return "+ " + upgrade3 + " POWER";
        else
            return "+ " + upgrade3 + " POWER";
    }
    public String upgradechange4(int i) {
        if(i==1)
            return "+ " + upgrade4 + " POWER";
        else
            return "+ " + upgrade4 + " POWER";
    }
    public String upgradechange5(int i) {
        if(i==1)
            return "+ " + upgrade5 + " POWER";
        else
            return "+ " + upgrade5 + " POWER";
    }
    public String upgradechange6(int i) {
        if(i==1)
            return "+ " + upgrade6 + " POWER";
        else
            return "+ " + upgrade6 + " POWER";
    }

    public String costchange1(int i) {
        if(i==1)
            return cost1 + " POWER";
        else
            return cost1 + " POWER";
    }
    public String costchange2(int i) {
        if(i==1)
            return cost2 + " POWER";
        else
            return cost2 + " POWER";
    }
    public String costchange3(int i) {
        if(i==1)
            return cost3 + " POWER";
        else
            return cost3 + " POWER";
    }
    public String costchange4(int i) {
        if(i==1)
            return cost4 + " POWER";
        else
            return cost4 + " POWER";
    }
    public String costchange5(int i) {
        if(i==1)
            return cost5 + " POWER";
        else
            return cost5 + " POWER";
    }
    public String costchange6(int i) {
        if(i==1)
            return cost6 + " POWER";
        else
            return cost6 + " POWER";
    }
}

