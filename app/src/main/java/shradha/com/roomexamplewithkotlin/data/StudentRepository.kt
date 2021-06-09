package shradha.com.roomexamplewithkotlin.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class StudentRepository(private val studentDao: StudentDao) {
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
   suspend fun addStudentRepo(student: Student) {
        studentDao.insertStudent(student)
    }

  suspend  fun getStudentListRepo(): Flow<List<Student>> {
        return studentDao.getAllStudents()
    }

}