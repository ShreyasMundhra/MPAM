package com.djzass.mediapp.mediapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Shreyas on 3/17/2015.
 */
public class FeedReaderDbHelper extends SQLiteOpenHelper {
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "FeedReader.db";
    private static final String SQL_CREATE_ACCOUNTS =
            "CREATE TABLE " + FeedReaderContract.AccountEntry.TABLE_NAME + " (" +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_ACCOUNT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_NRIC + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_EMAIL + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_CONTACTNO + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_ADDRESS + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_DOB + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_GENDER + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_MARITAL_STATUS + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_CITIZENSHIP + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_COUNTRY_OF_RESIDENCE + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_USERNAME + TEXT_TYPE + COMMA_SEP +
                    FeedReaderContract.AccountEntry.COLUMN_NAME_PASSWORD + TEXT_TYPE +
                    " );";

    private static final String SQL_CREATE_

    private static final String SQL_DELETE_ACCOUNTS =
            "DROP TABLE IF EXISTS " + FeedReaderContract.AccountEntry.TABLE_NAME + ";";
    // If you change the database schema, you must increment the database version.


    public FeedReaderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ACCOUNTS);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ACCOUNTS);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
