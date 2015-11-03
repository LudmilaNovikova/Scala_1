package com.artezio.novikova.ludmila.students

/**
 * Created by dvlar on 01.11.2015.
 */
object Main extends App{
  var student1 = Student("Ivanov",30)
  var student2 = Student("Smirnov",26,3)
  var student3 = Student("Petrov",20,2,true)
  println(student1.getInfo)
  println(student2)
  println(student3.getInfo)
  println(student1.study(true))
  println(student1.study(false))
  val condition1: Condition = Philosophy
  val condition2: Condition = Physics
  val teacher = new Teacher("Socrat", 40, "doctor of philosophy")
  println(teacher.getInfo)
  println(teacher.teach(condition1))
  println(teacher.teach(condition2))
  println(teacher.setNewAcademicDegree(Physics.condition))
  println(teacher.getInfo)
  println(teacher.teach(condition2))
}
