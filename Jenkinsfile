node {
stage('scm checkout'){
 
       git 'https://github.com/mebhatt/Gurucucumber'
      }
      stage('Compile-package'){
       
      def MavHome = tool name: 'MAVEN_HOME', type: 'maven'
<<<<<<< HEAD
      sh "${MavHome}/bin/mvn test"
=======

      sh "mvn clean install"

>>>>>>> 715194f8b0ef4b69a6868a0b8e465020bfb75029
      
      }
}
