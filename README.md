# multi-module-archetype
Project to create Maven Multi module Archetype 
mvn clean install
and then run the command in below after chnaging the GAV
mvn archetype:generate -DarchetypeGroupId=edu.gmit -DarchetypeArtifactId=multi-module-archetype -DarchetypeVersion=0.0.1-SNAPSHOT -DgroupId=<org.test.myproj> -DartifactId=<sample-generated-project>
