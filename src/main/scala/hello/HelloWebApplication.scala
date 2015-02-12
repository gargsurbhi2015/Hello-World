package hello

import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author surbhi garg
 * @since 1.0
 */
object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}

@RestController

class HelloWorld
{
 // @RequestMapping(Array{"/"})
 @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
  def sayHello(): String =
  {
    "Hello World!!!"
  }
}
