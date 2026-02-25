def call(Map config = [:]) {
    loadlinuxscript(name : 'hello-world.sh')
    sh "pwd"
    sh "ls -al"
    sh "hello-world.sh ${config.name} ${config.day}"
}
