# BottomNavigationBarDemo
This is the demo of how you can implement new [Bottom Navigation Bar](https://developer.android.com/reference/android/support/design/widget/BottomNavigationView.html) with Elevation and Ripple effect

![](http://i.imgur.com/QNof9QY.gif)

First of all use `compile 'com.android.support:design:25.0.1'` and then you can add `BottomNavigationView` in your layout.

    <android.support.design.widget.BottomNavigationView
        android:id="@+id/bottom_navigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:background="@android:color/white"
        app:elevation="16dp"
        app:itemIconTint="@drawable/nav_item_color_state"
        app:itemTextColor="@drawable/nav_item_color_state"
        app:menu="@menu/bottom_navigation_main" />
        
It only works if you set white color for background `android:background="@android:color/white"`

**Note** that ripple effect will disappear if you use `app:itemBackground` property.

***Handling enabled/disabled state:***

You need to create selector file: 

    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
        <item android:state_checked="true" android:color="@color/colorPrimary" />
        <item android:color="@android:color/darker_gray"  />
    </selector>



If you want change standard grey ripple effect, change `colorControlHighlight` property in AppTheme so it looks like following:

    
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        <item name="colorControlHighlight">@color/colorPrimaryRipple</item>
    </style>

Use 26% alpha for colored ripples.
    
    <color name="colorPrimary">#3F51B5</color>
    <color name="colorPrimaryRipple">#423F51B5</color>
