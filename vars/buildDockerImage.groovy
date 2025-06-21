def call(String dockerHubUser, String projectName, String tag) {
    echo "Building ${dockerHubUser}/${projectName}:${tag} image "
    def imageTag = "${dockerHubUser}/${projectName}:${tag}"
    sh "docker build -t ${imageTag} ."
}
