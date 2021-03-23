# Para gerar imagem docker da aplicação java
passo 1 gerar o build
./mvnw package && java -jar target/validarCpf.jar

https://spring.io/guides/gs/spring-boot-docker/

# passo 2 - gerar o build do Dockerfile
docker build -t didox/validador-cpf-turma-devops -f Dockerfile .

# passo 3 - gerar e startar a imagem
docker run -d -p 8081:8080 --name validador-cpf-turma-devops didox/validador-cpf-turma-devops
