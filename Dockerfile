#FROM maven:3.9.9-amazoncorretto-17 as Build
#
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#
## => build jar
#RUN mvn package -DskipTest

FROM amazoncorretto:17.0.12

WORKDIR /app

#COPY --from=build /app/target/*.jar app.jar
COPY target/app.jar app.jar
COPY opentelemetry-javaagent.jar opentelemetry-javaagent.jar

ENTRYPOINT java     -javaagent:opentelemetry-javaagent.jar \
                    -jar app.jar
