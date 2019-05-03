pipeline {
    agent any
    stages {
        stage('Build In DockerContainer') {
            agent {
                dockerfile {
                    args '--entrypoint=\'\''
                }
            }
   stages {
                 stage('build') {
                    steps {
                        sh './gradlew build'
                        sh 'ls -la build/**'
                    }
                }
                stage('SonarQube') {
                    steps {
                        sh 'echo Sonar Analysis'
                        /*'./gradlew sonarqube \
                                -Dsonar.projectKey=rrchcr8_DevOps-Java-web-app \
                                -Dsonar.organization=rrchcr8-github \
                                -Dsonar.host.url=https://sonarcloud.io \
                                -Dsonar.login=bc664ce2731513c418938ec1007365c6215447ae"                    }
                }
            }
            post {

                success {
                    archiveArtifacts artifacts: 'build/**/*.war', fingerprint: true
                }
            }

        }
        stage('Run on Master') {
            steps {
                sh 'uname -a'
                sh 'pwd'
                sh 'ls -la /tmp'
            }
        }
    }
    post {
        always{
            sh 'docker images -q -f dangling=true | xargs --no-run-if-empty docker rmi'
        }
    }
}