package com.android.example.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import androidx.databinding.DataBindingUtil
import com.android.example.workout.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_workout_list.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        toStartOnClickIntent()

    }


    private fun toStartOnClickIntent() {
        val fragment:WorkoutListFragment = supportFragmentManager.findFragmentById(R.id.main_fragment_list) as WorkoutListFragment

        fragment.fragment_list_id.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id -> val intent: Intent = Intent(this, WorkoutDetail::class.java)
                intent.putExtra(Intent.EXTRA_INDEX,position)
                startActivity(intent)
            }
    }



}