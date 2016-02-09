package com.google.devrel.training.conference;

import com.google.api.server.spi.Constant;

/**
 * Contains the client IDs and scopes for allowed clients consuming the conference API.
 */
public class Constants {
	//09F0SyOeLtcq7FXAfBeftzWb - client sectet
    public static final String WEB_CLIENT_ID = "765894778620-vgg6l6b0ptns0lelm9p3t8pqn4a45o6r.apps.googleusercontent.com";
 //   public static final String ANDROID_CLIENT_ID = "replace this with your Android client ID";
   // public static final String IOS_CLIENT_ID = "replace this with your iOS client ID";
    public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;
    public static final String EMAIL_SCOPE = Constant.API_EMAIL_SCOPE;
    public static final String API_EXPLORER_CLIENT_ID = Constant.API_EXPLORER_CLIENT_ID;

    public static final String MEMCACHE_ANNOUNCEMENTS_KEY = "RECENT_ANNOUNCEMENTS";
}