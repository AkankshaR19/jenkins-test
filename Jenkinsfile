pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/AkankshaR19/jenkins-test.git'
            }
        }

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
}