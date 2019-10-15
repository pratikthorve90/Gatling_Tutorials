import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MyFirstTest extends Simulation {

  // 1 Common HTTP Configuration

  val httpConf = http
    .baseUrl("http://localhost:8080/app/")
    .header(name = "Accept",value = "application/json")
  // 2 Scenario Definition

  val scn = scenario(scenarioName = "My First Test")
    .exec(http(requestName = "Get all Games")
    .get("videogames"))

  // 3 Load Scenario
    setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)

}
