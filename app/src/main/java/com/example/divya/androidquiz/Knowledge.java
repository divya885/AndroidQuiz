package com.example.divya.androidquiz;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Knowledge extends AppCompatActivity {

    TextView knowledgeScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);

        knowledgeScroll = (TextView)findViewById(R.id.knowledge_scroll);

        String s = "Q1. What method you should override to use Android menu\n" +
                "system?\n" +
                "a. onCreateOptionsMenu()\n" +
                "b. onCreateMenu()\n" +
                "c. onMenuCreated()\n" +
                "d. onCreateContextMenu()\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q2. What Activity method you use to retrieve a reference to an\n" +
                "Android view by using the id attribute of a resource XML?\n" +
                "a. findViewByReference(int id);\n" +
                "b. findViewById(int id)\n" +
                "c. retrieveResourceById(int id)\n" +
                "d. findViewById(String id)\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q3. Which of the following is not an Android component (i.e. a\n" +
                "point from which the system can enter your application)?\n" +
                "a. Service\n" +
                "b. Activity\n" +
                "c. Layout\n" +
                "d. Content Provider\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q4. During an Activity life-cycle, what is the first callback method\n" +
                "invoked by the system?\n" +
                "a. onStop()\n" +
                "b. onStart()\n" +
                "c. onCreate()\n" +
                "d. onRestore()\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q5. Which configuration file holds the permission to use the\n" +
                "internet?\n" +
                "a. Layout file\n" +
                "b. Property file\n" +
                "c. Java source file\n" +
                "d. Manifest file\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q6. What does the following line of code achieve?\n" +
                "Intent intent = new Intent(FirstActivity.this,\n" +
                "SecondActivity.class );\n" +
                "a. Creates an hidden Intent\n" +
                "b. Creates an implicit Intent\n" +
                "c. Create an explicit Intent\n" +
                "d. Starts an activity.\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q7. Which of the following is NOT a valid usage for Intents?\n" +
                "a. Activate and Activity\n" +
                "b. Activate a Service\n" +
                "c. Activate a Broadcast receiver\n" +
                "d. Activate a SQLite DB Connection.\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q8. Which of the following is not a valid Android resource file\n" +
                "name?\n" +
                "a. mylayout.xml\n" +
                "b. myLayout.xml\n" +
                "c. my_layout.xml\n" +
                "d. mylayout1.xml\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q9. Which of these is not defined as a process state?\n" +
                "a. Non-visible\n" +
                "b. Visible\n" +
                "c. Foreground\n" +
                "d. Background\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q10. What is the name of the folder that contains the R.java file?\n" +
                "a. src\n" +
                "b. res\n" +
                "c. bin\n" +
                "d. gen\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q11. What is a correct statement about an XML layout file?\n" +
                "a. A layout PNG image file\n" +
                "b. A file used to draw the content of an Activity\n" +
                "c. A file that contains all application permission information\n" +
                "d. A file that contains a single activity widget.\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q12. What does the src folder contain?\n" +
                "a. Image and icon files\n" +
                "b. XML resource files\n" +
                "c. The application manifest file\n" +
                "d. Java source code files\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q13. Which file specifies the minimum required Android SDK\n" +
                "version your application supports?\n" +
                "a. main.xml\n" +
                "b. R.java\n" +
                "c. strings.xml\n" +
                "d. AndroidManifest.xml\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q14. What is the parent class of all Activity widgets?\n" +
                "a. ViewGroup\n" +
                "b. Layout\n" +
                "c. View\n" +
                "d. Widget\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q15.What is the name of the class used by Intent to store\n" +
                "additional information?\n" +
                "a. Extra\n" +
                "b. Parcelable\n" +
                "c. Bundle\n" +
                "d. DataStore\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q16. Which is not included in the Android application framework?\n" +
                "a. WindowManager\n" +
                "b. NotificationManager\n" +
                "c. DialerManager\n" +
                "d. PackageManager\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q17.What Eclipse plugin is required to develop Android\n" +
                "application?\n" +
                "a. J2EE\n" +
                "b. Android Software Development Kit\n" +
                "c. Android Development Tools\n" +
                "d. Web Development Tools\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q18.You can create a custom view by extending class Activity.\n" +
                "a. True\n" +
                "b. False\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q19.Which of these files contains text values that you can use in\n" +
                "your application?\n" +
                "a. AndroidManifest.xml\n" +
                "b. res/Text.xml\n" +
                "c. res/layout/Main.xml\n" +
                "d. res/values/strings.xml\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q20. What does the Android project folder “res/” contain?\n" +
                "a. Java Activity classes\n" +
                "b. Resource files\n" +
                "c. Java source code\n" +
                "d. Libraries\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q21. What does this code do?\n" +
                "Intent intent = new Intent();\n" +
                "intent.setAction(Intent.ACTION_VIEW);\n" +
                "intent.setData(android.net.Uri.parse(\"http://www.androidatc.com\"));\n" +
                "startActivity(intent);\n" +
                "a. Starts a sub-activity\n" +
                "b. Starts a service\n" +
                "c. Sends results to another activity.\n" +
                "d. Starts an activity using an implicit intent.\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q22. Which of the following is a Java call-back method invoked\n" +
                "when a view is clicked?\n" +
                "a. Detector\n" +
                "b. OnTapListener\n" +
                "c. OnClickDetector\n" +
                "d. OnClickListener\n"  +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q23.Which of the following is not an Activity lifecycle call-back\n" +
                "method?\n" +
                "a. onStart\n" +
                "b. onCreate\n" +
                "c. onPause\n" +
                "d. onBackPressed\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q24.Which method is used to close an activity?\n" +
                "a. Destroy( )\n" +
                "b. Finish( )\n" +
                "c. Stop( )\n" +
                "d. Close( )\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q25. Which of the following Activity life-cycle methods is called once the\n" +
                "activity is no longer visible?\n" +
                "a. onStop\n" +
                "b. onPause\n" +
                "c. onDestroy\n" +
                "d. onHide\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q26. Which of the following is a correct Android Manifest\n" +
                "statement?\n" +
                "a. <uses-permission android:name =”android.Internet”/>\n" +
                "b. <uses-permission android:name =”android.Internet”></uses-permission>\n" +
                "c. <uses-permission android:name =”android.permission.Internet”>\n" +
                "d. <uses-permission android:name =”android. permission .Internet”/>\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q27.Which of the following is true about attribute\n" +
                "android:windowSoftInputMode of the <activity> tag in file\n" +
                "AndroidManifest.xml?\n" +
                "a. It specifies whether the window is in full screen or not\n" +
                "b. It adjusts how the main window of the activity interacts with keyboard\n" +
                "c. It adjusts how the window should be launched\n" +
                "d. It adjusts the window orientation\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q28. Which of the following tools dumps system log messages\n" +
                "including stack traces when the device or emulator throws an\n" +
                "error?\n" +
                "a. DDMS\n" +
                "b. Logcat\n" +
                "c. Console\n" +
                "d. ADB\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q29. Javascript is enabled by default in a WebView\n" +
                "a. True\n" +
                "b. False\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q30. How to enable JavaScript in WebView?\n" +
                "a. myWebView. setJavaScriptEnabled(true);\n" +
                "b. myWebView.getJavaScriptSettings.setEnabled(true)\n" +
                "c. myWebView.getSettings().setJavaScriptEnabled(true);\n" +
                "d. Java script is always enabled in WebView\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q31.What does the following code achieve?\n" +
                "Intent intent = new Intent(FirstActivity.this, SecondActivity.class);\n" +
                "startActivityForResult(intent);\n" +
                "a. Starts a browser activity\n" +
                "b. Starts a sub-activity\n" +
                "c. Starts an activity service\n" +
                "d. Sends results to another activity.\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q32. When using an implicit intent, what process does the system use to\n" +
                "know what to do with it?\n" +
                "a. Intent resolution\n" +
                "b. Intent declaration\n" +
                "c. Intent overloading\n" +
                "d. Intent transition\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q33.Which of the following is NOT true about the MenuItem interface?\n" +
                "a. The MenuItem instance will be returned by the Menu class add(...) method.\n" +
                "b. MenuItem can decide the Intent issued when clicking menu components.\n" +
                "c. MenuItem can display either an icon or text.\n" +
                "d. MenuItem can set a checkbox.\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q34. Which of the following is correct about XML layout files?\n" +
                "a. In order to display a Ul defined in the XML layout file \"main.xml\", call the\n" +
                "setContentView method of the Activity with the parameter string “main.xml\".\n" +
                "b. There is no distinction between implementation of the layout definition by code, or by\n" +
                "XML layout file.\n" +
                "c. In an Eclipse project using the ADT plugin, the XML layout file is found in the /res/layout\n" +
                "directory.\n" +
                "d. Layout information written in the XML layout file will be converted into code by the\n" +
                "Android platform when the screen is displayed.\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q35. The DalvikVM core libraries are a subset of which of the following?\n" +
                "a. Java ME\n" +
                "b. Java SE\n" +
                "c. Java EE\n" +
                "d. JAX-WS\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q36. Which of the following is correct about file access in the Android\n" +
                "system?\n" +
                "a. Generally, files are handled as dedicated resources per each application.\n" +
                "b. Files created by an application can be directly accessed by any application.\n" +
                "c. The content of file created by application cannot be accessed by any other\n" +
                "application.\n" +
                "d. You can only access a file from within an Activity.\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q37. Which is the correct explanation of ListView?\n" +
                "a. It is necessary to use ListView as a set with ListActivity.\n" +
                "b. You cannot use a ListView when there is no information to be displayed.\n" +
                "c. When displaying a list of Strings using an ArrayAdapter class in ListView, you must save\n" +
                "the value in an ArrayList..\n" +
                "d. ListView has a function to display a list of uniquely defined Views other than TextView.\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q38. Which of following is incorrect about the Toast class?\n" +
                "a. You cannot set a custom layout for a Toast.\n" +
                "b. A Toast can only create by an Activity class\n" +
                "c. There is no need to close or hide a Toast, since it closes automatically.\n" +
                "d. A Toast is displayed for only one of the following periods:\n" +
                "Toast.LENGTH_SHORT or Toast.LENGTH_LONG\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q39. Which of the following is not a ContentProvider provided natively by\n" +
                "Android?\n" +
                "a. The contacts list\n" +
                "b. The telephone log\n" +
                "c. The bookmarks\n" +
                "d. The application list\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q40. When creating a file using\n" +
                "android.content.Context.openFileOutput(\"test.txt\", 0), where is the file\n" +
                "created?\n" +
                "a. /data/app/<package name>/files\n" +
                "b. /data/data/<package name>/files\n" +
                "c. /system/app/<package name>/files\n" +
                "d. /system/data/<package name>/files\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q41. Which of the following is incorrect about the LogCat tool?\n" +
                "a. A LogCat view is available as part of the ADT plugin of Eclipse\n" +
                "b. You can create a log in your application using Log.v(String, String)\n" +
                "c. Each log message has a tag\n" +
                "d. Only one of your application can create log entries, and it should be component class\n" +
                "(Activity, Service,...etc)\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q42. Which of the following information is not included in the Manifest file?\n" +
                "a. The activities contained in the application\n" +
                "b. The permissions required by the application\n" +
                "c. The application’s minimum SDK version required.\n" +
                "d. The handset model compatible with your application.\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q43. Which method should you use to start a sub-activity?\n" +
                "a. startActivity(Intent intent)\n" +
                "b. startActivityForResult(Intent intent)\n" +
                "c. startService(Intent intent)\n" +
                "d. startSubActivity(Intent intent)\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q44. Which package of the following does not have classes needed for\n" +
                "Android network connections?\n" +
                "a. java.net\n" +
                "b. org.apache.http\n" +
                "c. android.location\n" +
                "d. android.net\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Answer: BQ46. Which of the following tools creates certificates for signing Android\n" +
                "applications?\n" +
                "a. adb\n" +
                "b. logcat\n" +
                "c. keytool\n" +
                "d. certgen\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q47. Which manifest file permission you should add to allow your\n" +
                "application to read the device’s address book?\n" +
                "a. READ_ADDRESS_DATA\n" +
                "b. READ_PHONE_STATE\n" +
                "c. READ_PHONE_CONTACTS\n" +
                "d. READ_CONTACTS\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q48. You can create a custom view by extending class:\n" +
                "a. android.widget.View\n" +
                "b. android.widget.LinearLayout\n" +
                "c. android.view.View\n" +
                "d. android.content.Context\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q49. In which Activity life-cycle method you should do all of your normal\n" +
                "static set up such as: creating views and bind data to lists?\n" +
                "a. onResume()\n" +
                "b. onStart()\n" +
                "c. onCreate()\n" +
                "d. onPause()\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q50. Which of the following lines of code starts activity Activity2 from a\n" +
                "current activity Activity1?\n" +
                "a. Intent intent = new Intent(this,new Activity2());\n" +
                "   startActivity(intent);\n" +
                "b. Intent intent = new Intent(new Activity2());\n" +
                "   startActivity(intent);\n" +
                "c. Intent intent = new Intent (Activity1.class,Activity2.class);\n" +
                "   startActivity(intent);\n" +
                "d. Intent intent = new Intent(this,Activity2.class);\n" +
                "   startActivity(intent);\n" +
                "Answer: d\n" +
                "\n" +
                "\n" +
                "Q51. Which of the following methods is called in an Activity when another\n" +
                "activity gets into the foreground?\n" +
                "a. onStop( )\n" +
                "b. onPause( )\n" +
                "c. onDestroy( )\n" +
                "d. onExit( )\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q52.Which of the following attributes is used to set an activity screen to\n" +
                "landscape orientation?\n" +
                "a. screenorientation = landscape\n" +
                "b. screenOrientation=”landscape”\n" +
                "c. android:ScreenOrientation=“landscape”\n" +
                "d. android:screenOrientation=”landscape”\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q53. What is not true about the AndroidManifest.xml file?\n" +
                "a. It declares the views used within the application\n" +
                "b. It declares user permissions the application requires\n" +
                "c. It declares application components\n" +
                "d. It declares hardware and software features used within the application\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q54. If your application is throwing exception\n" +
                "android.content.ActivityNotFoundException, how to fix it?\n" +
                "a. Create a new activity Java sub-class.\n" +
                "b. Rename your activity\n" +
                "c. Create the activity layout\n" +
                "d. Add the activity to the AndroidManifest\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q55. Consider the following code:\n" +
                "Intent intent = new Intent();\n" +
                "intent.setAction(Intent.ACTION_VIEW);\n" +
                "intent.setData(android.net.Uri.parse(\"http://www.androidatc.com\"));\n" +
                "startActivity(intent);\n" +
                "Which of the following is correct about the code above?\n" +
                "a. It sends a result to a new Activity in a Bundle.\n" +
                "b. It will not compile without adding the INTERNET permission the Manifest file.\n" +
                "c. It starts any activity in the application that has a WebView in its layout.\n" +
                "d. When it is executed, the system starts an intent resolution process to start the right\n" +
                "Activity.\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q56. Which of the following is not true about <activity> tag in\n" +
                "AndroidManifest file?\n" +
                "a. Declares an activity that implements part of the application's visual user interface.\n" +
                "b. Contained in <application> tag.\n" +
                "c. Declares a single hardware or software feature that is used by the application.\n" +
                "d. Has an attribute that specifies the name of the Activity sub-class that implements the\n" +
                "activity.\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q57. Which of the following Android View sub-classes uses the WebKit\n" +
                "rendering engine to display web pages?\n" +
                "a. PageView\n" +
                "b. WebView\n" +
                "c. MapView\n" +
                "d. HttpClient\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q58. Which of the following lines of codes adds zoom controls to a\n" +
                "WebView?\n" +
                "a. webView.getSettings().setBuiltInZoomControls(true);\n" +
                "b. webView.getSettings().setZoomControls(true);\n" +
                "c. webView.getZoomSettings().setControls(CONTROLS.enabled);\n" +
                "d. Zoom controls are included by default in WebViews.\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q59. Which of the following best explains the Android option menus?\n" +
                "a. It is a popup menu that displays a list of items in a vertical list anchored to the view that\n" +
                "invoked the menu.\n" +
                "b. It is a floating menu that appears when the user performs a long-click on an element. It\n" +
                "provides actions that affect the selected content or context frame.\n" +
                "c. It is the primary collection of menu items for an activity where you should place actions\n" +
                "that have a global impact on the app, such as \"Search,\" \"Compose email,\" and\n" +
                "\"Settings.\"\n" +
                "d. It is a type of List Activity with predefined headers and footers for special commands.\n" +
                "Answer: c\n" +
                "\n" +
                "\n" +
                "Q60. Which of the following best explains the Android context menus?\n" +
                "a. It is a popup menu displays a list of items in a vertical list that's anchored to the view\n" +
                "that invoked the menu.\n" +
                "b. It is a floating menu that appears when the user performs a long-click on an element. It\n" +
                "provides actions that affect the selected content or context frame.\n" +
                "c. It is the primary collection of menu items for an activity. It's where you should place\n" +
                "actions that have a global impact on the app, such as \"Search,\" \"Compose email,\" and\n" +
                "\"Settings.\"\n" +
                "d. It is a sub-menu of an options menu item.\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q61. Which of the following applies a context menu on a ListView?\n" +
                "(Choose two)\n" +
                "a. ListView lv = getListView();\n" +
                "   lv.registerForContextMenu()\n" +
                "b. ListView lv= getListView();\n" +
                "   registerForContextMenu(lv);\n" +
                "c. ListView lv = (ListView) findViewById(R.id.list_view_id);\n" +
                "   registerForContextMenu(lv)\n" +
                "d. getListView().setContextMenuEnabled(true)\n" +
                "Answer: B & C\n" +
                "\n" +
                "\n" +
                "Q62. Consider the following code :\n" +
                "@Override\n" +
                "public void onCreateContextMenu(ContextMenu menu, View v,\n" +
                "ContextMenuInfo menuInfo) {\n" +
                "super.onCreateContextMenu(menu, v, menuInfo);\n" +
                "menu.setHeaderTitle(\"Menu\");\n" +
                "AdapterContextMenuInfo cmi = (AdapterContextMenuInfo) menuInfo;\n" +
                "menu.add(1, cmi.position, 0, \"Open file\");\n" +
                "menu.add(2, cmi.position, 0, \"Save file\");\n" +
                "}\n" +
                "\n" +
                "Which of the following best explains the code above?\n" +
                "a. The code inflates an xml file into menu items\n" +
                "b. The code creates menu items for context menu programmatically\n" +
                "c. The code assign actions to menu items\n" +
                "d. The code Opens a menu resource file, modifies it, and saves the changes.\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q63. Which of the following does NOT correctly describe interface\n" +
                "android.widget.Adapter?\n" +
                "a. It is an object that acts as a bridge between a View and underlying data for that view.\n" +
                "b. It provides access to the data items.\n" +
                "c. It provides access to deprecated ListView methods.\n" +
                "d. It is responsible for making a View for each item in the data set.\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q64.Which of the following methods updates a ListView when an element\n" +
                "is added to the data set?\n" +
                "a. notify( )\n" +
                "b. notifyAll( )\n" +
                "c. notifyDataSetChanged( )\n" +
                "d. notifyDataSetInvalidate( )\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q65. The values of which of the following classes cannot be mapped in a\n" +
                "Bundle object?\n" +
                "a. Parcelable\n" +
                "b. String\n" +
                "c. ArrayList\n" +
                "d. Context\n" +
                "Answer: D\n" +
                "\n" +
                "\n" +
                "Q66. Which of the following is true about method startActivity?\n" +
                "a. It starts a new activity and destroys the previous one\n" +
                "b. It starts a new activity and sends the previous one to the background.\n" +
                "c. It starts a new activity and pauses the previous one.\n" +
                "d. It starts a new activity in a paused mode.\n" +
                "Answer: B\n" +
                "\n" +
                "\n" +
                "Q67. Which of the following are primary pieces of information that are\n" +
                "required to define in an implicit Intent?\n" +
                "a. An action to be performed and data to operate on.\n" +
                "b. An action to be performed and a category for additional information.\n" +
                "c. A Bundle for extra data.\n" +
                "d. A category of additional information and data to operate on.\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q68. When is the intent resolution process triggered?\n" +
                "a. When the system receives an implicit intent to start an activity.\n" +
                "b. When an explicit intent starts a service.\n" +
                "c. When the system receives an explicit intent to start an activity.\n" +
                "d. When the application calls method startActivityIntentResolution.\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q69. Which of the following applies to the onDraw() method of class View?\n" +
                "(Choose two)\n" +
                "a. It must be overridden if a customize drawing of a view is required.\n" +
                "b. It takes two parameters: a Canvas and a View.\n" +
                "c. It takes one parameter of type Canvas.\n" +
                "d. It uses the Canvas parameter to draw the border of the activity that contains it.\n" +
                "Answer: A & C\n" +
                "\n" +
                "\n" +
                "Q70. Which of the following you cannot achieve by creating your own View\n" +
                "sub-classes?\n" +
                "a. Create a completely new customized View type.\n" +
                "b. Combine a group of View components into a new single component.\n" +
                "c. Specify when to destroy an activity and all its views.\n" +
                "d. Override the way that an existing component is displayed on the screen.\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q71. Which of the following is required to allow the Android Developer\n" +
                "Tools to interact with your view?\n" +
                "a. Provide a constructor that takes a Context and an AttributeSet object as parameters.\n" +
                "b. Provide a constructor that takes a Context object as parameter.\n" +
                "c. Extend class View.\n" +
                "d. Override method onDraw() of class View.\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q72. What are the main two types of thread in Android?\n" +
                "a. Main thread and worker threads.\n" +
                "b. Main thread and UI thread.\n" +
                "c. Activities and services.\n" +
                "d. Main thread and background process.\n" +
                "Answer: A\n" +
                "\n" +
                "\n" +
                "Q73. Which of the following AsyncTask methods is NOT executed on the\n" +
                "UI thread?\n" +
                "a. onPreExecute()\n" +
                "b. onPostExecute()\n" +
                "c. publishProgress()\n" +
                "d. onProgressUpdate()\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q74. Which of the following is NOT true about method getWindow() of\n" +
                "class Dialog do?\n" +
                "a. It retrieves the current window for the activity.\n" +
                "b. It can be used to access parts of the Windows API.\n" +
                "c. It displays the dialog on the screen.\n" +
                "d. It returns null if the activity is not visual.\n" +
                "Answer: C\n" +
                "\n" +
                "\n" +
                "Q75. Which of the following is true about the Dialog class? (Choose two)\n" +
                "a. You can add a custom layout to a dialog using setContentView().\n" +
                "b. A dialog has a life-cycle independent of the Activity.\n" +
                "c. A dialog is displayed on the screen using method show().\n" +
                "d. It does not have a method to access the activity that owns it.\n" +
                "Answer: A & C";

        knowledgeScroll.setText(s);
    }
}

