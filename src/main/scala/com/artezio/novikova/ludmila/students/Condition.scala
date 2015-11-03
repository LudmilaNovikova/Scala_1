package com.artezio.novikova.ludmila.students

/**
 * Created by dvlar on 01.11.2015.
 */
sealed abstract class Condition(val condition: String)
case object Philosophy extends Condition("Philosophy science")
case object Physics extends Condition("Physics science")