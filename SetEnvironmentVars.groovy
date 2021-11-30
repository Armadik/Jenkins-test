def getJenkinsMaster() {
    // env.BUILD_URL contains address which is specified in Jenkins global settings:
    // Jenkins Location -> Jenkins URL
    return env.BUILD_URL.split('/')[2].split(':')[0]
}


env.VERBOSE = "true"
env.EMAIL_ADDRESS_FOR_NOTIFICATIONS = "my-email@gmail.com"

if (isUnix()) {
    env.var1 = "var1"
    // env.ONE_SCRIPT_PATH="/usr/bin/oscript"
} else {
    env.var2 = "var2"
}
env.CONFIGURATION_STORAGE_USER = "ci_automation"