def call() {
    sh "chmod -R u+wx ./"
    sh "echo $GHOSTVAR"
    sh "echo this is demo"
}
