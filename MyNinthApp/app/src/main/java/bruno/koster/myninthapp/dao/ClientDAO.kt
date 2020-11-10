package bruno.koster.myninthapp.dao

import androidx.room.*
import bruno.koster.myninthapp.model.Client

@Dao
interface ClientDAO {
    @Query("select * from client limit 100")
    fun fetchClients(): List<Client>

    @Insert
    fun store(vararg client: Client)

    @Delete
    fun delete(client: Client)

    @Update
    fun update(client: Client)
}











































//import android.content.ContentValues
//import android.content.Context
//import android.database.Cursor
//import android.database.sqlite.SQLiteDatabase
//import bruno.koster.myninthapp.model.Client
//
//class ClientDAO(context: Context) {
//
//    var database : SQLiteDatabase? = null
//    var databaseHelper : DatabaseHelper? = null
//
//    init {
//        this.databaseHelper = DatabaseHelper(context)
//    }
//
//    public fun openDatabaseWritable() {
//        database = this.databaseHelper?.writableDatabase
//    }
//
//    public fun openDatabaseReadable() {
//        database = this.databaseHelper?.readableDatabase
//    }
//
//    public fun closeDatabase() {
//        this.databaseHelper?.close()
//    }
//
//    //insert
//    public fun store(client: Client): Long {
//
//        val values = ContentValues()
//        values.put(DatabaseHelper.TABLE_CLIENT_NAME, client.name)
//        values.put(DatabaseHelper.TABLE_CLIENT_GENDER, client.gender)
//        values.put(DatabaseHelper.TABLE_CLIENT_INCOME, client.income)
//
//        return this.database!!.insert(
//            DatabaseHelper.TABLE_CLIENT,
//            null,
//            values)
//
////        SQL puro
////        insert into client(id, name, gender, income)
////        values(1, "asdfa", "masc", 3000)
//    }
//
//    //delete
////    public fun delete(id: Int): Int {
//    public fun delete(client: Client): Boolean {
//
//        return this.database!!.delete(
//            DatabaseHelper.TABLE_CLIENT,
//            DatabaseHelper.TABLE_CLIENT_ID+"=?",
//            arrayOf(client.id.toString())) != -1
//
//    }
//
//    //update
//    public fun update(client: Client): Int {
//
//        val values = ContentValues()
//        values.put(DatabaseHelper.TABLE_CLIENT_NAME, client.name)
//        values.put(DatabaseHelper.TABLE_CLIENT_GENDER, client.gender)
//        values.put(DatabaseHelper.TABLE_CLIENT_INCOME, client.income)
//
//        return this.database!!.update(
//            DatabaseHelper.TABLE_CLIENT,
//            values,
//            DatabaseHelper.TABLE_CLIENT_ID+"=?",
//            arrayOf(client.id.toString()))
//
////        SQL puro
////        insert into client(id, name, gender, income)
////        values(1, "asdfa", "masc", 3000)
//    }
//
//
//    //select
//    public fun fetchClients(): MutableList<Client> {
//
//        //        select * from client
//
//        val listClients: MutableList<Client> = mutableListOf<Client>()
//
//        val cursor: Cursor = this.database!!.query(
//            DatabaseHelper.TABLE_CLIENT,
//            DatabaseHelper.TABLE_CLIENT_COLUMNS,
//            null, null, null, null, null
//        )
//
//        try {
//            while (cursor.moveToNext()) {
//                val client = Client(
//                    cursor.getInt(cursor.getColumnIndex(DatabaseHelper.TABLE_CLIENT_ID)),
//                    cursor.getString(cursor.getColumnIndex(DatabaseHelper.TABLE_CLIENT_NAME)),
//                    cursor.getString(cursor.getColumnIndex(DatabaseHelper.TABLE_CLIENT_GENDER)),
//                    cursor.getDouble(cursor.getColumnIndex(DatabaseHelper.TABLE_CLIENT_INCOME))
//                )
//
//                listClients.add(client)
//            }
//        } finally {
//            cursor.close()
//        }
//        return listClients
//    }
//
//    //delete
//    //update
//}