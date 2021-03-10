def call(s3_bucket, env) {
    build job: 'down',
        parameters: [
            [ $class: 'StringParameterValue', name: 'REQUESTED_ACTION', value: "${params.REQUESTED_ACTION}" ],
            [ $class: 'StringParameterValue', name: 'GO_IMAGE', value: "${registry}backend:${BUILD_NUMBER}" ],
            [ $class: 'StringParameterValue', name: 'S3_BUCKET_NAME', value: "${s3_bucket}" ],
            [ $class: 'StringParameterValue', name: 'ENV', value: "${env}" ]
        ]
}
