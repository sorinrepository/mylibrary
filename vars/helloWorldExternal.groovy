def call(Map config = [:]) {
    loadlinuxscript(name : 'hello-world.sh')
    sh "pwd"
    sh "ls -al"
    sh "/home/jenkins/workspace/firstpipeline_declarative/hello-world.sh ${config.name} ${config.day}"
}
