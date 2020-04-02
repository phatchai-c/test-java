pipeline {
  environment {
    docker_registry = "phatchai/test-jenkins"
    docker_registryCredential = 'phatchai'
  }

  agent any  
  stages {
    stage('Cloning git') {
      steps {
        git  'https://github.com/phatchai-c/test-java.git'
        sh "ls -lah"
      }
    }

    stage('Building image') {
      steps {
        script {
          img = docker.build docker_registry
        }
      }
    }

    stage('Deploy Image') {
      steps {
        script {
          docker.withRegistry( 'https://registry.hub.docker.com', docker_registryCredential ) {
              img.push("${BUILD_NUMBER}")
              img.push("latest")
          }
        }
      }
    }
  }
}

