FROM openjdk:17-oracle
RUN mkdir data-shared
COPY target/ms-security.jar ms-security.jar
EXPOSE 8011
ENTRYPOINT ["java","-jar","/ms-security.jar"]