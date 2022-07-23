# docker-jib-upload-sample
Sample project for uploading docker image directly to docker hub project using jib library

run the jib_build.sh to build the docker image using jib and upload it to the docker hub repository.

Changes are required in the following files:
1. pom.xml
Within the plugin tag for jib-maven-plugin, update the to>image to the docker hub registry
Eg: registry.hub.docker.com/kapilbadwal/docker-jib-image:3.0
registry.hub.docker.com/{repository_name}/{image_name}

2. settings.xml
Update the settings.xml with your account username and password inside the ~/.m2 folder (for linux system)

After the above two changes, execute the jib_build.sh

To test, update the docker-compose.yml file with the updated image name and execute to test
