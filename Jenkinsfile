pipeline {
    agent any
    options { timestamps() }
    stages {
        stage('Init environment') {
            steps {
                script {
                    load "./SetEnvironmentVars.groovy"   // Загружаем переменные окружения (настойки)
                }
            }
        }
        stage('Build') {
            steps {
                script {
                print  env.EMAIL_ADDRESS_FOR_NOTIFICATIONS
                    }
            }
        }
    }
}