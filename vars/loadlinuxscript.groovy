def call(Map config = [:]) {
    def scriptcontent = libraryResource "sorin/linux/${config.name}"
    writeFile file: "${config.name}", text: scriptcontent
    sh "pwd"
    sh "ls -al"
    sh "chmod a+x ./${config.name}"
}
