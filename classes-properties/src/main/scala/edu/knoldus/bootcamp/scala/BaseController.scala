package edu.knoldus.bootcamp.scala

abstract class BaseController(db: String) {
  def save { db.getChars() }

  def update { db.getBytes() }

  def delete { db.getClass }

  // abstract
  def connect

  // an abstract method that returns a String
  def getStatus: String

  // an abstract method that takes a parameter
  def setServerName(serverName: String)
}

//error: class WidgetController needs to be abstract
//class WidgetController(db: String) extends BaseController(db)
