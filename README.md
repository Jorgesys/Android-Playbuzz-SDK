# Android-Playbuzz-SDK
Example using [playbuzz SDK](https://github.com/Shailevy/PlaybuzzSDK)



# Usage
The SDK provides you with an PlaybuzzWebView that works like any other WebView except when you want to load a Playbuzz item into it.

    <com.playbuzz.android.sdk.PlaybuzzWebView
        android:id="@+id/pbwebview"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
You'll need itemAlies - the url suffix of your item

url

In your code after you obtain the PlaybuzzWebView you should call it's 'loadItem(...)' function:

        PlaybuzzWebView pbWebView = (PlaybuzzWebView) findViewById(R.id.pbwebview);
        pbWebView.loadItem("http://www.example.com",
                "shpaltman/10-best-commercials-for-the-olympic-games-rio-2016",
                true);
companyDomain - the domain configered for your compony
itemAlies - the url suffix of your item
showItemInfo - show or hide item title and description
And that's it, The Playbuzz item will be rendred in the view you used

License
PlaybuzzSDK for Android is available under the MIT license. See the LICENSE file for more info.
