def helloWorld(Map config = [:]) {
    loadlinuxscript(name : "helloWorld.sh")
    sh './helloWorld.sh ${config.name} ${config.day}.'
}