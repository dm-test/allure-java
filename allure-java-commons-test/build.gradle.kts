description = "Allure Java Commons Test Utils"

dependencies {
    api("commons-io:commons-io")
    api(project(":allure-java-commons"))
}

tasks.named<Jar>("jar") {
    manifest {
        attributes(mapOf(
                "Automatic-Module-Name" to "io.qameta.allure.commonstest"
        ))
    }
}
