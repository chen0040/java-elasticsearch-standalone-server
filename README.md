# java-elasticsearch-standalone-server

Simple java elasticsearch standalone server that can run on both windows and other OS without additional setup

# Feature

* Standalone elasticsearch server that can run without additional installation on Windows, Linux and MacOS.
* Allow shut down of the elasticsearch server remotely via web api call

# Usage
copy the elasticsearch-standalone.jar to your directory and run the following command:

```bash
java -jar elasticsearch-standalone.jar
```

This will start the elasticsearch server at port 6379 and start another web server at port 7379.

To check whether the elasticsearch server is alive, call the following url:

http://localhost:7379/ping

To kill the elasticsearch server remotely, just call the following url:

http://localhost:7379/kill

# Note
In case you want to modify the behavior the elasticsearch server and want to rebuild, you can run the make.ps1 on Windows
or make.sh on Linux or Mac.



