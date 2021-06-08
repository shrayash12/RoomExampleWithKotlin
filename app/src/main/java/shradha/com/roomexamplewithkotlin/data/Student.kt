package shradha.com.roomexamplewithkotlin.data


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "StudentTable")
data class Student(
    @PrimaryKey
    val id: Int,
    val name: String,
    val field: String)
