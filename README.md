# Overview
This is the example application for ZK "Getting Started" articles:
- [Learn ZK in 10 Minutes](https://www.zkoss.org/wiki/ZK_Getting_Started/Learn_ZK_in_10_Minutes)
- [Get ZK Up and Running with MVC](https://www.zkoss.org/wiki/ZK_Getting_Started/Get_ZK_Up_and_Running_with_MVC)
- [Get ZK Up and Running with MVVM](https://www.zkoss.org/wiki/ZK_Getting_Started/Get_ZK_Up_and_Running_with_MVVM)

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

You can press `Ctrl + c` to stop the jetty server.

## With Docker
Assuming you have installed Docker.
1. build an image by `docker build -t gettingstarted .`
2. run `docker run -p 8080:8080 gettingstarted`

It will take a while because it needs to download all required jars.


Then visit  http://localhost:8080/getzkup/ with your browser.