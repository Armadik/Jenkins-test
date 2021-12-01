pipeline {
    agent any
    options { timestamps() }
    stages {
        stage('Init environment') {
            steps {
                script {
                    load "./SetEnvironmentVars.groovy"   // Загружаем переменные окружения (настойки)
                    commonMethods = load "./CommonMethods.groovy" // Загружаем модули
                }
            }
        }
        stage('Test print env') {
            steps {
                script {
                print  env.EMAIL_ADDRESS_FOR_NOTIFICATIONS
                    }
            }
        }
        stage('Test call module') {
            steps {
                script {
                    def hostname
                }
            }
        }
        post {
            failure {
                script {
                    commonMethods.emailJobStatus ("BUILD FAILED")
                }
            }
    }
}