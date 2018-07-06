package com.google.android.settings.external;

import android.content.Intent;
/*
import com.google.android.settings.external.specialcase.WifiSetting;
import com.google.android.settings.external.specialcase.TakeMeThereSetting;
import com.google.android.settings.external.specialcase.AccessibilitySetting;
import com.google.android.settings.external.specialcase.SwipeToNotificationSetting;
import com.google.android.settings.external.specialcase.ScreenZoomSetting;
import com.google.android.settings.external.specialcase.PickupGestureSetting;
import com.google.android.settings.external.specialcase.NightDisplaySetting;
import com.google.android.settings.external.specialcase.NightDisplayIntensitySetting;
import com.google.android.settings.external.specialcase.NfcSetting;
import com.google.android.settings.external.specialcase.MobileNetworkTakeMeThereSetting;
import com.google.android.settings.external.specialcase.MobileDataSetting;
import com.google.android.settings.external.specialcase.MagnificationSetting;
import com.google.android.settings.external.specialcase.LocationSetting;
import com.google.android.settings.external.specialcase.LocationModeSetting;
import com.google.android.settings.external.specialcase.HotspotSetting;
import com.google.android.settings.external.specialcase.FontSizeSetting;
import com.google.android.settings.external.specialcase.DoNotDisturbSetting;
import com.google.android.settings.external.specialcase.DoubleTwistGestureSetting;
import com.google.android.settings.external.specialcase.DisplayTimeoutSetting;
import com.google.android.settings.external.specialcase.DataSaverSetting;
import com.google.android.settings.external.specialcase.ColorInversionSetting;
import com.google.android.settings.external.specialcase.BluetoothSetting;
import com.google.android.settings.external.specialcase.AutoRotateSetting;
import com.google.android.settings.external.specialcase.AmbientDisplayAlwaysOnSetting;
import com.google.android.settings.external.specialcase.AirplaneModeSetting;
*/
import com.google.android.settings.external.specialcase.ActiveEdgeSetting;
import com.google.android.settings.external.specialcase.ActiveEdgeSensitivitySetting;

public class InlineSettings
{
    public static final ActiveEdgeSensitivitySetting ACTIVE_EDGE_SENSITIVITY_SETTING;
    public static final ActiveEdgeSetting ACTIVE_EDGE_SETTING;
/*
    public static final AirplaneModeSetting AIRPLANE_MODE_SETTING;
    public static final AmbientDisplayAlwaysOnSetting AMBIENT_DISPLAY_ALWAYS_ON_SETTING;
    public static final AutoRotateSetting AUTO_ROTATE_SETTING;
    public static final BluetoothSetting BLUETOOTH_SETTING;
    public static final ColorInversionSetting COLOR_INVERSION_SETTING;
    public static final DataSaverSetting DATA_SAVER_SETTING;
    public static final DisplayTimeoutSetting DISPLAY_TIMEOUT_SETTING;
    public static final DoubleTwistGestureSetting DOUBLE_TWIST_GESTURE_SETTING;
    public static final DoNotDisturbSetting DO_NOT_DISTURB_SETTING;
    public static final FontSizeSetting FONT_SIZE_SETTING;
    public static final HotspotSetting HOTSPOT_SETTING;
    public static final LocationModeSetting LOCATION_MODE_SETTING;
    public static final LocationSetting LOCATION_SETTING;
    public static final MagnificationSetting MAGNIFY_GESTURE_SETTING;
    public static final MagnificationSetting MAGNIFY_NAVBAR_SETTING;
    public static final MobileDataSetting MOBILE_DATA_SETTING;
    public static final MobileNetworkTakeMeThereSetting MOBILE_NETWORK_SETTINGS;
    public static final NfcSetting NFC_SETTING;
    public static final NightDisplayIntensitySetting NIGHTDISPLAY_INTENSITY_SETTING;
    public static final NightDisplaySetting NIGHTDISPLAY_SETTING;
    public static final PickupGestureSetting PICKUP_GESTURE_SETTING;
    public static final ScreenZoomSetting SCREEN_ZOOM_SETTING;
    public static final SwipeToNotificationSetting SWIPE_TO_NOTIFICATION_SETTING;
    public static final AccessibilitySetting SWITCH_ACCESS_SETTING;
    public static final TakeMeThereSetting SYSTEM_UPDATE_SETTING;
    public static final AccessibilitySetting TALKBACK_SETTING;
    public static final WifiSetting WIFI_SETTING;
*/
    static {
        ACTIVE_EDGE_SETTING = new ActiveEdgeSetting();
        ACTIVE_EDGE_SENSITIVITY_SETTING = new ActiveEdgeSensitivitySetting();
/*
        AIRPLANE_MODE_SETTING = new AirplaneModeSetting();
        AMBIENT_DISPLAY_ALWAYS_ON_SETTING = new AmbientDisplayAlwaysOnSetting();
        AUTO_ROTATE_SETTING = new AutoRotateSetting();
        BLUETOOTH_SETTING = new BluetoothSetting();
        COLOR_INVERSION_SETTING = new ColorInversionSetting();
        DATA_SAVER_SETTING = new DataSaverSetting();
        DISPLAY_TIMEOUT_SETTING = new DisplayTimeoutSetting();
        DO_NOT_DISTURB_SETTING = new DoNotDisturbSetting();
        DOUBLE_TWIST_GESTURE_SETTING = new DoubleTwistGestureSetting();
        FONT_SIZE_SETTING = new FontSizeSetting();
        HOTSPOT_SETTING = new HotspotSetting();
        LOCATION_SETTING = new LocationSetting();
        LOCATION_MODE_SETTING = new LocationModeSetting();
        MOBILE_DATA_SETTING = new MobileDataSetting();
        MOBILE_NETWORK_SETTINGS = new MobileNetworkTakeMeThereSetting();
        NFC_SETTING = new NfcSetting();
        NIGHTDISPLAY_INTENSITY_SETTING = new NightDisplayIntensitySetting();
        NIGHTDISPLAY_SETTING = new NightDisplaySetting();
        PICKUP_GESTURE_SETTING = new PickupGestureSetting();
        SCREEN_ZOOM_SETTING = new ScreenZoomSetting();
        SYSTEM_UPDATE_SETTING = new TakeMeThereSetting(new Intent("android.settings.SYSTEM_UPDATE_SETTINGS").toUri(0));
        TALKBACK_SETTING = new AccessibilitySetting("talkback", "com.google.android.marvin.talkback/com.google.android.marvin.talkback.TalkBackService");
        SWIPE_TO_NOTIFICATION_SETTING = new SwipeToNotificationSetting();
        SWITCH_ACCESS_SETTING = new AccessibilitySetting("switch_access", "com.google.android.marvin.talkback/com.android.switchaccess.SwitchAccessService");
        WIFI_SETTING = new WifiSetting();
        MAGNIFY_GESTURE_SETTING = new MagnificationSetting("magnify_gesture", "accessibility_display_magnification_enabled");
        MAGNIFY_NAVBAR_SETTING = new MagnificationSetting("magnify_navbar", "accessibility_display_magnification_navbar_enabled");
*/
    }
}
