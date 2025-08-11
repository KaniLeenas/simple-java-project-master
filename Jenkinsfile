pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/KaniLeenas/simple-java-project-master.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
