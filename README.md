# GrizzlyBugReport

Run with: mvn clean install exec:java

With mapping:
```
server.getServerConfiguration().addHttpHandler(new StaticHttpHandler("./client"), "")
server.getServerConfiguration().addHttpHandler(new StaticHttpHandler("./book"), "/blah1", "/blah2");
```
All these urls should return some data:

- http://localhost:9998/blah1/file1.txt
- http://localhost:9998/blah2/file2.txt
- http://localhost:9998/readme.txt
- http://localhost:9998/ccfiles/staticData

Last one is 404 with log message:
FINE: File not found ./client/ccfiles/staticData

With mapping:
```
server.getServerConfiguration().addHttpHandler(new StaticHttpHandler("./client"), "/cl")
server.getServerConfiguration().addHttpHandler(new StaticHttpHandler("./book"), "/blah1", "/blah2");
```
- http://localhost:9998/blah1/file1.txt
- http://localhost:9998/blah2/file2.txt
- http://localhost:9998/cl/readme.txt
- http://localhost:9998/ccfiles/staticData

Everything works as expected



