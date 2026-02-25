def call(Map config = [:]) {
    def scriptcontent = libraryResource "sorin/linux/${config.name}"
    writeFile file: "${config.name}", text: scriptcontent
    sh "chmod a+x ./${config.name}"
}
