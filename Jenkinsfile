pipeline {
  environment {
    docker_registry = "phatchai/test-jenkins"
    docker_registryCredential = 'phatchai'
  }

pipeline {
  agent any  
  stages {
    stage('Cloning git') {
      steps {
        git  'https://github.com/phatchai-c/test-java.git'
        sh "ls -lah"
      }
    }
  }
}
stage('Building image') {
      steps {
        script {
          images = docker.build docker_registry
        }
      }
    }

    stage('Deploy Image') {
      steps {
        script {
          docker.withRegistry( 'https://registry.hub.docker.com', registryCredential ) {
              images.push("${BUILD_NUMBER}")
              images.push("latest")
          }
        }
      }
    }
  }
}
