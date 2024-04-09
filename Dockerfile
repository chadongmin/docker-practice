
#Java 17 version
FROM openjdk:17-jdk

# build.lib/하위에 있는 jar파일을 변수로 설정
ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]


