# 서버를 구동시킬 자바를 받아옵니다.
FROM openjdk:8
RUN mkdir /app
ADD build/libs/pjdocker8-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "/app/pjdocker8-0.0.1-SNAPSHOT.jar"]
