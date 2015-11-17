package com.artezio.novikova.ludmila.students

/**
 * Created by dvlar on 31.10.2015.
 */
abstract class Person(name: String, var age: Integer) {
  require(!name.isEmpty && age >= 0)

  override def toString = s"$name, $age"

  def getInfo: String

}
