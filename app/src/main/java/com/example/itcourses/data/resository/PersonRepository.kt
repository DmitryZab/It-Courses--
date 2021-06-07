package com.example.itcourses.data.resository

import com.example.itcourses.data.model.Person

class PersonRepository {

   public fun getPersonList() : List<Person> {
        return listOf(
            Person(name = "Вася", surname = "Петров", age = 16),
            Person(name = "Женя", surname = "Иванов", age = 30),
            Person(name = "Оля", surname = "Петрова", age = 45),
            Person(name = "Леся", surname = "Лескова", age = 56),
            Person(name = "Инна", surname = "Колбина", age = 26),
        )
    }
}