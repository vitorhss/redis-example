# Redis Example #
Exemplo de aplicação utilizando Spring Boot / Spring Data / Redis 

# Tecnologias Aplicadas #
 - Java 1.7
 - Maven 
 - Spring (Boot, Core, Data) 
 - Redis 4.0.8 
 - Vagrant
 
# Instruções de Execução #
  - Clone do projeto 
  - Import File > Import... > Maven > Existing Maven Projects
  - Start do Redis 
	  Unix: - wget http://download.redis.io/releases/redis-4.0.8.tar.gz
	        - tar xzf redis-4.0.8.tar.gz
			- cd redis-4.0.8
			- make
			- src/redis-server
  - Start da aplicação 
	mvn spring-boot:run

# Observações #
Oficialmente, não há uma versão do redis que rode em windows, porém, há uma versão que é mantidada pela própria comunidade.
https://github.com/MicrosoftArchive/redis

# Referências #
https://redis.io/
https://github.com/spring-projects/spring-data-examples/tree/master/redis
http://caseyscarborough.com/blog/2014/12/18/caching-data-in-spring-using-redis/
https://github.com/mdevilliers/vagrant-redis