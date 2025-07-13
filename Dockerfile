# Use official Tomcat base image
FROM tomcat:9.0

# Optional: Remove default apps (docs, manager, examples, etc.)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your .war file into the webapps directory
COPY target/sample.war /usr/local/tomcat/webapps/sample.war

# Expose the Tomcat default port
EXPOSE 8080

# CMD is already set to run Tomcat by default
