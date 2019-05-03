pipeline {

   agent {
      dockerfile {
         args '--entrypoint=\'\''
      }
   }

    stages {

      agent {
            dockerfile {
               args '--entrypoint=\'\''
            }
         }



      stage('Build') {
          steps {
              sh "./gradlew build"
          }
      }

     stage('Validate code quality') {
               steps {
                   sh "./gradlew sonarqube \
                       -Dsonar.projectKey=rrchcr8_DevOps-Java-web-app \
                       -Dsonar.organization=rrchcr8-github \
                       -Dsonar.host.url=https://sonarcloud.io \
                       -Dsonar.login=bc664ce2731513c418938ec1007365c6215447ae"
               }
           }

       }
      stage('Deploy') {
          steps {
              sh "./gradlew appRun"
          }
      }

       stage('Run on Master') {
                   steps {
                       sh 'uname -a'
                       sh 'pwd'
                       sh 'ls -la /tmp'
                   }
               }

        post {
                always {
                    sh 'touch build/test-results/*.xml'
                    junit 'build/test-results/*.xml'
                }
                success {
                    archiveArtifacts artifacts: 'build/**/*.jar', fingerprint: true
                }
            }


    }
