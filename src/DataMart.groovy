package test_utils
enum DataMart {
    SYNAPSE("synapse",
            "${scriptLocation}/synapse_create.sh",
            "${scriptLocation}/synapse_delete.sh",
            "web-synapse-ci-e2e-${new Date().getTime().toString()}",
            "synapse_config_file.json")

    private static scriptLocation = "web/jenkins"
    static DB_CONFIG_FILES_FOLDER = "e2e/tmp"

    final String name
    final String createScriptPath
    final String deleteScriptPath
    final String workspaceName
    final String fileName

    DataMart(String name, String createScriptPath, String deleteScriptPath, String workspaceName, String fileName) {
        this.name = name
        this.createScriptPath = createScriptPath
        this.deleteScriptPath = deleteScriptPath
        this.workspaceName = workspaceName
        this.fileName = fileName
    }

    String getName() {
        this.name
    }

    String getFilePath() {
        "${DB_CONFIG_FILES_FOLDER}/${this.fileName}"
    }

    String getCreateScriptPath() {
        this.createScriptPath
    }

    String getDeleteScriptPath() {
        this.deleteScriptPath
    }

    String getWorkspaceName() {
        this.workspaceName
    }

    String getFileName() {
        this.fileName
    }
}
