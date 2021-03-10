def call(env) {
    build job: 'cleanJob',
        parameters: [
            [ $class: 'StringParameterValue', name: 'ENV', value: "${env}" ]
        ]
}
