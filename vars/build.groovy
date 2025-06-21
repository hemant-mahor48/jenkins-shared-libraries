def call(String dockerHubUser, String projectName, String tag) {
    def imageTag = "${dockerHubUser}/${projectName}:${tag}"
    sh "docker build -t ${imageTag} ."
}
