name := "slack-app-api"

version := "1.0"

scalaVersion := "2.12.1"

publishTo := Some("Artifactory Realm" at "http://central.rever.vn/artifactory/libs-release-local")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")    
