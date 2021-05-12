package com.android.example.livedatabuilder
//@Parcelize
//@JsonClass(generateAdapter = true)
data class LiveResponse (val code:String,val message:String,val result:List<Joke>)

data class Joke(val sid:String,val text:String)