pipeline {
    agent any

    stages {
      stage('Build') {
          steps {
              sh "./gradlew build"
          }
      }

      stage('Test') {
          steps {
              sh "./gradlew test"
          }
      }
      stage('Package') {
          steps {
              sh "./gradlew war"
          }
       }
      stage('Deploy') {
          steps {
              sh "pwd"
              sh "ls -la ./**"
              sh "./gradlew appRun"
          }
      }
    }
}