def call(){

    pipeline {
    agent any
    tools {
        terraform 'terraform07'
    } 
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