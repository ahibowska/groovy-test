pipeline {
  agent any
  stages {
    stage('Example Build') {
      steps {
          script {
            def MyClass = load "src/test.groovy"
            MyClass.introduceMyself()
          }
      }
    }
  }
}