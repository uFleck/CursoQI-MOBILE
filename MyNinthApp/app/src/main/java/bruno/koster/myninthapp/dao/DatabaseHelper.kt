package bruno.koster.myninthapp.dao

//import android.content.Context
//import android.database.sqlite.SQLiteDatabase
//import android.database.sqlite.SQLiteOpenHelper
//
//class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "client.db", null, 1) {
//
//    companion object {
//        //cliente!
//        val TABLE_CLIENT : String = "table_client"
//        val TABLE_CLIENT_ID : String = "table_client_id"
//        val TABLE_CLIENT_NAME : String = "table_client_name"
//        val TABLE_CLIENT_GENDER : String = "table_client_gender"
//        val TABLE_CLIENT_INCOME : String = "table_client_income"
//
//        val TABLE_CLIENT_COLUMNS = arrayOf(
//            TABLE_CLIENT_ID,
//            TABLE_CLIENT_NAME,
//            TABLE_CLIENT_GENDER,
//            TABLE_CLIENT_INCOME
//        )
//    }
//
//    //SQL - DDL data definition language..... -> create table...
//    val CREATE_TABLE_CLIENT =
//        "CREATE TABLE if not exists " + TABLE_CLIENT + "(" +
//                "${TABLE_CLIENT_ID} integer PRIMARY KEY autoincrement," +
//                "${TABLE_CLIENT_NAME} text," +
//                "${TABLE_CLIENT_GENDER} text," +
//                "${TABLE_CLIENT_INCOME} double" +
//                ")"
//
//    override fun onCreate(database: SQLiteDatabase?) {
//        database?.execSQL(CREATE_TABLE_CLIENT)
//    }
//
//    override fun onUpgrade(p0: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
//        //faz nada....
//    }
//}