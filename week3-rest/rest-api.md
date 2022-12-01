# What is a REST API?

<br>

## Overview

<br>

A REST API (also known as RESTful API) is an application programming interface (API or web API) that conforms to the
constraints of REST architectural style and allows for interaction with RESTful web services. REST stands for
representational state transfer.

<br>

## What's an API?

<br>

An API is a set of definitions and protocols for building and integrating application software. It’s sometimes referred
to as a contract between an information provider and an information user—establishing the content required from the
consumer (the call) and the content required by the producer (the response).

For example, the API design for a weather
service could specify that the user supply a zip code and that the producer reply with a 2-part answer, the first being
the high temperature, and the second being the low.

In other words, if you want to interact with a computer or system to retrieve information or perform a function, an API
helps you communicate what you want to that system, so it can understand and fulfill the request.

You can think of an API as a mediator between the users or clients and the resources or web services they want to get.
It’s also a way for an organization to share resources and information while maintaining security, control, and
authentication—determining who gets access to what.

<br>

## REST

<br>

REST is a set of architectural constraints, not a protocol or a standard. API developers can implement REST in a variety
of ways.

RESTful API design was defined by Dr. Roy Fielding. In order to be a true RESTful
API, a web service must adhere to the following six REST architectural constraints:

- Use of a uniform interface (UI). Resources should be uniquely identifiable through a single URL, and only by using the
  underlying methods of the network protocol, such as DELETE, PUT and GET with HTTP, should it be possible to manipulate
  a resource.


- Client-server based. There should be a clear delineation between the client and server. UI and request-gathering
  concerns are the client's domain. Data access, workload management and security are the server's domain. This loose
  coupling of the client and server enables independence.


- Stateless operations. All client-server operations should be stateless, and any state management that is required
  should take place on the client, not the server.


- RESTful resource caching. All resources should allow caching unless explicitly indicated that caching is not possible.
    - GET requests should be cachable by default – until a special condition arises. Usually, browsers treat all GET
      requests as cacheable.
    - POST requests are not cacheable by default but can be made cacheable if either an Expires header or a
    - Cache-Control header with a directive, to explicitly allows caching, is added to the response.
    - Responses to PUT and DELETE requests are not cacheable at all.


- Layered system. REST allows for an architecture composed of multiple layers of servers.


- Code on demand. Most of the time, a server will send back static representations of resources in the form of XML or
  JSON. However, when necessary, servers can send executable code to the client.

Though the REST API has these criteria to conform to, it is still considered easier to use than a prescribed protocol
like SOAP (Simple Object Access Protocol), which has specific requirements like XML messaging, and built-in security and
transaction compliance that make it slower and heavier.

<br>

## Richardson Maturity Model

<br>

The Richardson Maturity Model is a way to grade your API according to the constraints of REST. The better your API
adheres to these constraints, the higher its score is. The Richardson Maturity Model knows 4 levels (0-3), where level 3
designates a truly RESTful API.

<br>

<img style="width:70%" src="https://restfulapi.net/wp-content/uploads/Richardson-Maturity-Model.jpg">