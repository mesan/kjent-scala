package no.mesan.basic

case class Person2(name:String, age:Int, emailAddresses:List[EmailAddress])

case class EmailAddress(address: String)

