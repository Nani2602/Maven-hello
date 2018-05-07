# maven-springmvc-rest-hw

Simple Spring MVC Hello World Java application prepared for Heroku deployment.

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)

## Invoke REST end-point on Heroku

```sh
curl https://[Heroku App Name].herokuapp.com/hello
```

## Run locally

Java and Maven need to be installed locally. Make sure the [Heroku CLI](https://cli.heroku.com/) is installed.

```sh
git clone https://github.com/htutman/maven-springmvc-rest-hw.git
cd maven-springmvc-rest-hw
mvn clean package
heroku local:start
```

### Invoke REST end-point locally

```sh
curl localhost:5000/hello
```
