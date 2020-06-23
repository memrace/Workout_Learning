package com.android.example.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.android.example.workout.databinding.ActivityWorkoutDetailBinding
import kotlinx.android.synthetic.main.fragment_workout_detail.*

class WorkoutDetail : AppCompatActivity() {
    lateinit var binding:ActivityWorkoutDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_workout_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val selectedItem:Int = intent.getIntExtra(Intent.EXTRA_INDEX, 0)

        setFragment(selectedItem)


    }

    private fun setFragment(selectedItem:Int) {
        val fragment:WorkoutDetailFragment = supportFragmentManager.findFragmentById(R.id.workout_detail_fragment) as WorkoutDetailFragment
        if (selectedItem != null) {
            fragment.tv_name_detail_fragment.text = Workout.list[selectedItem].getName()
            fragment.tv_description_detail_fragment.text = Workout.list[selectedItem].getDescription()
        } else  fragment.tv_name_detail_fragment.text = "ERROR"


    }
}