#Variables

MVN = ./mvnw

# Targets
.PHONY: build_and_publish_image

# Builds and publishes the image to the Dockerhub
build_and_publish_image:
	$(MVN) compile com.google.cloud.tools:jib-maven-plugin:3.4.3:build