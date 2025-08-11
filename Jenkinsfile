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
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
