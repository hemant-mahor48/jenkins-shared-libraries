def call(String credentialsId, String dockerHubUser, String projectName, String tag) {
            echo "Pushing ${dockerHubUser}/${projectName}:${tag} to Docker Hub"
            withCredentials([usernamePassword(
                credentialsId: credentialsId,
                usernameVariable: 'DOCKER_USER',
                passwordVariable: 'DOCKER_PASS'
            )]) {
                sh "docker login -u ${env.DOCKER_USER} -p ${env.DOCKER_PASS}"
                sh "docker tag ${projectName}:${tag} ${dockerHubUser}/${projectName}:${tag}"
                sh "docker push ${dockerHubUser}/${projectName}:${tag}"
    }
}
