name := "p4g-server"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0-SNAPSHOT"

libraryDependencies += "org.scalaz" %% "scalaz-concurrent" % "7.0-SNAPSHOT"

libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.0-SNAPSHOT"

libraryDependencies += "org.scalaz" %% "scalaz-iteratee" % "7.0-SNAPSHOT"

libraryDependencies += "org.scala-tools.testing" % "scalacheck_2.9.0" % "1.9" % "test"