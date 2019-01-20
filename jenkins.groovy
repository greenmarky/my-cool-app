node {
    stage("my stage") {
        echo "my first stage"
        git "https://github.com/greenmarky/my-cool-app.git"
    }
}