package shradha.com.roomexamplewithkotlin.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import shradha.com.roomexamplewithkotlin.data.StudentRepository
import shradha.com.roomexamplewithkotlin.data.Student

class StudentViewModel(private val studentRepository: StudentRepository) : ViewModel() {
    suspend fun vmAddStudent(student: Student) {
        viewModelScope.launch {
            studentRepository.addStudentRepo(student)
        }
    }

    suspend fun vmGetStudent(): Flow<List<Student>> {
        viewModelScope.launch {
            studentRepository.getStudentListRepo()
        }
        return studentRepository.getStudentListRepo()
    }
}