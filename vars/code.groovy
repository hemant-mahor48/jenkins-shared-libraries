def call(String url, String branch){
  echo "Stated cloning the code from Git"
  git url: "${url}", branch: "${branch}"
}
