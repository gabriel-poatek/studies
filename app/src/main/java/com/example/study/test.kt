package com.example.study

import kotlin.random.Random

class test {
    fun feedTheFish(){
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
    }
    fun randomDay(): String{
        val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        return week[Random.nextInt(week.size)]
    }

    fun main(args: Array<String>){
        feedTheFish()
    }
    fun fishFood(day : String) : String{

       return when(day){
            "Monday" -> "flakes"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Sunday" -> "plankton"
            else -> "nothing"
        }
         }

    fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20):Boolean{
      return when{

          isTooHot(temperature) -> true
          isDirty(dirty) -> true
          isSunday(day) -> true
          else -> false
      }
    }
    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Sunday"
}