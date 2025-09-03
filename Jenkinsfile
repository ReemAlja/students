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
                bat 'echo Running tests...'
                // مثلاً bat 'mvn test' لو تستخدمين Maven
            }
        }

        stage('Package') {
            steps {
                bat 'echo Packaging the project...'
                // bat 'mvn package'
            }
        }
    }
}
