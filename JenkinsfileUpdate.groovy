node {
    stage("Pull Repo"){
        git "https://github.com/Khuslentuguldur/Packer.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}
