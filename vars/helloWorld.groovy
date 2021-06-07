def call (Map config = [:]) {
    sh "echo Hello ${config.dayOfWeek}. Today is ${config.name}."
}
