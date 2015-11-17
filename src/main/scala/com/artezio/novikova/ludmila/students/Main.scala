package com.artezio.novikova.ludmila.students
/**
 * Created by dvlar on 01.11.2015.
 */
object Main extends App{
  var student1 = Student("Ivanov",30)
  println(student1.getInfo)
  student1 = "Ivanov,30"
  println(student1.getInfo)
  var student2 = Student("Smirnov",26,3)
  println(student2)
  student2 = "Smirnov,26,3"
  println(student2)
  var student3 = Student("Petrov",20,2,true)
  println(student3.getInfo)
  student3 = "Petrov,20,2,true"
  println(student3.getInfo)

  println(student1.study(true))
  println(student1.study(false))
  var teacher = new Teacher("Socrat", 40, "doctor of philosophy")
  println(teacher.getInfo)
  teacher = "Socrat, 40, doctor of philosophy"
  println(teacher.getInfo)
  println(teacher.teach(Condition("bad")))
  println(teacher.teach(Condition("good")))
  println(teacher.setAcademicDegree(teacher.setNewAcademicDegree("doctor of astronomy")))
  println(teacher.getInfo)
}
