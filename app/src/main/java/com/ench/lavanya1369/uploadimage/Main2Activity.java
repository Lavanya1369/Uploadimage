//package com.ench.lavanya1369.uploadimage;
//
//import android.app.Dialog;
//import android.content.DialogInterface;
//import android.graphics.drawable.ColorDrawable;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.Window;
//import android.widget.ImageView;
//
//public class Main2Activity extends AppCompatActivity {
//    private ImageView profile_pic, pro;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        profile_pic = (ImageView) findViewById(R.id.img_View);
//        pro = (ImageView) findViewById(R.id.go_pro);
//        pro.setOnTouchListener(mTouchListener);
//        profile_pic.setOnTouchListener(mTouchListener);
//        profile_pic = (ImageView) findViewById(R.id.img_View);
//        pro = (ImageView) findViewById(R.id.go_pro);
//        pro.setOnTouchListener(mTouchListener);
//        profile_pic.setOnTouchListener(mTouchListener);
//    }
//
//    private View.OnTouchListener mTouchListener = new View.OnTouchListener() {
//        @Override
//        public boolean onTouch(View v, MotionEvent event) {
//            Dialog builder = new Dialog(Main2Activity.this);
//            builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            builder.getWindow().setBackgroundDrawable(
//                    new ColorDrawable(android.graphics.Color.TRANSPARENT));
//            builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
//                @Override
//                public void onDismiss(DialogInterface dialogInterface) {
////nothing;
//                }
//            });
////            private View.OnTouchListener mTouchListener = new View.OnTouchListener() {
////                @Override
////                public boolean onTouch(View v, MotionEvent event) {
////                    Dialog builder = new Dialog(Main2Activity.this);
////                    builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
////                    builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
////                    builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
////                        @Override
////                        public void onDismiss(DialogInterface dialogInterface) {
////                            //nothing; } });
////                        }
////                    });
////                    int a = v.getId();
////                    if (R.id.go_pro == a) {
////                        uri = Uri.parse("android.resource://" + getPackageName() + "/drawable/pro"); //path of image
////                    }
////                    int a = v.getId();
////                    if (R.id.go_pro == a) {
////                        uri = Uri.parse("android.resource://" + getPackageName() + "/drawable/pro"); //path of image }
////
////                    }
////                }
////            }
//        }
//    }
//
//
//
//
//}
