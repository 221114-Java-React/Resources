# Docker Postgres Commands

---

## Pull Image

- docker pull [OPTIONS] NAME[:TAG|@DIGEST]

**Example:**
```docker pull postgres:latest```

---

## How To Create Image Container

- docker run [OPTIONS] IMAGE [COMMAND] [ARG...]

**Example:** ```docker run --name local-db -p 5432:5432 -e POSTGRES_PASSWORD=revature -d postgres```

- ```--name: give container a name```
- ```-p: port of container```
- ```-e: set env variable```
- ```-d: detach from container```

---

## How To Start Container

- docker start [OPTIONS] CONTAINER [CONTAINER...]

**Example:** ```docker start my_container```

---

## Stop Docker Container

- docker stop [OPTIONS] CONTAINER [CONTAINER...]

Example: ```docker stop my_container```

---

## Remove Docker Container

- docker rm [OPTIONS] CONTAINER [CONTAINER...]

**Example:** ```docker rm my_container```

---

## See Docker Images

```docker image ls```

---

## Remove Docker images

- docker image rm [OPTIONS] IMAGE [IMAGE...]

**Example:** ```docker image rm postgres```

---

## See Docker Containers

- docker container ls [OPTIONS]