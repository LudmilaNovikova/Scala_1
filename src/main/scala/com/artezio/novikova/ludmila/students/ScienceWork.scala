package com.artezio.novikova.ludmila.students

/**
 * Created by dvlar on 01.11.2015.
 */
trait ScienceWork {
  def academicDegree: String
  def setAcademicDegree(newDegree: String): String

  def setNewAcademicDegree(degree: String): String = {
    setAcademicDegree(s"$academicDegree, $degree")
  }
}
