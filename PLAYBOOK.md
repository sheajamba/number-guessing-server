## COS 460/540 - Computer Networks
# Project 1: Number Guessing Server

# Shea Jamba

This project is written in Java on MacOS.

## How to compile

To compile, open a terminal window. Navigate to the directory containing the Server.java file. Type "javac Server.java". Program is now compiled.

## How to run

To run the program after it has been compiled, type "java Server portnumber" with portnumber being configurable. In my case, I use "java Server 5000".

Once ran, open a second terminal window and type "telnet localhost portnumber" again with portnumber being configurable. I type "telnet localhost 5000". 

Program is now running and the number guessing game can be played.

## My experience with this project

I was very confused at first before I read documentation about telnet. Once I understood how it worked, the project was fairly simple and fun to build. Telnet is no longer included in MacOS, so I had to download it via homebrew, but that was easy enough.