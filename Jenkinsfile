pipline {
agent any
tools {
maven 'maven'
}
stage {
stage ("Clean up"){
steps {
deletDir()
}
}
stage ("Clone repo"){
steps {
    sh"git clone https://github.com/MaBouz/exp1-spring.git"
}
}
stage ("Generate backend image"){
steps{
dir ("exp1-spring"){
sh"mvn clean install"
sh"docker build -t docexp1-spring."
}
}
}
stage ("Run docker compose"){
steps {
dir("exp1-spring"){
sh "docker compose up -d"
}
}
}
}
}
