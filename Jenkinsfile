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
                echo 'Test_build'
                env
            }
        }
    }
}