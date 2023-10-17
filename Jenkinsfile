pipeline {
    agent any 
    tools { 
        maven 'maven'
    }
    stages {
        stage ("Clean up"){
            steps {
                deleteDir()
            }
        }
        stage ("Clone repo"){
            steps {
                sh "git clone https://github.com/kaiselhabib/jenkinstp2.git"
            }
        }
        stage ("Generate backend image") {
              steps {
                      sh "mvn clean install"
                      sh "docker build -t docexp1-spring ."
                  }                
              
          }
        stage ("Run docker compose") {
            steps {
                    sh " docker compose up -d"
                            
            }
        }
    }
}
