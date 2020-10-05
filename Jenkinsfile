node {
stage('scm checkout'){
 
       git 'https://github.com/mebhatt/Gurucucumber'
      }
      stage('Compile-package'){
       
      def MavHome = tool name: 'MAVEN_HOME', type: 'maven'
      sh "${MavHome}/bin/mvn test"

      


      
      
      }
}
