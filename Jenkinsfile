node{
  
  def app
  stage('SCM Checkout'){
     git 'https://github.com/ravivp/dockerimgae.git'
  }
  stage('build project'){
    def MAVEN_HOME= tool name: 'mvn', type: 'maven'
    sh "${MAVEN_HOME}/bin/mvn clean package"
  }
  
   stage('Build image') {
        /* This builds the actual image */

        app = docker.build("valunaik/pipeline_image")
    }

    stage('Test image') {
        
        app.inside {
            echo "Tests passed"
        }
    }

    stage('Push image') {
        /* 
			You would need to first register with DockerHub before you can push images to your account
		*/
        docker.withRegistry('https://registry.hub.docker.com', 'docker_user') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
            } 
                echo "Trying to Push Docker Build to DockerHub"
    }
  
}
