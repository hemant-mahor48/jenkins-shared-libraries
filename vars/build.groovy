def call(String dockerHubUser, String projectName, String tag) {
    echo "Building ${dockerHubUser}/${projectName}:${tage} image "
    def imageTag = "${dockerHubUser}/${projectName}:${tag}"
    sh "docker build -t ${imageTag} ."
}
