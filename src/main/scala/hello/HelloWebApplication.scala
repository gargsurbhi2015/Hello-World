package hello

//import org.springframework.boot.SpringApplication
//import org.springframework.web.bind.annotation.{RequestMapping, RestController}
//import org.springframework.web.bind.annotation.RequestMethod
//import org.springframework.http.HttpMethod

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.http.HttpMethod

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
