pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/AkankshaR19/testing-jenkins.git'
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