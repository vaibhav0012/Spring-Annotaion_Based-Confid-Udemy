# Spring-Annotaion_Based-Confid-Udemy

Spring Framework
Annotation based Configuration including XML file
An XML file needs to be created for defining the reuired package which will be used in the project.
@Autowired used for autowiring
@Qualifier used to diffrenciate the implementing method to be used from other existing implemntations.
i.e. we have 4 implementations of FortuneService: 
in order to work on a specific implementation we use @Qualifier("Class name")


Annotation based Configuration without XML file (using java code)
@ComponentScan("PackageName") is used to search the required pacakage.
@Bean --> it is used to create a bean for tyhe defined method and is used for dependency injection.
Files used for NO-XML
1. SportConfig
2. SwimCoach1
3. SwimJavaConfigDemoApp
4. SadFortuneService
5. Coach
6. FortuneService

Other methods used:
@Value --> used to inject values for a variable
@PropertySource --> used to set path for the properties file
@Scope("") --> used to define socpe (singleton or prototype)
