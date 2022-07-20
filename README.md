# Overview
This is the example application for ZK + [dom-to-image](https://github.com/tsayen/dom-to-image).

# How to Run 

Clone the project and launch your command line interface in the project root folder. Execute the following commands based on your environment.

## Maven installed
`mvn jetty:run`

## No Maven installed yet
Run the Maven wrapper below which will download everything needed for you during starting up: 
* Linux / Mac

`./mvnw jetty:run`

* Windows

`mvnw.cmd jetty:run`

Then visit  http://localhost:8080/getzkup/ with your browser.

You can press `Ctrl + c` to stop the jetty server.