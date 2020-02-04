node{
  stage('SCM Checkout'){
     git 'https://github.com/ravivp/dockerimgae.git'
  }
  stage('build project'){
    def MAVEN_HOME= tool name: 'mvn', type: 'maven'
    sh "${MAVEN_HOME}/bin/mvn clean package"
  }
}
