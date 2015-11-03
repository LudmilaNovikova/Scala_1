package com.artezio.novikova.ludmila.students

/**
 * Created by dvlar on 01.11.2015.
 */
class Teacher(name: String, age: Byte, var academicDegree: String) extends Person(name, age) with ScienceWork{
  override def toString = super.toString + s", $academicDegree"

  def teach(condition: Condition): String = condition match {
    case Philosophy => "Today we will teach philosophy"
    case Physics => if (academicDegree.contains(Physics.condition))
      "I will teach physics"
      else "I don't have enough knowledge to teach physics"
  }

  def setAcademicDegree(newDegree: String): String ={
    academicDegree = newDegree
    academicDegree
  }

  override def getInfo: String = toString
}
