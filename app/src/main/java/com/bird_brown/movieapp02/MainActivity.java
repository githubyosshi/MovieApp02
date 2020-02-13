package com.bird_brown.movieapp02;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //動画ファイルの場所を設定
        String uri = "https://www.wowow.co.jp/naomiosakamovie/";

        //VideoViewのオブジェクトを取得
        VideoView video = (VideoView)findViewById(R.id.videoView1);

        //VideoViewにフォーカスをあてる
        video.requestFocus();

        //VideoViewにMediaControllerを設定
        video.setMediaController(new MediaController(this));

        //動画ファイルを読み込み設定
        video.setVideoURI(Uri.parse(uri));

        //動画再生
        video.start();
    }
}
