
docker version
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=social-media-user --env MYSQL_PASSWORD=dummypassword --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 mysql:8-oracle
mysqlsh
docker container ls
docker container run -it --rm logiqx/mysql-client
docker container ls
docker run -it --rm --network NETWORK_ID logiqx/mysql-client \\
       mysqladmin ping --wait --connect_timeout=60 --host=HOSTNAME --user=USERNAME --password
mysqlsh

brew install watch
curl http://localhost:8000/sample-api
watch curl http://localhost:8000/sample-api
watch -n 0.1 curl http://localhost:8000/sample-api
watch -n 0.1 curl http://localhost:8000/sample-api1
watch -n 1 curl http://localhost:8000/sample-api1
docker --version
docker-machine ip
docker ip
docker container ls
docker images
history
docker container ls -a
docker search mysql
docker search postgres
docker scout quickview postgres
docker run postgres
docker container ls -a
clear
docker container ls
docker events
history
docker images -al
docker images -a
docker run -p 8000:8000 currency-exchange-service
docker run -p 8000:8000 currency-exchange-service:0.0.1-SNAPSHOT
docker version
docker-compose version
docker images -a
docker-compose up
docker-compose up
docker tag naming-server:0.0.1-SNAPSHOT karaththai/naming-server:0.0.1-SNAPSHOT
docker push karaththai/naming-server:0.0.1-SNAPSHOT
docker tag api-gateway:0.0.1-SNAPSHOT karaththai/api-gateway:0.0.1-SNAPSHOT
docker push karaththai/api-gateway:0.0.1-SNAPSHOT
docker images -a
docker tag currency-conversion-service:0.0.1-SNAPSHOT currency-conversion-service:0.0.1-SNAPSHOT
docker push currency-conversion-service:0.0.1-SNAPSHOT
docker tag currency-conversion-service:0.0.1-SNAPSHOT karaththai/currency-conversion-service:0.0.1-SNAPSHOT
docker tag currency-conversion-service:0.0.1-SNAPSHOT currency-conversion-service:0.0.1-SNAPSHOT
docker push karaththai/currency-conversion-service:0.0.1-SNAPSHOT
docker tag currency-exchange-service:0.0.1-SNAPSHOT currency-exchange-service:0.0.1-SNAPSHOT
docker push karaththai/currency-exchange-service:0.0.1-SNAPSHOT
docker tag currency-exchange-service:0.0.1-SNAPSHOT karaththai/currency-exchange-service:0.0.1-SNAPSHOT
docker push karaththai/currency-exchange-service:0.0.1-SNAPSHOT
exit
docker container ls
docker containser top
docker container top
docker stats
docker stats
history
docker search zipkin
docker run -p 9411:9411 openzipkin/zipkin
docker-compose --version
docker tag currency-conversion-service:0.0.1-SNAPSHOT currency-conversion-service:0.0.1-SNAPSHOT
docker push currency-conversion-service:0.0.1-SNAPSHOT
docker tag currency-conversion-service:0.0.1-SNAPSHOT karaththai/currency-conversion-service:0.0.1-SNAPSHOT
docker push karaththai/currency-conversion-service:0.0.1-SNAPSHOT
docker tag currency-conversion-service:0.0.1-SNAPSHOT karaththai/currency-conversion-service:0.0.1-SNAPSHOT
docker push karaththai/currency-conversion-service:0.0.1-SNAPSHOT
