package com.example.divya.androidquiz;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;


public class QuizQuestionsDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "Quiz_Questions_Table";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_QUESTION = "Question";
    public static final String COLUMN_OPTION1 = "Option1";
    public static final String COLUMN_OPTION2 = "Option2";
    public static final String COLUMN_OPTION3 = "Option3";
    public static final String COLUMN_OPTION4 = "Option4";
    public static final String COLUMN_ANSWER_NO = "Answer_No";
    public static final String COLUMN_DIFFICULTY = "Difficulty_Level";

    private SQLiteDatabase db;

    public QuizQuestionsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                TABLE_NAME + " ( " +
                COLUMN_ID + " INTEGER PRIMARY KEY, " +
                COLUMN_QUESTION + " TEXT, " +
                COLUMN_OPTION1 + " TEXT, " +
                COLUMN_OPTION2 + " TEXT, " +
                COLUMN_OPTION3 + " TEXT, " +
                COLUMN_OPTION4 + " TEXT, " +
                COLUMN_ANSWER_NO + " INTEGER, " +
                COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);

        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        onCreate(db);

    }

    private void fillQuestionsTable()
    {
        Question  q1 = new Question(1,"What method you should override to use Android menu system?",
                "onCreateOptionsMenu()", "onCreateMenu()", "onMenuCreated()",
                "onCreateContextMenu() ", 1,Question.DIFFICULTY_EASY);
        addQuestion(q1);

        Question q2 = new Question(2,"What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource XML? ","findViewByReference(int id)",
                "findViewById(int id)",
                "retrieveResourceById(int id)",
                "findViewById(String id)",
                1 ,Question.DIFFICULTY_EASY);
        addQuestion(q2);

        Question q3 = new Question(3,"Which of the following is not an Android component (i.e. a point from which the system can enter your application)?",
                "Service",
                "Activity",
                "Layout",
                "Content Provider",
                3,Question.DIFFICULTY_EASY);
        addQuestion(q3);

        Question q4 = new Question(4,"During an Activity life-cycle, what is the first callback method invoked by the system?",
                "onStop()" ,
                "onStart()" ,
                "onCreate()" ,
                "onRestore()" ,
                3,Question.DIFFICULTY_EASY);
        addQuestion(q4);

        Question q5 = new Question(5,"Which configuration file holds the permission to use the internet?",
                "Layout file" ,
                "Property file" ,
                "Java source file",
                "Manifest file",4,Question.DIFFICULTY_EASY);
        addQuestion(q5);

        Question q6 = new Question(6,"What does the following line of code achieve?" ,
                "Intent intent = new Intent(FirstActivity.this,SecondActivity.class );" +
                        "Creates an hidden Intent" ,
                "Creates an implicit Intent" ,
                "Create an explicit Intent" ,
                "Starts an activity." ,
                4,Question.DIFFICULTY_EASY);
        addQuestion(q6);

        Question q7 = new Question(7,"Which of the following is NOT a valid usage for Intents?" ,
                "Activate and Activity" ,
                "Activate a Service" ,
                "Activate a Broadcast receiver" ,
                "Activate a SQLite DB Connection." ,
                4 ,Question.DIFFICULTY_EASY);
        addQuestion(q7);

        Question q8 = new Question(8,"Which of the following is not a valid Android resource file name?" ,
                "mylayout.xml" ,
                "myLayout.xml" ,
                "my_layout.xml" ,
                "mylayout1.xml" ,
                2,Question.DIFFICULTY_EASY);
        addQuestion(q8);

        Question q9 = new Question(9,"Which of these is not defined as a process state?" ,
                "Non-visible" ,
                "Visible" ,
                "Foreground" ,
                "Background" ,
                1,Question.DIFFICULTY_EASY);
        addQuestion(q9);

        Question q10 = new Question(10,"What is the name of the folder that contains the R.java file?" ,
                "src" ,
                "res" ,
                "bin" ,
                "gen" ,4,Question.DIFFICULTY_EASY);
        addQuestion(q10);

        Question q11 = new Question(11,"What is a correct statement about an XML layout file?" ,
                "A layout PNG image file",
                "A file used to draw the content of an Activity ",
                "A file that contains all application permission information ",
                "A file that contains a single activity widget. ",
                2,Question.DIFFICULTY_MEDIUM);
        addQuestion(q11);

        Question q12 = new Question(12,"What does the src folder contain?" ,
                "Image and icon files" ,
                "XML resource files" ,
                "The application manifest file" ,
                "Java source code files" ,
                4,Question.DIFFICULTY_MEDIUM);
        addQuestion(q12);

        Question q13 = new Question(13,"Which file specifies the minimum required Android SDK version your application supports?" ,
                " main.xml" ,
                " R.java" ,
                " strings.xml" ,
                " AndroidManifest.xml" ,4,Question.DIFFICULTY_MEDIUM);
        addQuestion(q13);

        Question q14 = new Question(14,"What is the parent class of all Activity widgets?" ,
                " ViewGroup" ,
                " Layout" ,
                " View" ,
                " Widget" ,
                3 , Question.DIFFICULTY_MEDIUM);
        addQuestion(q14);

        Question q15 = new Question(15,"What is the name of the class used by Intent to store additional information?" ,
                "Extra" ,
                "Parcelable" ,
                "Bundle" ,
                "DataStore" ,
                3,Question.DIFFICULTY_MEDIUM);
        addQuestion(q15);

        Question q16 = new Question(16,"Which is not included in the Android application framework?" ,
                " WindowManager" ,
                " NotificationManager" ,
                " DialerManager" ,
                " PackageManager" ,
                3 ,Question.DIFFICULTY_MEDIUM);
        addQuestion(q16);

        Question q17 = new Question(17,"What Eclipse plugin is required to develop Android application?" ,
                " J2EE" ,
                " Android Software Development Kit" ,
                " Android Development Tools" ,
                " Web Development Tools" ,
                3 ,Question.DIFFICULTY_MEDIUM);
        addQuestion(q17);

        Question q18 = new Question(18,"Which of these files contains text values that you can use in your application?" ,
                " AndroidManifest.xml",
                " res/Text.xml",
                " res/layout/Main.xml",
                " res/values/strings.xml" ,4,Question.DIFFICULTY_MEDIUM);
        addQuestion(q18);

        Question q19 = new Question(19,"What does the Android project folder “res/” contain?" ,
                " Java Activity classes",
                " Resource files",
                " Java source code",
                " Libraries",
                2 ,Question.DIFFICULTY_MEDIUM);
        addQuestion(q19);

        Question q20 = new Question(20,"What does this code do? Intent intent = new Intent(); intent.setAction(Intent.ACTION_VIEW); intent.setData(android.net.Uri.parse(http://www.androidatc.com)); startActivity(intent);" ,
                " Starts a sub-activity" ,
                " Starts a service" ,
                " Sends results to another activity." ,
                " Starts an activity using an implicit intent." ,4,Question.DIFFICULTY_MEDIUM);
        addQuestion(q20);

        Question q21 = new Question(21,"Which of the following is a Java call-back method invoked when a view is clicked?" ,
                " Detector " ,
                " OnTapListener " ,
                " OnClickDetector " ,
                " OnClickListener "  ,4,Question.DIFFICULTY_HARD);
        addQuestion(q21);

        Question q22 = new Question(22,"Which of the following is not an Activity lifecycle call-back method?" ,
                " onStart" ,
                " onCreate" ,
                " onPause" ,
                " onBackPressed" ,4,Question.DIFFICULTY_HARD);
        addQuestion(q22);

        Question q23 = new Question(23,"Which method is used to close an activity?" ,
                " Destroy( )" ,
                " Finish( )" ,
                " Stop( )" ,
                " Close( )",
                2 ,Question.DIFFICULTY_HARD);
        addQuestion(q23);

        Question q24 = new Question(24,"Which of the following Activity life-cycle methods is called once the activity is no longer visible?" ,
                " onStop" ,
                " onPause" ,
                " onDestroy" ,
                " onHide" ,1,Question.DIFFICULTY_HARD);
        addQuestion(q24);

        Question q25 = new Question(25,"Which of the following tools dumps system log messages including stack traces when the device or emulator throws an error?" ,
                " DBMS" ,
                " Logcat" ,
                " Console" ,
                " ADB" ,
                2,Question.DIFFICULTY_HARD);
        addQuestion(q25);

        Question q26 = new Question(26, "What does the following code achieve? Intent intent = new Intent(FirstActivity.this, SecondActivity.class); startActivityForResult(intent);" ,
                " Starts a browser activity" ,
                " Starts a sub-activity" ,
                " Starts an activity service" ,
                " Sends results to another activity." ,2,Question.DIFFICULTY_HARD);
        addQuestion(q26);

        Question q27 = new Question(27,"When using an implicit intent, what process does the system use to know what to do with it?" ,
                " Intent resolution" ,
                " Intent declaration" ,
                " Intent overloading" ,
                " Intent transition" ,1,Question.DIFFICULTY_HARD);
        addQuestion(q27);

        Question q28 = new Question(28,"In which Activity life-cycle method you should do all of your normal static set up such as: creating views and bind data to lists? " ,
                " onResume()" ,
                " onStart()" ,
                " onCreate()" ,
                " onPause()" , 3,Question.DIFFICULTY_HARD);
        addQuestion(q28);

        Question q29 = new Question(29,"What is not true about the AndroidManifest.xml file?" ,
                " It declares the views used within the application" ,
                " It declares user permissions the application requires" ,
                " It declares application components" ,
                " It declares hardware and software features used within the application" , 1,Question.DIFFICULTY_HARD);
        addQuestion(q29);

        Question q30 = new Question(30,"Which of the following is not true about <activity> tag in AndroidManifest file?" ,
                " Declares an activity that implements part of the application's visual user interface." ,
                " Contained in <application> tag." ,
                " Declares a single hardware or software feature that is used by the application." ,
                " Has an attribute that specifies the name of the Activity sub-class that implements the activity." ,
                3,Question.DIFFICULTY_HARD);
        addQuestion(q30);



    }

    private void addQuestion(Question question)
    {


        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_ID,question.get_id());
        contentValues.put(COLUMN_QUESTION,question.getQuestion());
        contentValues.put(COLUMN_OPTION1,question.getOption1());
        contentValues.put(COLUMN_OPTION2,question.getOption2());
        contentValues.put(COLUMN_OPTION3,question.getOption3());
        contentValues.put(COLUMN_OPTION4,question.getOption4());
        contentValues.put(COLUMN_ANSWER_NO,question.getAnswerNr());
        contentValues.put(COLUMN_DIFFICULTY,question.getDifficulty());

        db.insert(TABLE_NAME,null,contentValues);


    }

    @SuppressLint("Range")
    public List<Question> getAllQuestions()
    {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        Cursor cursor = db.rawQuery(" SELECT * FROM " + TABLE_NAME,null);

        if (cursor.moveToFirst())
        {
            do {
                Question question = new Question();

                question.setQuestion(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION)));
                question.setOption1(cursor.getString(cursor.getColumnIndex(COLUMN_OPTION1)));
                question.setOption2(cursor.getString(cursor.getColumnIndex(COLUMN_OPTION2)));
                question.setOption3(cursor.getString(cursor.getColumnIndex(COLUMN_OPTION3)));
                question.setOption4(cursor.getString(cursor.getColumnIndex(COLUMN_OPTION4)));
                question.setAnswerNr(cursor.getInt(cursor.getColumnIndex(COLUMN_ANSWER_NO)));
                question.setDifficulty(cursor.getString(cursor.getColumnIndex(COLUMN_DIFFICULTY)));


                questionList.add(question);

            }while (cursor.moveToNext());

        }
        cursor.close();
        return questionList;
    }

    public List<Question> getQuestions(String difficulty)
    {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor cursor = db.rawQuery(" SELECT * FROM " + TABLE_NAME +
                " WHERE " + COLUMN_DIFFICULTY + " = ?", selectionArgs);

        if (cursor.moveToFirst())
        {
            do {
                Question question = new Question();

                question.setQuestion(cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_QUESTION)));
                question.setOption1(cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPTION1)));
                question.setOption2(cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPTION2)));
                question.setOption3(cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPTION3)));
                question.setOption4(cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPTION4)));
                question.setAnswerNr(cursor.getInt(cursor.getColumnIndexOrThrow(COLUMN_ANSWER_NO)));
                question.setDifficulty(cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_DIFFICULTY)));

                questionList.add(question);

            }while (cursor.moveToNext());

        }
        cursor.close();
        return questionList;
    }
}



