## Implemented
1. Swagger
2. Spring Boot caching
3. Read json from file
4. Parse date from the json file with custom parser



**************************************************************
http://collabedit.com/pdre6

http://collabedit.com/8q89q

******************************* Problem Statement
Problem Statement

Time Limit 90 minutes

Create a log query application. The application should read a log file which has application log data (as key and value) in JSON format.
The log file is shared with this problem

    eg : {"pfm":"DESKTOP", "level":"INFO", "step" : "SEARCH", "timestamp":"2020-11-18 13:24:11.039+0530"}
         {"pfm":"PWA", "level":"DEBUG", "step" : "REVIEW", "timestamp":"2020-11-18 13:24:11.039+0530"}

The application should be able to answer below queries
queries 
    1. find total occurance of a value
    2. find occurance of value1 and value2
    3. find occurance of value1 or value2
    4. above queries in a specified time range

Please have a api as entry point to run the code and set the query value. You can create the req/res formats

Sample Input

DESKTOP

Sample Output

4

Sample Input

DESKTOP and DEBUG

Sample Output

2

Sample Input

DESKTOP or DEBUG

Sample Output

6

Sample Input

DESKTOP  startTime = "2020-11-18 13:00:00" endTime = "2020-11-18 14:00:00"

Sample Output
2

Sample Input
DESKTOP and DEBUG  startTime = "2020-11-18 13:00:00" endTime = "2020-11-18 14:00:00"
Sample Output
1

Sample Input
DESKTOP or DEBUG  startTime = "2020-11-18 13:00:00" endTime = "2020-11-18 19:00:00"
Sample Output
6

Expectations

    Make sure that you have a working and demonstrable code
    Make sure that the code is functionally correct
    Make sure that the algorithm is optimal
    Code should be modular and readable
    Separation of concern should be addressed
    Please do not write everything in a single file
    Code should easily accommodate new requirements and minimal changes
    There should be a REST api from where the code could be easily testable
    [Optional] Write unit tests, if possible
    No need to create a GUI







****  Sample Input 
{"pfm":"DESKTOP", "level":"INFO", "step" : "SEARCH", "timestamp":"2020-11-18 13:24:11.039+0530"}
{"pfm":"DESKTOP", "level":"DEBUG", "step" : "REVIEW", "timestamp":"2020-11-18 13:44:11.039+0530"}
{"pfm":"PWA", "level":"INFO", "step" : "SEARCH", "timestamp":"2020-11-18 14:24:11.039+0530"}
{"pfm":"PWA", "level":"DEBUG", "step" : "REVIEW", "timestamp":"2020-11-18 14:44:11.039+0530"}
{"pfm":"DESKTOP", "level":"INFO", "step" : "SEARCH", "timestamp":"2020-11-18 15:24:11.039+0530"}
{"pfm":"DESKTOP", "level":"DEBUG", "step" : "REVIEW", "timestamp":"2020-11-18 15:44:11.039+0530"}
{"pfm":"PWA", "level":"INFO", "step" : "SEARCH", "timestamp":"2020-11-18 16:24:11.039+0530"}
{"pfm":"PWA", "level":"DEBUG", "step" : "REVIEW", "timestamp":"2020-11-18 16:44:11.039+0530"}