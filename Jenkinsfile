pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/surefire-reports/*.xml'
        }

        success {
            echo 'Build and Test Successful!'
        }

        failure {
            echo 'Build or Test Failed!'
        }
    }
}