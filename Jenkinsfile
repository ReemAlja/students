pipeline {
    agent any

    stages {
        stage('Clone Project') {
            steps {
                echo 'Project Cloned Automatically by Jenkins via GitHub webhook'
            }
        }

        stage('Build & Test') {
            steps {
                sh './mvnw clean test'
            }
        }

        stage('Package') {
            steps {
                sh './mvnw package'
            }
        }
    }
}
