node{
  stage('SCM Checkout'){
     git 'https://github.com/ravivp/dockerimgae.git'
  }
  stage('build project'){
  sh 'mvn clean package'
  }
}
