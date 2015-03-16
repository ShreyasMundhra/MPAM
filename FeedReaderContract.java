package com.mycompany.cz2006;

import android.provider.BaseColumns;

public class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static abstract class FeedUserAccount implements BaseColumns {
        public static final String TABLE_NAME = "User Account";
        public static final String COLUMN_NAME_USER_ID = "userid";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_NRIC = "nric";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_CONTACTNO = "contactno";
        public static final String COLUMN_NAME_ADDRESS = "address";
        public static final String COLUMN_NAME_DOB = "dob";
        public static final String COLUMN_NAME_GENDER = "gender";
        public static final String COLUMN_NAME_MARITAL_STATUS = "maritalstatus";
        public static final String COLUMN_NAME_CITIZENSHIP = "citizenship";
        public static final String COLUMN_NAME_COUNTRY_OF_RESIDENCE = "countryofresidence";

    }



}
