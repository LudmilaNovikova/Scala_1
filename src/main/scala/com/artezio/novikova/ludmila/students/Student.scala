package com.artezio.novikova.ludmila.students

/**
 * Created by dvlar on 31.10.2015.
 */
class Student(name: String, age: Byte, var course: Byte, val isRecovered: Boolean = false) extends Person(name, age) {
  def this(name: String, age: Byte) = this(name, age, 1)
  override def toString = {
    super.toString + s", $course course${if (isRecovered) ", recovered" else ""}"
  }
  def study(mood: Boolean): String = {
    if(mood) Student.AGREE_TO_STUDY_MESSAGE else Student.DISAGREE_TO_STUDY_MESSAGE
  }
  def main(args: Array[String]) {
    toString
  }

  override def getInfo: String = toString
}

object Student {

  val AGREE_TO_STUDY_MESSAGE = "I have a good mood. I will study!"
  val DISAGREE_TO_STUDY_MESSAGE = "I have a bad mood. I will not study!"

  def apply(name: String, age: Byte): Student = {
    new Student(name, age)
  }

  def apply(name: String, age: Byte, course: Byte): Student = {
    new Student(name, age, course)
  }

  def apply(name: String, age: Byte, course: Byte, isRecovered: Boolean): Student = {
    new Student(name, age, course, isRecovered)
  }
}