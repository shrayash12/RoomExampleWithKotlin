package shradha.com.roomexamplewithkotlin.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentDao {
    @Insert
    suspend fun insertStudent(student: Student)

    @Query("SELECT * FROM StudentTable")
    suspend fun getAllStudents(): Flow<List<Student>>

    @Query("DELETE  from StudentTable")
    suspend fun delete()
}