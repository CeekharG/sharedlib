def call(){

    pipeline {
    agent any

    stages {
        stage('Plan') {
            steps {
                sh "terraform plan"
            }
        }
    }

    stage('Apply') {
            steps {
                sh "terraform apply"
            }
        }
    }
    }
}