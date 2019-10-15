
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class VanderlandeHomePage extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.vanderlande.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.9,en-US;q=0.8,mr;q=0.7",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en;q=0.9,en-US;q=0.8,mr;q=0.7",
		"sec-fetch-mode" -> "nested-navigate",
		"sec-fetch-site" -> "cross-site",
		"upgrade-insecure-requests" -> "1")

	val headers_2 = Map("Sec-Fetch-Mode" -> "no-cors")

	val headers_4 = Map(
		"Origin" -> "https://www.vanderlande.com",
		"Sec-Fetch-Mode" -> "cors")

	val headers_13 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.9,en-US;q=0.8,mr;q=0.7",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

    val uri1 = "https://www.google-analytics.com"
    val uri2 = "https://use.typekit.net/af"
    val uri4 = "https://stats.g.doubleclick.net/r/collect"
    val uri5 = "https://p.typekit.net/p.css"
    val uri6 = "https://consentcdn.cookiebot.com/sdk/bc.min.html"
    val uri7 = "https://use.fontawesome.com/releases/v5.6.3/webfonts"

	val scn = scenario("VanderlandeHomePage")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri6)
			.headers(headers_1),
            http("request_2")
			.get(uri5 + "?s=1&k=bpj7gva&ht=tk&f=4531.4648.4649.4650.4651.5097&a=2212162&app=typekit&e=css")
			.headers(headers_2),
            http("request_3")
			.get(uri1 + "/analytics.js")
			.headers(headers_2),
            http("request_4")
			.get(uri7 + "/fa-brands-400.woff2")
			.headers(headers_4),
            http("request_5")
			.get(uri7 + "/fa-regular-400.woff2")
			.headers(headers_4),
            http("request_6")
			.get(uri2 + "/824e1d/00000000000000003b9b06df/27/l?primer=7cdcb44be4a7db8877ffa5c0007b8dd865b3bbc383831fe2ea177f62257a9191&fvd=n6&v=3")
			.headers(headers_4),
            http("request_7")
			.get(uri1 + "/r/collect?v=1&_v=j79&a=2067796235&t=pageview&_s=1&dl=https%3A%2F%2Fwww.vanderlande.com%2F&ul=en-gb&de=UTF-8&dt=Vanderlande%20-%20Vanderlande%20-%20Moving%20your%20business%20forward&sd=24-bit&sr=1536x864&vp=1519x380&je=0&_u=AAEAAAAB~&jid=533410463&gjid=110992324&cid=956421858.1561003639&tid=UA-9163595-3&_gid=1979755857.1570596767&_r=1&z=1947208192")
			.headers(headers_2),
            http("request_8")
			.get(uri2 + "/317357/00000000000000003b9b06db/27/l?primer=7cdcb44be4a7db8877ffa5c0007b8dd865b3bbc383831fe2ea177f62257a9191&fvd=i4&v=3")
			.headers(headers_4),
            http("request_9")
			.get(uri4 + "?v=1&aip=1&t=dc&_r=3&tid=UA-9163595-3&cid=956421858.1561003639&jid=533410463&_gid=1979755857.1570596767&gjid=110992324&_v=j79&z=1947208192"),
            http("request_10")
			.get(uri2 + "/01fc0c/00000000000000003b9b06e1/27/l?primer=7cdcb44be4a7db8877ffa5c0007b8dd865b3bbc383831fe2ea177f62257a9191&fvd=n7&v=3")
			.headers(headers_4),
            http("request_11")
			.get(uri2 + "/829fc9/00000000000000003b9b06da/27/l?primer=7cdcb44be4a7db8877ffa5c0007b8dd865b3bbc383831fe2ea177f62257a9191&fvd=n4&v=3")
			.headers(headers_4),
            http("request_12")
			.get(uri2 + "/43c0ba/00000000000000003b9b06de/27/l?primer=7cdcb44be4a7db8877ffa5c0007b8dd865b3bbc383831fe2ea177f62257a9191&fvd=i6&v=3")
			.headers(headers_4),
            http("request_13")
			.get("/images/play.png")
			.headers(headers_13)))

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}