pipeline { 
agent any 
    stages { 
        stage ('Build') {
            steps {
                echo 'Build Phase'
                //sh 'mvn clean compile'
            }
         
        }
        stage ('Test') { 
            steps {
                echo 'Test Phase'
                //sh 'mvn test'
            }
        }
        stage ('Deploy') { 
            steps {
                echo 'Deploy Phase'
                //sh 'mvn install'
            }
        }
    }           
 }
