Project Description:

- This is a Quiz project, in which questions on different quizzes are fetched.

- We have made two different microservices - questionService & quizService.

- We are fetching questions for a particular quiz by establishing the communication bw both microservice.
We will just call the quizService & quizService will communicate to questionService to fetch all the question of given quizzes.
For the communication purpose we have used the feign client.

- We are using Eureka Server to register all our microservices as Eureka client.

- Load balancer is used to handle the application failure in case when multiple instances are up.

- Api gateway is implemented to direct all the requests on a specific url using routing.
Suppose questionService was running on 8081, quizService on 8082, Eureka server on 8671.
Now if we have implemented API gateway to run on 8083, then we can access the same data using one url.
And API gateway will route the call to particular microservice.
So the url given below works similar:
http://localhost:8083/quiz     ~~ http://localhost:8082/quiz
http://localhost:8083/question ~~ http://localhost:8081/question
http://localhost:8083/quiz/1   ~~ http://localhost:8082/quiz/1
