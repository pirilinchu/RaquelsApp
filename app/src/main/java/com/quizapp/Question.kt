package com.quizapp

data class Question(
    val id: Int,
    val question: String,
    val options: ArrayList<Pair<String, Int> >,
    val pValue: Int
)

data class Profile(
    val profileName: String,
    val profileDescription: String
)