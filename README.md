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

Then visit  http://localhost:8080/getzkup/ with your browser.

You can press `Ctrl + c` to stop the jetty server.