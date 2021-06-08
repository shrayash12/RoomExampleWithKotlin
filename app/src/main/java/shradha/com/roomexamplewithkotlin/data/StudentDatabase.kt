package shradha.com.roomexamplewithkotlin.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.CoroutineScope

@Database(entities = [Student::class], version = 1, exportSchema = false)
abstract class StudentDatabase : RoomDatabase() {
    abstract fun studentDao(): StudentDao

    companion object {
        private var instance: StudentDatabase? = null
        fun getStudentDatabase(
            context: Context,
            applicationScope: CoroutineScope
        ): StudentDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    StudentDatabase::class.java,
                    "student_db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance as StudentDatabase
        }
    }

}