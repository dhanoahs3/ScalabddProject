pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "C//usr//Scalabss//sbt compile"
            }
        }

        stage('Test') {
            steps {
                echo "Testing..."
               sh "C//usr//Scalabss//sbt test"
            }
        }

        stage('Package') {
            steps {
                echo "Packaging..."
               sh "C//usr//Scalabss//sbt package"
            }
        }

    }
}