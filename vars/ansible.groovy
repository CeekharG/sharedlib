def call() {

pipeline {
    agent any

    // triggers {
    //     pollSCM('* * * * *')
    // }

    stages {

        stage('ansible_lynt') {
            steps {
                sh "ansible-playbook applyrole_tomcat.yml --syntax-check"
            }
        }

        stage('Ansible_Apply') {
            steps {
                sshagent(['ec2-user']) {
                    sh "ansible-playbook applyrole_tomcat.yml"
                }
            }  
            }

        stage('teststage') {
            steps {
                sh "echo ansible run completed"
            }
        }

        }
    }


}