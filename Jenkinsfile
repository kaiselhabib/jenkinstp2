pipeline {
    agent any
  
    stages {
 stage('Pull Repository') {
            steps {
                // Pull the repository source code from Git
                git branch: 'master', url: 'https://github.com/kaiselhabib/jenkinstp2.git'
            }
        }
    
        stage('Build Spring') {
            
            steps {
                sh "mvn clean install"

            }
        }
        stage('Build docker image') {
            steps {
             script{
                sh 'docker build -t firstspring .'
             }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    sh 'docker run -d -p 8084:8084 firstspring'
                }
            }
        }
    }
}
