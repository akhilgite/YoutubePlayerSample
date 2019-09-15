package com.dextrous.youtubeplayersample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeFailureRecoveryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(DeveloperKey.DEVELOPER_KEY,this);
    }

    @Override
    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return findViewById(R.id.youtube_view);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b){
            //https://www.youtube.com/watch?v=2r-8xXXgpfU
            youTubePlayer.cueVideo("2r-8xXXgpfU");
        }
    }
}
