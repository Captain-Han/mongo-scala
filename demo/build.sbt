name := "demo-console"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "repo.novus snaps" at "http://repo.novus.com/snapshots/"

libraryDependencies ++= Seq(
    "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
    "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT"
)