def call(Map config = [:]) {
    loadlinuxscript(name : "hello-world.sh")
    sh './hello-world.sh ${config.name} ${config.day}.'
}
