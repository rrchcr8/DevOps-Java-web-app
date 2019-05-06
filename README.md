# DevOps-Java-web-app

DevOps-Java-web-app fot DevOPS course
How to deploy?

Requirements Java 1.8 Tomcat

Steps Execute next commands in the shell:

Install tomcat at /opt/tomcat ./gradlew build ./gradlew sonarqube 
-Dsonar.projectKey=88mary256_calculator-web 
-Dsonar.organization=88mary256-github 
-Dsonar.host.url=https://sonarcloud.io 
-Dsonar.login=0cff712fd948d82dd64bcb5c0ffa840c75a47f31" ./gradlew appRun

move build/helloPage.war to /opt/tomcat/webapps start tomcat
