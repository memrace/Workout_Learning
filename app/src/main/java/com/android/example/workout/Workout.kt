package com.android.example.workout

 data class Workout(private val name: String, private val description: String) {

    companion object Workouts {
        val list:MutableList<Workout> = mutableListOf(
            Workout("The Limb Looser","5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            Workout("Core Agony","100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            Workout("The Wimp Special","5 Pull-ups\n10 Push-ups\n15 Squats"),
            Workout("Strength and Length","500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
        )

    }


     fun getName(): String {
        return this.name
    }
     fun getDescription(): String {
        return this.description
    }

    override fun toString(): String {
        return this.name
    }

}