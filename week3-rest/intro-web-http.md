# Introduction to Web HTTP - Understanding Web Client - Server Communication

## What is HTTP?

<br>

HTTP or HyperText Transfer Protocol, as the name suggests it is a protocol, it is a set of rules that the server needs
to follow to transmit all kinds of files like images, text, audio, video, and other kinds over the world wide web (www).

The internet is made up of clients and servers. So when you are accessing the internet through a web browser like Google
Chrome, Mozilla, IE, etc. you are sending a request to a web server.

Maybe it is an HTML, CSS, images, video, JSON. You make a request and the server responds, that is the basic
relationship.

<img style="width:40%" src="https://hackernoon.com/_next/image?url=https%3A%2F%2Fcdn.hackernoon.com%2Fimages%2Fjot3yv6.jpg&w=1080&q=75">

<br>

## HTTP is stateless

<br>

HTTP is a stateless protocol. This is because each request is executed independently, without any
knowledge of the requests that were executed before it, which means once the transaction ends the connection between the
browser and the server are lost.

This could be a problem for certain websites where you need to have yourself
authenticated to perform any transaction. But HTTP Cookies make this connection stateful by sending a cookie along with
every HTTP request. Thus, your experience of browsing and performing any transaction over the internet becomes better
and secure.

<br>

## HTTP Methods/Verbs

<br>

So a client makes a request to the server, how would the server know which operation to perform?

HTTP uses methods to inform the server what actions need to be performed when the client sends a request. It is also
called as HTTP verbs. Each of these methods performs the operation required and returns success or failure on its
completion.

The most widely used HTTP methods are GET, POST, PUT & DELETE. There are some others as well, like HEAD, OPTIONS, TRACE.
Let’s understand what the four widely used methods do :

- **GET:**

GET requests are read only, they are used to read the data, retrieve it.

- **POST**

POST requests are used to create or add a new item.

- **PUT**

PUT requests are used to modify or replace the current data with the requested data.

- **DELETE:**

DELETE request is used to delete all the data from the target location requested by the client.


<br>

## HTTP Status Codes

<br>

So a client makes a request to the server, how would the client know about the status of the request?

**They are divided into 5 groups:**

<img src="https://hackernoon.com/_next/image?url=https%3A%2F%2Fhackernoon.com%2Fimages%2FpazJZnCJTqSZxQS4tltZo4Gatbo1-qjup3ybz.jpg&w=1080&q=75">

- **1xx — Informational:** The server has not fully completed the request, it is still thinking and is in a transitional
  phase
- **2xx — Successful:** The server has successfully completed the request
- **3xx — Redirects:** This block is for redirections, it means you requested an address but you were sent somewhere
  else
- **4xx — Client Errors:** There is some error from your side
- **5xx — Server Errors:** There is some error on the server-side.