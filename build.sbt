name := "scalakjent"

organization := "no.mesan"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies += "org.specs2" %% "specs2" % "1.6.1" % "test"

libraryDependencies += "org.mockito" % "mockito-all" % "1.8.5" % "test"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % "test",
  "com.novocode" % "junit-interface" % "0.7" % "test"
)

testOptions in Test += Tests.Argument("-v")