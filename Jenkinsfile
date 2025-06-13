pipeline {
    agent any
    stages {
        stage('CI: Clone') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/lmd17072005/Exercise.git'
            }
        }
        stage('Build: Copy HTML') {
            steps {
                bat 'copy index.html C:\\inetpub\\wwwroot\\mywebsite'
            }
        }
        stage('CD: Create IIS Website') {
            steps {
                bat '''
                    powershell -Command "Import-Module WebAdministration; \
                    New-Website -Name 'MyWebsite' -PhysicalPath 'C:\\inetpub\\wwwroot\\mywebsite' -Port 80 -HostHeader 'localhost' -Force"
                '''
            }
        }
        stage('CD: Publish and Open') {
            when {
                expression { currentBuild.resultIsBetterOrEqualTo('SUCCESS') }
            }
            steps {
                bat 'start http://localhost'
                echo 'Website deployed and opened successfully!'
            }
        }
    }
    post {
        success { echo 'Pipeline completed successfully!' }
        failure { echo 'Pipeline failed!' }
    }
}
