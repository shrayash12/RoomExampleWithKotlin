package shradha.com.roomexamplewithkotlin.data

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class MyApplication : Application() {
    // No need to cancel this scope as it'll be torn down with the process
    val applicationScope: CoroutineScope = CoroutineScope(SupervisorJob())

    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val db by lazy { StudentDatabase.getStudentDatabase(this, applicationScope) }
    val repo by lazy { StudentRepository(db.studentDao()) }
}
