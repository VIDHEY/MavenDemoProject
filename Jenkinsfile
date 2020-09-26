pipeline { 
agent any 
    stages { 
        stage ('Build') {
            steps {
                echo 'Build Phase'
                mvn clean compile
            }
         
        }
        stage ('Test') { 
            steps {
                echo 'Test Phase'
                mvn test
            }
        }
        stage ('Deploy') { 
            steps {
                echo 'Deploy Phase'
                mvn install
            }
        }
    }           
 }
