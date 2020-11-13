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
                withAWS(credentials: 'awskeys',region: 'useast-1'){
                    
                sh "terraform plan"}
            }
        }
    

        stage('Apply') {
            steps {
                withAWS(credentials: 'awskeys',region: 'useast-1'){
                sh "terraform apply"}
            }
        }
    }
    }
    }