package com.example.myapp;

import android.os.Bundle;
import androidx.annotation.OptIn;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

@UnstableApi
public class MainActivity extends AppCompatActivity {

    private ExoPlayer player;
    private PlayerView playerView;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerView = findViewById(R.id.player_view);
        initializePlayer();
    }

    private void initializePlayer() {
        // ১. প্লেয়ার তৈরি
        player = new ExoPlayer.Builder(this).build();
        playerView.setPlayer(player);

        // ২. মিডিয়া আইটেম তৈরি (HLS, DASH বা DRM এর জন্য)
        // উদাহরণস্বরূপ একটি DASH লিঙ্ক এবং DRM কনফিগারেশন:
        MediaItem mediaItem = new MediaItem.Builder()
                .setUri("YOUR_VIDEO_URL_HERE") // এখানে আপনার HLS (.m3u8) বা DASH (.mpd) লিঙ্ক দিন
                .setDrmConfiguration(
                        new MediaItem.DrmConfiguration.Builder(androidx.media3.common.C.WIDEVINE_UUID)
                                .setLicenseUri("YOUR_DRM_LICENSE_URL") // DRM লাইসেন্স ইউআরএল (যদি থাকে)
                                .build())
                .build();

        // ৩. প্লেয়ারে মিডিয়া সেট করা এবং শুরু করা
        player.setMediaItem(mediaItem);
        player.prepare();
        player.play();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (player != null) {
            player.release();
            player = null;
        }
    }
}