pipeline {
     agent any
     triggers { 
          pollSCM('* * * * *')
     }
     // tools { 
     // gradle 'MójGradle'
     // }
     stages {
          stage("Compile") {
               steps {
                    sh "./gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"
               }
          }
          stage("Code coverage") {
               steps {
                    sh "./gradlew jacocoTestReport"
                    publishHTML (target: [
                         reportDir: 'build/reports/jacoco/test/html',
                         reportFiles: 'index.html',
                         reportName: 'Jacoco Report'
                         ])
                    sh "./gradlew jacocoTestCoverageVerification"
     }
}
          stage("Clean workspace") {
               steps {
                    deleteDir()
}
}
     }
}
