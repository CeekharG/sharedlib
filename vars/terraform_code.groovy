def call(){

    pipeline {
    agent any
    tools {
        terraform 'terraform07'
    }
    stages {

        stage('Init') {
            steps {
                sh "terraform init"
            }
        }

        stage('Plan') {
            steps {
                sh "terraform plan"
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