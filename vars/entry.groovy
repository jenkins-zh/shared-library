def container_x(String name, String condition, Closure body) {
    var code = sh label: 'check container', returnStatus: true, script: condition

    if (code == 0) {
        if(body) {
            body()
        }
    } else {
        container(name) {
            if(body) {
                body()
            }
        }
    }
}
