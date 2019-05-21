# GraphQL Java Server Example

## Todo

The following are to-do callouts for the application:

* Jenkinsfile creation for build process
* Is there an enterprise library of business objects we can depend on rather than keeping pojo's in the app?

## Build Commands

Gradle is the current dependency/build tool for the project.  Two primary commands:

* `gradle bootRun` will start the spring boot app and initialize the graphql server
* `gradle bootJar` will package the app as a standalone jar

With the jar packaging, the final distribution can be found in `build\libs\graphql-example-0.0.1.jar`.

## Docker Commands

The application can be started in a docker container, without requiring any other infrastructure.  All docker build scripts are contained in the top level bin folder and should be executed at the project root.

```bash

# Execute the build process to create a docker image
sudo bin/docker-build.sh

# Start the container from the latest built image
sudo bin/docker-start.sh

# Stop and remove the container
sudo bin/docker-stop.sh

```

The Dockerfile is a multi-stage build, the first step is using a gradle image to invoke the application build, the second step will be taking the artifact from the gradle build, and initializing it with an openjdk container.  The app is self contained and is using an embedded tomcat container.

## Example Queries

Once initialized, the graphql application will be listening on port 8080 on the subpath "graphql", i.e. http://127.0.0.1:8080/graphql

Two queries are currently implemented.

### Get All Applicants

Get all applicants will retrieve a list of applicants, the query is below:

```graphql
{
  getApplicants {
    emailAddress
    firstName
    lastName
    city
  }
}
```

This will retrieve all applicants, requesting the email, first name, last name and city.

This will request all open applicants

### Get A specific applicant

Retrieving a specific applicant can performed as follows:

```graphql
{
  getApplicant(applicantId: 4){
    emailAddress
    city
    lastName
  }
}
```

This will retrieve applicant id 4 - requesting the email, city and last name.
