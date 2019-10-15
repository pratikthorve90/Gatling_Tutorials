
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ComputerDatabaseTest extends Simulation {

	val httpProtocol = http
		.baseUrl("http://computer-database.gatling.io")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en;q=0.9,en-US;q=0.8,mr;q=0.7",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_6 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en;q=0.9,en-US;q=0.8,mr;q=0.7",
		"Origin" -> "http://computer-database.gatling.io",
		"Upgrade-Insecure-Requests" -> "1")



	val scn = scenario("ComputerDatabaseTest")
		.exec(http("Get_Home_Page")
			.get("/computers")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/assets/stylesheets/bootstrap.min.css"),
            http("request_2")
			.get("/assets/stylesheets/main.css")))
		.pause(4)
		.exec(http("Create_New_Computer")
			.get("/computers/new")
			.headers(headers_0)
			.resources(http("request_4")
			.get("/assets/stylesheets/bootstrap.min.css"),
            http("request_5")
			.get("/assets/stylesheets/main.css")))
		.pause(16)
		.exec(http("Save_Computer")
			.post("/computers")
			.headers(headers_6)
			.formParam("name", "Test_Pratik1")
			.formParam("introduced", "2019-01-01")
			.formParam("discontinued", "")
			.formParam("company", "1")
			.resources(http("request_7")
			.get("/assets/stylesheets/bootstrap.min.css"),
            http("request_8")
			.get("/assets/stylesheets/main.css")))
		.pause(8)
		.exec(http("Search_Computer")
			.get("/computers?f=Test_Pratik1")
			.headers(headers_0)
			.resources(http("request_10")
			.get("/assets/stylesheets/bootstrap.min.css"),
            http("request_11")
			.get("/assets/stylesheets/main.css")))
		.pause(2)
		.exec(http("Display_Computer")
			.get("/computers/710")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)
}