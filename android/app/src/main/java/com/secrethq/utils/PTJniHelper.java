

package com.secrethq.utils;

public class PTJniHelper {
	public static String password() {
		return "Snmpc83741lPfP4jyaixD0ov+nKVr7ZZGX/xcM6nvVgZK/pwmK22Xhsr/yeUq7JZT3uqL52v5AoWe/9ym6vgWA==";
	}
	public static native boolean isAdNetworkActive( String name ); 
    public static native String jsSettingsString();
    
    public static native void setSettingsValue(String path, String value);
    public static native String getSettingsValue(String path);
}
