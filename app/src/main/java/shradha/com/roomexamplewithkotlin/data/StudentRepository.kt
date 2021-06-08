package shradha.com.roomexamplewithkotlin.data

import kotlinx.coroutines.flow.Flow

class StudentRepository(private val studentDao: StudentDao) {

    fun addStudentRepo(student: Student) {
        studentDao.insertStudent(student)
    }

    fun getStudentListRepo(): Flow<List<Student>> {
        return studentDao.getAllStudents()
    }

}