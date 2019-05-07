pipeline {
     agent any
     stages {
         stage('Build in Docker image')  {
             agent {
                 dockerfile {
                     args '--entrypoint=\'\''
                 }
             }
             stages {
                 stage('Build') {
                     steps {
                       sh "pwd"
                       sh "ls -la ./**"
                       sh "./gradlew build"
                     }
                   }
                    /*stage('Validate code quality') {
                       steps {
                           sh "./gradlew sonarqube \
                           -Dsonar.projectKey=rrchcr8_DevOps-Java-web-app \
                           -Dsonar.organization=rrchcr8-github \
                           -Dsonar.host.url=https://sonarcloud.io \
                           -Dsonar.login=bc664ce2731513c418938ec1007365c6215447ae"
                     }
                   }*/
             }
             post {
                 always {
                     publishHTML target: [
                         allowMissing: false,
                         alwaysLinkToLastBuild: false,
                         keepAll: true,
                         reportDir: 'build/reports/tests/',
                         reportFiles: 'index.html',
                         reportName: 'Unit Test Report'
                     ]
                 }
                 success {
                     archiveArtifacts "build/libs/*.war"
                 }
             }
         }
         stage('Deploy') {
           steps {
               sh "docker build -t tomcat_for_gui_tests:1.1 -f DockerFileProduction ."
               sh "docker run --rm -d -p 8888:8080 tomcat_for_gui_tests:1.1"
           }
         }

     }
 }