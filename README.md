# shared-library

Test it with the following Jenkinsfile:

```groovy
library identifier: 'custom-lib@master', retriever: modernSCM(
  [$class: 'GitSCMSource',
   remote: 'https://github.com/jenkins-zh/shared-library'])
 
 pipeline {
  agent any
  
  stages {
    stage('test') {
      steps {
        script {
          entry.container_x('base', 'go version') {
            sh 'echo hello'
          }
        }
      }
    }
  }
 }
 ```
