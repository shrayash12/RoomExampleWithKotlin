package shradha.com.roomexamplewithkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import shradha.com.roomexamplewithkotlin.domain.StudentViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var editStudentId: EditText
    private lateinit var editStudentName: EditText
    private lateinit var editStudentField: EditText
    lateinit var buttonSave: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.fragment_student)
        editStudentId = findViewById(R.id.editStudentId)
        editStudentName = findViewById(R.id.editStudentName)
        editStudentField = findViewById(R.id.editStudentField)
        buttonSave = findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener { view: View ->
            var id = editStudentId.text.toString()
            var name = editStudentName.text.toString()
            var field = editStudentField.text.toString()

        }
    }
}