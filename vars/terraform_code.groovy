def call(){

    pipeline {
    agent any
    tool name: 'terraform07', type: 'terraform'
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