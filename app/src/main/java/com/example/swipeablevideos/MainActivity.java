package com.example.swipeablevideos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);
        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemCelebration = new VideoItem();
        videoItemCelebration.videoURL = "http://ak-sgp-cdn.snackvideo.in/upic/2021/02/13/19/BMjAyMTAyMTMxOTM5MjVfMTUwMDAwNTEyOTAzMDY2XzE1MDAwMTIxNzQ4MDkwMV8yXzM=_b_Bb577e3f9c87481db1b5df7d91684b314.mp4?tag=1-1618254750-s-0-mrmgnjxhlb-a2bf7abd6d51529b";
        videoItemCelebration.videoTitle = "Celebration";
        videoItemCelebration.videoDescription = "Yayyyyy!";
        videoItems.add(videoItemCelebration);

        VideoItem videoItemParty = new VideoItem();
        videoItemParty.videoURL = "http://ak-sgp-cdn.snackvideo.in/upic/2021/02/13/19/BMjAyMTAyMTMxOTM5MjVfMTUwMDAwNTEyOTAzMDY2XzE1MDAwMTIxNzQ4MDkwMV8yXzM=_b_Bb577e3f9c87481db1b5df7d91684b314.mp4?tag=1-1618254750-s-0-mrmgnjxhlb-a2bf7abd6d51529b";
        videoItemParty.videoTitle = "Party";
        videoItemParty.videoDescription = "Party";
        videoItems.add(videoItemParty);


        VideoItem videoItemFun = new VideoItem();
        videoItemFun.videoURL = "http://ak-ind-cdn.snackvideo.in/upic/2021/03/13/14/BMjAyMTAzMTMxNDEzMzlfMTUwMDAwNTA0NzAxODE3XzE1MDAwMTIzODQ4NTQxNF8wXzM=_b_Bcc9b38b44bdc85d4ef3d8e756be7cb5f.mp4?tag=1-1618597038-s-0-0fznid5nls-daa52c30ec633a86";
        videoItemFun.videoTitle = "Fun";
        videoItemFun.videoDescription = "Always do fun";
        videoItems.add(videoItemFun);

        videosViewPager.setAdapter(new VideosAdapter(videoItems));
    }
}