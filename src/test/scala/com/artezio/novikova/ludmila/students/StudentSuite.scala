package com.artezio.novikova.ludmila.students

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created by dvlar on 02.11.2015.
 */
@RunWith(classOf[JUnitRunner])
class StudentSuite extends FunSuite {

  test("student may be instantiated with name and age. His course must be 1 and he must not be recovered") {
    val student = Student("Ivanov",18)
    println(student.getInfo)
    assert(student.course === 1)
    assert(student.isRecovered === false)
  }

  test("student may be instantiated with name,age and course. In this case he must not be recovered") {
    val student = Student("Ivanov",19,2)
    println(student.getInfo)
    assert(student.isRecovered === false)
  }

  test("student may be instantiated with name,age,course and isRecovered") {
    val student = Student("Ivanov",20,2,true)
    println(student.getInfo)
    assert(student.isRecovered === true)
  }

  test("student in a good mood will study") {
    val student = Student("Ivanov",20,2,true)
    val message = student.study(true)
    println(message)
    assert(message.equals(Student.AGREE_TO_STUDY_MESSAGE))
  }

  test("student in a bad mood will not study") {
    val student = Student("Ivanov",20,2,true)
    val message = student.study(false)
    println(message)
    assert(message.equals(Student.DISAGREE_TO_STUDY_MESSAGE))
  }
}
