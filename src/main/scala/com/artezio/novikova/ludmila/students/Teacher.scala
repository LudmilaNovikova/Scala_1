package com.artezio.novikova.ludmila.students

/**
 * Created by dvlar on 01.11.2015.
 */
class Teacher(name: String, age: Integer, var academicDegree: String) extends Person(name, age) with ScienceWork{
  override def toString = super.toString + s", $academicDegree"

  def teach(condition: Condition): String = condition.condition match {
    case "good" => "I will teach"
    case _ => "I won't teach"
  }

  def setAcademicDegree(newDegree: String): String ={
    academicDegree = newDegree
    academicDegree
  }

  override def getInfo: String = toString

}

object Teacher {
  implicit def stringToTeacher(str: String): Teacher = {
    var fields = str.split(",").map(_.trim)
    new Teacher(fields(0), fields(1).toInt, fields(2))
  }
}


