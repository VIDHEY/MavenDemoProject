pipeline { 
    agent any
    tools { 
        maven 'Maven' 
        jdk 'JDK_14' 
    }
    stages { 
        stage ('Build') {
            steps {
                echo 'Build Phase'
                bat 'mvn clean compile'
            }
         
        }
        stage ('Test') { 
            steps {
                echo 'Test Phase'
                bat 'mvn test'
            }
        }
        stage ('Deploy') { 
            steps {
                echo 'Deploy Phase'
                bat 'mvn install'
            }
        }
    }           
 }
