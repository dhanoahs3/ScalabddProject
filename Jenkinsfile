pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "C:\\Scalabdd\\sbt compile"
            }
        }

        stage('Test') {
            steps {
                echo "Testing..."
               sh "C://Scalabdd//sbt test"
            }
        }

        stage('Package') {
            steps {
                echo "Packaging..."
               sh  "C:\\Scalabdd\\sbt package"
            }
        }

    }
}