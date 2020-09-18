# Web Service Examples

RMI and SOAP/WSDL examples.

To generate client stub from WSDL, first start the web service by running
the project as a web application (right click on the project name then
Run As -> Run on Server), then on command line, execute the
[wsimport](https://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html)
command (require JDK 1.8) in the project folder as follows:

    wsimport -d src/main/java -p cs520.ws.client -keep -Xnocompile http://localhost:8080/ws/hash?wsdl