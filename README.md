# curvedBottomNavigation
[![](https://jitpack.io/v/sad-adnan/curvedBottomNavigation.svg)](https://jitpack.io/#sad-adnan/curvedBottomNavigation)
<h1>Curved Bottom Navigation Menu</h1>
<h2>An Android Library developed by <a href="https://github.com/zakir-github">zakir-github</a> </h2>

in xml :

         <com.sadadnan.curvedbottomnavigationlib.CurvedBottomNavigation
              android:id="@+id/custom"
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:layout_alignParentBottom="true"
              app:labelVisibilityMode="labeled"
              app:itemIconTint="@color/white"
              app:itemTextColor="@color/white"/>
        
        
 Code : 
 
           CurvedBottomNavigation curvedBottomNavigation = findViewById(R.id.custom);
           curvedBottomNavigation.inflateMenu(R.menu.bottom_menu);
           
