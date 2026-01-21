pipeline{
    agent any

    stages{
        stage('Print Hello World'){
            steps{
                echo 'Hello, World!'
            }
        }
        // stage('Create Hello File'){
        //     steps{
        //         script{
        //             sh "echo 'Hello' > hello.txt"
        //         }
        //         //echo 'File creation completed'
        //     }

        // }
        // stage('Archive Artifacts'){
        //     steps{
        //         archiveArtifacts artifacts: 'hello.txt'
        //     }

        // }
    }
}