package com.example.backtolife

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.datepicker.MaterialDatePicker


class Home:AppCompatActivity() {

    private lateinit var mDatePickerBtn: Button
    private lateinit var textSelectedDate: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        mDatePickerBtn = findViewById(R.id.textButtonDate)
        textSelectedDate = findViewById(R.id.textViewSelectedDate)



        //Material Date Picker
        val datePicker =
            MaterialDatePicker.Builder.datePicker()
                .setTitleText("Select date of today")
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build()


        mDatePickerBtn.setOnClickListener {
            datePicker.show(supportFragmentManager, "Date_Picker")
        }

        datePicker.addOnPositiveButtonClickListener {

            textSelectedDate.text = datePicker.headerText
        }

    }
}